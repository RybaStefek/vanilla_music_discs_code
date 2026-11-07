package net.rybastefek.vanillamusicdiscs.world.structure;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
public class ModStructures {
    public static void register(IEventBus eventBus) {
        NeoForge.EVENT_BUS.addListener(ModStructures::onServerStarting);
    }

    private static void onServerStarting(ServerStartingEvent event) {

    }
}