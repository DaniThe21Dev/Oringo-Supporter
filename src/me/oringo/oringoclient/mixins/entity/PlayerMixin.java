// 
// Decompiled by Procyon v0.5.36
// 

package me.oringo.oringoclient.mixins.entity;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.FoodStats;
import net.minecraft.stats.StatBase;
import net.minecraft.entity.player.InventoryPlayer;
import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ EntityPlayer.class })
public abstract class PlayerMixin extends EntityLivingBaseMixin
{
    @Shadow
    public PlayerCapabilities field_71075_bZ;
    @Shadow
    private int field_71072_f;
    @Shadow
    public InventoryPlayer field_71071_by;
    @Shadow
    protected float field_71102_ce;
    @Shadow
    public float field_71106_cc;
    @Shadow
    public int field_71068_ca;
    @Shadow
    public int field_71067_cb;
    @Shadow
    public float eyeHeight;
    private boolean wasSprinting;
    
    @Shadow
    public abstract void func_71029_a(final StatBase p0);
    
    @Shadow
    public abstract void func_71020_j(final float p0);
    
    @Shadow
    public abstract FoodStats func_71024_bL();
    
    @Shadow
    public abstract void func_71059_n(final Entity p0);
    
    @Shadow
    public abstract ItemStack func_70694_bm();
    
    @Shadow
    public abstract ItemStack func_71045_bC();
    
    @Shadow
    public abstract void func_71028_bD();
    
    @Shadow
    protected void func_70626_be() {
    }
    
    @Shadow
    public abstract boolean func_71039_bw();
    
    @Shadow
    public abstract ItemStack func_71011_bu();
    
    @Shadow
    protected abstract String func_145776_H();
    
    @Shadow
    protected abstract boolean func_70041_e_();
    
    @Shadow
    @Override
    public boolean func_70094_T() {
        return false;
    }
}
