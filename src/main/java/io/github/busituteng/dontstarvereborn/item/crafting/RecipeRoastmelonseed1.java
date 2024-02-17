
package io.github.busituteng.dontstarvereborn.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import io.github.busituteng.dontstarvereborn.item.ItemRoastmelonseed;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class RecipeRoastmelonseed1 extends ElementsDontstarverebornMod.ModElement {
	public RecipeRoastmelonseed1(ElementsDontstarverebornMod instance) {
		super(instance, 106);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.MELON_SEEDS, (int) (1)), new ItemStack(ItemRoastmelonseed.block, (int) (1)), 0F);
	}
}
