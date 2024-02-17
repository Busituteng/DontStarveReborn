
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import io.github.busituteng.dontstarvereborn.item.ItemCookedcactus;
import io.github.busituteng.dontstarvereborn.item.ItemCactusmeat;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeCookedcactus1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeCookedcactus1(ElementsDontstarverebornMod instance) {
		super(instance, 66);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemCactusmeat.block, (int) (1)), new ItemStack(ItemCookedcactus.block, (int) (1)), 1F);
	}
}
