package net.rybastefek.vanillamusicdiscs.screen.slot;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class MusicDiscInputSlot extends SlotItemHandler {
    public MusicDiscInputSlot(IItemHandler itemHandler, int index, int x, int y) {
        super(itemHandler, index, x, y);
    }

    @Override
    public boolean mayPlace(ItemStack stack) {
        // Only music discs input
        return stack.getItem() instanceof RecordItem;
    }
}