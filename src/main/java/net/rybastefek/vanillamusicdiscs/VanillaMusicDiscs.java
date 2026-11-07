package net.rybastefek.vanillamusicdiscs;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
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


@Mod(VanillaMusicDiscs.MOD_ID)
public class VanillaMusicDiscs {
    public static final String MOD_ID = "vanillamusicdiscs";
    public static final Logger LOGGER = LogManager.getLogger();

    public VanillaMusicDiscs(IEventBus eventBus, ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.COMMON, net.rybastefek.vanillamusicdiscs.ModConfig.SPEC);

        ModItems.register(eventBus);
        ModCreativeTab.register(eventBus);
        ModBlocks.register(eventBus);
        ModBlockEntities.register(eventBus);
        ModSounds.register(eventBus);
        ModStructures.register(eventBus);
        ModMenuTypes.register(eventBus);

        eventBus.addListener(this::commonSetup);
        eventBus.addListener(this::registerScreens);
        eventBus.addListener(ModBlockEntities::registerCapabilities);
    }

    private void registerScreens(RegisterMenuScreensEvent event) {
        event.register(
                ModMenuTypes.MUSIC_DISCS_TABLE_MENU.get(),
                MusicDiscsTableScreen::new
        );
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Party time!");
    }
}