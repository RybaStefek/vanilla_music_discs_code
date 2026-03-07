package net.rybastefek.vanillamusicdiscs.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.rybastefek.vanillamusicdiscs.block.entity.ModBlockEntities;
import net.rybastefek.vanillamusicdiscs.items.ModItems;
import net.rybastefek.vanillamusicdiscs.screen.MusicDiscsTableMenu;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public class MusicDiscsTableBlockEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(3) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    private int progress = 0;
    private int maxProgress = 78;

    private static final Map<Item, Item> RECIPES = new HashMap<>();

    static {
        RECIPES.put(Items.ORANGE_DYE, ModItems.AERIE.get());
        RECIPES.put(Items.ORANGE_WOOL, ModItems.ANCESTRY.get());
        RECIPES.put(Items.DIAMOND, ModItems.ARIA_MATH.get());
        RECIPES.put(Items.WATER_BUCKET, ModItems.AXOLOTL.get());
        RECIPES.put(Items.WOODEN_PICKAXE, ModItems.BEGINNING.get());
        RECIPES.put(Items.BLUE_ORCHID, ModItems.CHRIS.get());
        RECIPES.put(Items.PINK_TULIP, ModItems.CHRYSOPOEIA.get());
        RECIPES.put(Items.BLUE_DYE, ModItems.CLARK.get());
        RECIPES.put(Items.PURPLE_WOOL, ModItems.DANNY.get());
        RECIPES.put(Items.BLACK_CANDLE, ModItems.DEATH.get());
        RECIPES.put(Items.BONE, ModItems.DOG.get());
        RECIPES.put(Items.OAK_DOOR, ModItems.DOOR.get());
        RECIPES.put(Items.ORANGE_BED, ModItems.DREITON.get());
        RECIPES.put(Items.GREEN_CANDLE, ModItems.DROOPY_LIKES_RICOCHET.get());
        RECIPES.put(Items.YELLOW_DYE, ModItems.DROOPY_LIKES_YOUR_FACE.get());
        RECIPES.put(Items.SPONGE, ModItems.DRY_HANDS.get());
        RECIPES.put(Items.WHITE_DYE, ModItems.EXCUSE.get());
        RECIPES.put(Items.CAMPFIRE, ModItems.FIREBUGS.get());
        RECIPES.put(Items.PURPLE_CANDLE, ModItems.FLOATING_DREAM.get());
        RECIPES.put(Items.BROWN_BED, ModItems.HAGGSTROM.get());
        RECIPES.put(Items.AMETHYST_SHARD, ModItems.INFINITE_AMETHYST.get());
        RECIPES.put(Items.GOLD_INGOT, ModItems.KEY.get());
        RECIPES.put(Items.ORANGE_CARPET, ModItems.LABYRINTHINE.get());
        RECIPES.put(Items.PURPLE_DYE, ModItems.LEFT_TO_BLOOM.get());
        RECIPES.put(Items.GRAY_WOOL, ModItems.LIVING_MICE.get());
        RECIPES.put(Items.STRING, ModItems.MICE_ON_VENUS.get());
        RECIPES.put(Items.GRASS_BLOCK, ModItems.MINECRAFT.get());
        RECIPES.put(Items.MOSS_BLOCK, ModItems.MOOG_CITY.get());
        RECIPES.put(Items.SUNFLOWER, ModItems.ONE_MORE_DAY.get());
        RECIPES.put(Items.PINK_DYE, ModItems.RUBEDO.get());
        RECIPES.put(Items.PINK_BED, ModItems.SO_BELOW.get());
        RECIPES.put(Items.LIME_BED, ModItems.SUBWOOFER_LULLABY.get());
        RECIPES.put(Items.POPPY, ModItems.SWEDEN.get());
        RECIPES.put(Items.BOOK, ModItems.WENDING.get());
        RECIPES.put(Items.WET_SPONGE, ModItems.WET_HANDS.get());
    }

    public ContainerData data = new ContainerData() {
        @Override
        public int get(int index) {
            return switch (index) {
                case 0 -> MusicDiscsTableBlockEntity.this.progress;
                case 1 -> MusicDiscsTableBlockEntity.this.maxProgress;
                default -> 0;
            };
        }

        @Override
        public void set(int index, int value) {
            switch (index) {
                case 0 -> MusicDiscsTableBlockEntity.this.progress = value;
                case 1 -> MusicDiscsTableBlockEntity.this.maxProgress = value;
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    };

    public MusicDiscsTableBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.MUSIC_DISCS_TABLE_ENTITY.get(), pWorldPosition, pBlockState);
    }

    @Override
    public Component getDisplayName() {
        return Component.literal("Music Discs Table");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new MusicDiscsTableMenu(pContainerId, pInventory, this, this.data);
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (cap == ForgeCapabilities.ITEM_HANDLER) {
            return lazyItemHandler.cast();
        }
        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        nbt.put("inventory", itemHandler.serializeNBT());
        nbt.putInt("music_discs_table.progress", progress);
        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        progress = nbt.getInt("music_discs_table.progress");
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, MusicDiscsTableBlockEntity blockEntity) {
        if (level.isClientSide()) {
            return;
        }

        if (blockEntity.hasRecipe()) {
            blockEntity.progress++;
            blockEntity.setChanged();

            if (blockEntity.progress >= blockEntity.maxProgress) {
                blockEntity.craftItem();
                blockEntity.progress = 0;
            }
        } else {
            blockEntity.progress = 0;
            blockEntity.setChanged();
        }
    }

    private boolean hasRecipe() {
        ItemStack disc = this.itemHandler.getStackInSlot(0);
        ItemStack material = this.itemHandler.getStackInSlot(1);
        ItemStack output = this.itemHandler.getStackInSlot(2);

        if (disc.isEmpty() || material.isEmpty()) {
            return false;
        }
        if (!(disc.getItem() instanceof RecordItem)) {
            return false;
        }
        if (!RECIPES.containsKey(material.getItem())) {
            return false;
        }
        if (!output.isEmpty()) {
            return false;
        }
        return true;
    }

    private void craftItem() {
        ItemStack material = this.itemHandler.getStackInSlot(1);
        ItemStack output = this.itemHandler.getStackInSlot(2);

        Item resultItem = RECIPES.get(material.getItem());
        if (resultItem == null) return;
        if (!output.isEmpty()) return;

        this.itemHandler.setStackInSlot(2, new ItemStack(resultItem, 1));
        this.itemHandler.extractItem(0, 1, false);
        this.itemHandler.extractItem(1, 1, false);
    }
}