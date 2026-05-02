package net.rybastefek.vanillamusicdiscs;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.core.Holder;
import net.minecraft.core.MappedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadStructurePlacement;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.rybastefek.vanillamusicdiscs.block.ModBlocks;
import net.rybastefek.vanillamusicdiscs.block.entity.ModBlockEntities;
import net.rybastefek.vanillamusicdiscs.items.ModCreativeTab;
import net.rybastefek.vanillamusicdiscs.items.ModItems;
import net.rybastefek.vanillamusicdiscs.screen.ModMenuTypes;
import net.rybastefek.vanillamusicdiscs.screen.MusicDiscsTableScreen;
import net.rybastefek.vanillamusicdiscs.sounds.ModSounds;
import net.rybastefek.vanillamusicdiscs.world.structure.ModStructures;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;
import java.util.Map;


@Mod(VanillaMusicDiscs.MOD_ID)
public class VanillaMusicDiscs {
    public static final String MOD_ID = "vanillamusicdiscs";

    public static final Logger LOGGER = LogManager.getLogger();

    public VanillaMusicDiscs() {
        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, ModConfig.SPEC);

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModCreativeTab.register(eventBus);
        ModBlocks.register(eventBus);
        ModBlockEntities.register(eventBus);
        ModSounds.register(eventBus);
        ModStructures.register(eventBus);
        ModMenuTypes.register(eventBus);

        eventBus.addListener(this::commonSetup);
        eventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Party time!");
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        MenuScreens.register(ModMenuTypes.MUSIC_DISCS_TABLE_MENU.get(), MusicDiscsTableScreen::new);
    }

    @SubscribeEvent
    public void onServerAboutToStart(ServerAboutToStartEvent event) {
        RegistryAccess registryAccess = event.getServer().registryAccess();
        Registry<StructureSet> registry = registryAccess.registryOrThrow(Registries.STRUCTURE_SET);

        replaceSpread(registry, "musical_house_plains",  ModConfig.PLAINS_SPACING.get(),  ModConfig.PLAINS_SEPARATION.get(),  870456637);
        replaceSpread(registry, "musical_house_desert",  ModConfig.DESERT_SPACING.get(),  ModConfig.DESERT_SEPARATION.get(),  870456645);
        replaceSpread(registry, "musical_house_taiga",   ModConfig.TAIGA_SPACING.get(),   ModConfig.TAIGA_SEPARATION.get(),   870456687);
    }

    private void replaceSpread(Registry<StructureSet> registry, String name, int spacing, int separation, int salt) {
        try {
            Field frozenField = MappedRegistry.class.getDeclaredField("frozen");
            frozenField.setAccessible(true);
            frozenField.set(registry, false);

            ResourceLocation id = new ResourceLocation(MOD_ID, name);
            Holder.Reference<StructureSet> holder = registry.getHolder(
                    ResourceKey.create(Registries.STRUCTURE_SET, id)
            ).orElse(null);

            if (holder == null) {
                LOGGER.warn("Structure set {} not found!", id);
                frozenField.set(registry, true);
                return;
            }

            StructureSet oldSet = holder.value();
            StructureSet newSet = new StructureSet(
                    oldSet.structures(),
                    new RandomSpreadStructurePlacement(spacing, separation, RandomSpreadType.LINEAR, salt)
            );

            Field byValueField = MappedRegistry.class.getDeclaredField("byValue");
            byValueField.setAccessible(true);
            Map<StructureSet, Holder.Reference<StructureSet>> byValue =
                    (Map<StructureSet, Holder.Reference<StructureSet>>) byValueField.get(registry);
            byValue.remove(oldSet);

            holder.bindValue(newSet);
            byValue.put(newSet, holder);

            frozenField.set(registry, true);

        } catch (Exception e) {
            LOGGER.error("Failed to replace placement for {}", name, e);
        }
    }
}