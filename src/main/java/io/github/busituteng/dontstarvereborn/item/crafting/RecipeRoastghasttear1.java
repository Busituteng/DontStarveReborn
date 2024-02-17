
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import io.github.busituteng.dontstarvereborn.item.ItemSoakghasttear;
import io.github.busituteng.dontstarvereborn.item.ItemRoastghasttear;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeRoastghasttear1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeRoastghasttear1(ElementsDontstarverebornMod instance) {
		super(instance, 142);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemSoakghasttear.block, (int) (1)), new ItemStack(ItemRoastghasttear.block, (int) (1)), 1F);
	}
}
