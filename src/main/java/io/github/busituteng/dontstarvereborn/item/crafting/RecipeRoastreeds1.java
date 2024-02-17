
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import io.github.busituteng.dontstarvereborn.item.ItemRoastreeds;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeRoastreeds1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeRoastreeds1(ElementsDontstarverebornMod instance) {
		super(instance, 88);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.REEDS, (int) (1)), new ItemStack(ItemRoastreeds.block, (int) (1)), 0F);
	}
}
