
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import io.github.busituteng.dontstarvereborn.item.ItemBurntleather;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeBurntleather1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeBurntleather1(ElementsDontstarverebornMod instance) {
		super(instance, 62);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.LEATHER, (int) (1)), new ItemStack(ItemBurntleather.block, (int) (1)), 0F);
	}
}
