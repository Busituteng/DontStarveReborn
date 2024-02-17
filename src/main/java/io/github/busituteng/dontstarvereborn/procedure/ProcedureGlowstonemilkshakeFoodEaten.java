package io.github.busituteng.dontstarvereborn.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.Map;

import io.github.busituteng.dontstarvereborn.item.ItemPapercup;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class ProcedureGlowstonemilkshakeFoodEaten extends ElementsDontstarverebornMod.ModElement {
	public ProcedureGlowstonemilkshakeFoodEaten(ElementsDontstarverebornMod instance) {
		super(instance, 108);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure GlowstonemilkshakeFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.GLOWING, (int) 1200, (int) 0));
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemPapercup.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
