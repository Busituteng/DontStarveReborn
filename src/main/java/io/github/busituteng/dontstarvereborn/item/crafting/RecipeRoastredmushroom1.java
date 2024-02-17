
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import io.github.busituteng.dontstarvereborn.item.ItemRoastredmushroom;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeRoastredmushroom1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeRoastredmushroom1(ElementsDontstarverebornMod instance) {
		super(instance, 84);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Blocks.RED_MUSHROOM, (int) (1)), new ItemStack(ItemRoastredmushroom.block, (int) (1)), 0F);
	}
}
