
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import io.github.busituteng.dontstarvereborn.item.ItemCookedegg;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeCookedegg1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeCookedegg1(ElementsDontstarverebornMod instance) {
		super(instance, 70);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.EGG, (int) (1)), new ItemStack(ItemCookedegg.block, (int) (1)), 1F);
	}
}
