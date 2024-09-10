package com.Keven.BetterBeeyond.mixins.Forestry;

import forestry.api.apiculture.IBee;
import forestry.api.apiculture.IBeeHousing;
import forestry.apiculture.BeekeepingLogic;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Collection;

@Mixin(value = BeekeepingLogic.class, remap = false)
public abstract class BeekeepingLogicMixin {

    @Inject(method = "spawnOffspring", at = @At(value = "INVOKE",
        target = "Lforestry/api/apiculture/IBee;spawnPrincess(Lforestry/api/apiculture/IBeeHousing;)Lforestry/api/apiculture/IBee;", shift = At.Shift.AFTER) )
    public void bb$spawnOffspring(IBee queen, IBeeHousing beeHousing, CallbackInfoReturnable<Collection<ItemStack>> cir){

    }
}
