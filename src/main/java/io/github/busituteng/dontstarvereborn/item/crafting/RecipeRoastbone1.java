
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import io.github.busituteng.dontstarvereborn.item.ItemSoakbone;
import io.github.busituteng.dontstarvereborn.item.ItemRoastbone;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeRoastbone1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeRoastbone1(ElementsDontstarverebornMod instance) {
		super(instance, 104);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemSoakbone.block, (int) (1)), new ItemStack(ItemRoastbone.block, (int) (1)), 0F);
	}
}
