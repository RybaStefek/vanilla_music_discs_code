package net.rybastefek.vanillamusicdiscs;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.rybastefek.vanillamusicdiscs.block.ModBlocks;
import net.rybastefek.vanillamusicdiscs.block.entity.ModBlockEntities;
import net.rybastefek.vanillamusicdiscs.items.ModItems;
import net.rybastefek.vanillamusicdiscs.screen.ModMenuTypes;
import net.rybastefek.vanillamusicdiscs.screen.MusicDiscsTableScreen;
import net.rybastefek.vanillamusicdiscs.sounds.ModSounds;
import net.rybastefek.vanillamusicdiscs.world.structure.ModStructures;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(VanillaMusicDiscs.MOD_ID)
public class VanillaMusicDiscs {
    public static final String MOD_ID = "vanillamusicdiscs";

    public static final Logger LOGGER = LogManager.getLogger();


    public VanillaMusicDiscs() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
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
}