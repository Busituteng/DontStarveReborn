
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import io.github.busituteng.dontstarvereborn.item.ItemRoastpumpkinseed;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeRoastpumpkinseed1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeRoastpumpkinseed1(ElementsDontstarverebornMod instance) {
		super(instance, 107);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.PUMPKIN_SEEDS, (int) (1)), new ItemStack(ItemRoastpumpkinseed.block, (int) (1)), 0F);
	}
}
