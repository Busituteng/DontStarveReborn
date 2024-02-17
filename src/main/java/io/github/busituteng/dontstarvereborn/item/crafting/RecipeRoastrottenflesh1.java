
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import io.github.busituteng.dontstarvereborn.item.ItemSoakrottenflesh;
import io.github.busituteng.dontstarvereborn.item.ItemRoastrottenflesh;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeRoastrottenflesh1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeRoastrottenflesh1(ElementsDontstarverebornMod instance) {
		super(instance, 111);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemSoakrottenflesh.block, (int) (1)), new ItemStack(ItemRoastrottenflesh.block, (int) (1)), 0F);
	}
}
