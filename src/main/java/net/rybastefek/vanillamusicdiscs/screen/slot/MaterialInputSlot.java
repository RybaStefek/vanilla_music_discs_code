package net.rybastefek.vanillamusicdiscs.screen.slot;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class MaterialInputSlot extends SlotItemHandler {
    public MaterialInputSlot(IItemHandler itemHandler, int index, int x, int y) {
        super(itemHandler, index, x, y);
    }

    @Override
    public boolean mayPlace(ItemStack stack) {
        // Not music disc
        return !(stack.getItem() instanceof RecordItem);
    }
}