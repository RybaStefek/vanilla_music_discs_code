package net.rybastefek.vanillamusicdiscs.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rybastefek.vanillamusicdiscs.VanillaMusicDiscs;
import net.rybastefek.vanillamusicdiscs.block.ModBlocks;
import net.rybastefek.vanillamusicdiscs.block.entity.custom.MusicDiscsTableBlockEntity;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, VanillaMusicDiscs.MOD_ID);

    public static final RegistryObject<BlockEntityType<MusicDiscsTableBlockEntity>> MUSIC_DISCS_TABLE_ENTITY =
            BLOCK_ENTITIES.register("music_discs_table_block_entity", () ->
                    BlockEntityType.Builder.of(MusicDiscsTableBlockEntity::new,
                            ModBlocks.MUSIC_DISCS_TABLE.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}