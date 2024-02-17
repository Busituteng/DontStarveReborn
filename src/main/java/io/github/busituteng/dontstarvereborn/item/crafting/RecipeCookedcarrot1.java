
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import io.github.busituteng.dontstarvereborn.item.ItemCookedcarrot;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeCookedcarrot1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeCookedcarrot1(ElementsDontstarverebornMod instance) {
		super(instance, 69);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.CARROT, (int) (1)), new ItemStack(ItemCookedcarrot.block, (int) (1)), 1F);
	}
}
