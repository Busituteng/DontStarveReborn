
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import io.github.busituteng.dontstarvereborn.item.ItemRoastvine;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeRoastvine1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeRoastvine1(ElementsDontstarverebornMod instance) {
		super(instance, 95);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Blocks.VINE, (int) (1)), new ItemStack(ItemRoastvine.block, (int) (1)), 0F);
	}
}
