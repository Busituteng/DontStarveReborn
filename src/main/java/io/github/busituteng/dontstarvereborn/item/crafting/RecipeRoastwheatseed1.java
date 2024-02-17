
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import io.github.busituteng.dontstarvereborn.item.ItemRoastwheatseed;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeRoastwheatseed1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeRoastwheatseed1(ElementsDontstarverebornMod instance) {
		super(instance, 105);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.WHEAT_SEEDS, (int) (1)), new ItemStack(ItemRoastwheatseed.block, (int) (1)), 0F);
	}
}
