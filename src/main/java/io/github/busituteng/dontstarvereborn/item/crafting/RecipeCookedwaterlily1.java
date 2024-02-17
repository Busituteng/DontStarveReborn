
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import io.github.busituteng.dontstarvereborn.item.ItemCookedwaterlily;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeCookedwaterlily1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeCookedwaterlily1(ElementsDontstarverebornMod instance) {
		super(instance, 71);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Blocks.WATERLILY, (int) (1)), new ItemStack(ItemCookedwaterlily.block, (int) (1)), 0F);
	}
}
