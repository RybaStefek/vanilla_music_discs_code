package net.rybastefek.vanillamusicdiscs.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.BuiltInRegistries;
import net.rybastefek.vanillamusicdiscs.VanillaMusicDiscs;
import net.rybastefek.vanillamusicdiscs.block.ModBlocks;
import net.rybastefek.vanillamusicdiscs.block.entity.custom.MusicDiscsTableBlockEntity;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, VanillaMusicDiscs.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MusicDiscsTableBlockEntity>> MUSIC_DISCS_TABLE_ENTITY =
            BLOCK_ENTITIES.register("music_discs_table_block_entity", () ->
                    BlockEntityType.Builder.of(MusicDiscsTableBlockEntity::new,
                            ModBlocks.MUSIC_DISCS_TABLE.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

    @net.neoforged.bus.api.SubscribeEvent
    public static void registerCapabilities(net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(
                net.neoforged.neoforge.capabilities.Capabilities.ItemHandler.BLOCK,
                MUSIC_DISCS_TABLE_ENTITY.get(),
                (blockEntity, side) -> blockEntity.itemHandler
        );
    }
}