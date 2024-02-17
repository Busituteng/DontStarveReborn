
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import io.github.busituteng.dontstarvereborn.item.ItemCookednetherwart;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeCookednetherwart1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeCookednetherwart1(ElementsDontstarverebornMod instance) {
		super(instance, 76);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.NETHER_WART, (int) (1)), new ItemStack(ItemCookednetherwart.block, (int) (1)), 0F);
	}
}
