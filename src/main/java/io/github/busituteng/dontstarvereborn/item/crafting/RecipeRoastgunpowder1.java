
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import io.github.busituteng.dontstarvereborn.item.ItemSoakgunpowder;
import io.github.busituteng.dontstarvereborn.item.ItemRoastgunpowder;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeRoastgunpowder1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeRoastgunpowder1(ElementsDontstarverebornMod instance) {
		super(instance, 115);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemSoakgunpowder.block, (int) (1)), new ItemStack(ItemRoastgunpowder.block, (int) (1)), 0F);
	}
}
