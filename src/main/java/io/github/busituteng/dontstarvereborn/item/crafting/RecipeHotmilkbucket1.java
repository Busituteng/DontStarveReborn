
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import io.github.busituteng.dontstarvereborn.item.ItemHotmilkbucket;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeHotmilkbucket1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeHotmilkbucket1(ElementsDontstarverebornMod instance) {
		super(instance, 73);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.MILK_BUCKET, (int) (1)), new ItemStack(ItemHotmilkbucket.block, (int) (1)), 0F);
	}
}
