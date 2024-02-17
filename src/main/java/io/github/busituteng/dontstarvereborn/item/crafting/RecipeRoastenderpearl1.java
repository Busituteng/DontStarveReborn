
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import io.github.busituteng.dontstarvereborn.item.ItemSoakenderpearl;
import io.github.busituteng.dontstarvereborn.item.ItemRoastenderpearl;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeRoastenderpearl1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeRoastenderpearl1(ElementsDontstarverebornMod instance) {
		super(instance, 117);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemSoakenderpearl.block, (int) (1)), new ItemStack(ItemRoastenderpearl.block, (int) (1)), 0F);
	}
}
