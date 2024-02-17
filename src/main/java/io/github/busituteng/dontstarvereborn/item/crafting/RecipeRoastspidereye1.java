
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import io.github.busituteng.dontstarvereborn.item.ItemSoakspidereye;
import io.github.busituteng.dontstarvereborn.item.ItemRoastspidereye;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeRoastspidereye1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeRoastspidereye1(ElementsDontstarverebornMod instance) {
		super(instance, 113);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemSoakspidereye.block, (int) (1)), new ItemStack(ItemRoastspidereye.block, (int) (1)), 0F);
	}
}
