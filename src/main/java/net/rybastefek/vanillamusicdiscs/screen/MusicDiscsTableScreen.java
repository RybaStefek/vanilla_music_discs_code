package net.rybastefek.vanillamusicdiscs.screen;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.rybastefek.vanillamusicdiscs.VanillaMusicDiscs;

public class MusicDiscsTableScreen extends AbstractContainerScreen<MusicDiscsTableMenu> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(VanillaMusicDiscs.MOD_ID, "textures/gui/music_discs_table_gui.png");

    public MusicDiscsTableScreen(MusicDiscsTableMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void renderBg(GuiGraphics pGuiGraphics, float pPartialTick, int pMouseX, int pMouseY) {
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        pGuiGraphics.blit(TEXTURE, x, y, 0, 0, imageWidth, imageHeight);

        if (menu.getProgress() > 0) {
            int progress = menu.getProgress();
            int maxProgress = menu.getMaxProgress();
            int arrowHeight = (int) (25 * ((float) progress / maxProgress));

            pGuiGraphics.blit(TEXTURE, x + 102, y + 41, 176, 0, 6, arrowHeight);
        }
    }

    @Override
    public void render(GuiGraphics pGuiGraphics, int mouseX, int mouseY, float delta) {
        renderBackground(pGuiGraphics);
        super.render(pGuiGraphics, mouseX, mouseY, delta);
        renderTooltip(pGuiGraphics, mouseX, mouseY);
    }
}