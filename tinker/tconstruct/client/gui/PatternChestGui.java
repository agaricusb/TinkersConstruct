package tinker.tconstruct.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import tinker.tconstruct.logic.PatternChestLogic;

public class PatternChestGui extends GuiContainer
{
    public PatternChestLogic logic;

    public PatternChestGui(InventoryPlayer inventoryplayer, PatternChestLogic holder, World world, int x, int y, int z)
    {
        super(holder.getGuiContainer(inventoryplayer, world, x, y, z));
        logic = holder;
        xSize = 194;
        ySize = 168;
    }

    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        fontRenderer.drawString(StatCollector.translateToLocal("inventory.PatternChest"), 60, 6, 0x404040);
        fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 17, (ySize - 96) + 2, 0x404040);
    }

    protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
    {
        int texID = mc.renderEngine.getTexture("/tinkertextures/gui/patternchest.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(texID);
        int cornerX = (width - xSize) / 2;
        int cornerY = (height - ySize) / 2;
        drawTexturedModalRect(cornerX, cornerY, 0, 0, xSize, ySize);
    }
}
