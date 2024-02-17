
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import io.github.busituteng.dontstarvereborn.item.ItemRoastbrownmushroom;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeRoastbrownmushroom1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeRoastbrownmushroom1(ElementsDontstarverebornMod instance) {
		super(instance, 83);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Blocks.BROWN_MUSHROOM, (int) (1)), new ItemStack(ItemRoastbrownmushroom.block, (int) (1)), 0F);
	}
}
