
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import io.github.busituteng.dontstarvereborn.item.ItemBurntwool;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeBurntwool1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeBurntwool1(ElementsDontstarverebornMod instance) {
		super(instance, 61);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Blocks.WOOL, (int) (1)), new ItemStack(ItemBurntwool.block, (int) (1)), 0F);
	}
}
