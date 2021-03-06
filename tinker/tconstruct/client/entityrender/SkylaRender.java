package tinker.tconstruct.client.entityrender;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

import tinker.tconstruct.entity.Skyla;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class SkylaRender extends RenderLiving
{
    /** The creeper model. */
    private ModelBase creeperModel = new SkylaModel();

    public SkylaRender()
    {
        super(new SkylaModel(), 0.5F);
    }

    /**
     * A method used to render a creeper's powered form as a pass model.
     */
    protected int renderCreeperPassModel(Skyla par1EntityCreeper, int par2, float par3)
    {

        return -1;
    }

    protected int func_77061_b(Skyla par1EntityCreeper, int par2, float par3)
    {
        return -1;
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    /*protected void preRenderCallback(EntityLiving par1EntityLiving, float par2)
    {
        this.updateCreeperScale((Skyla)par1EntityLiving, par2);
    }*/

    /**
     * Returns an ARGB int color back. Args: entityLiving, lightBrightness, partialTickTime
     */
    protected int getColorMultiplier(EntityLiving par1EntityLiving, float par2, float par3)
    {
        return super.getColorMultiplier(par1EntityLiving, par2, par3);
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityLiving par1EntityLiving, int par2, float par3)
    {
        return this.renderCreeperPassModel((Skyla)par1EntityLiving, par2, par3);
    }

    protected int inheritRenderPass(EntityLiving par1EntityLiving, int par2, float par3)
    {
        return this.func_77061_b((Skyla)par1EntityLiving, par2, par3);
    }
}
