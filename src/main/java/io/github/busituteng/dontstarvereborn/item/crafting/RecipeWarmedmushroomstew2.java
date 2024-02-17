
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import io.github.busituteng.dontstarvereborn.item.ItemWarmedmushroomstew;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeWarmedmushroomstew2 extends ElementsDontstarverebornMod.ModElement {
	public RecipeWarmedmushroomstew2(ElementsDontstarverebornMod instance) {
		super(instance, 139);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.MUSHROOM_STEW, (int) (1)), new ItemStack(ItemWarmedmushroomstew.block, (int) (1)), 1F);
	}
}
