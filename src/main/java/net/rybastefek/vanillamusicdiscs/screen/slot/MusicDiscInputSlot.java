package net.rybastefek.vanillamusicdiscs.screen.slot;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.SlotItemHandler;

public class MusicDiscInputSlot extends SlotItemHandler {
    public MusicDiscInputSlot(IItemHandler itemHandler, int index, int x, int y) {
        super(itemHandler, index, x, y);
    }

    @Override
    public boolean mayPlace(ItemStack itemStack) {
        // Only music discs input
        return itemStack.has(DataComponents.JUKEBOX_PLAYABLE);
    }
}