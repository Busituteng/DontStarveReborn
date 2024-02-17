
package io.github.busituteng.dontstarvereborn.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import io.github.busituteng.dontstarvereborn.item.ItemCheese;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class OreDictFoodCheese extends ElementsDontstarverebornMod.ModElement {
	public OreDictFoodCheese(ElementsDontstarverebornMod instance) {
		super(instance, 60);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("foodCheese", new ItemStack(ItemCheese.block, (int) (1)));
	}
}
