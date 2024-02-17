
package io.github.busituteng.dontstarvereborn.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import io.github.busituteng.dontstarvereborn.item.ItemIronknife;
import io.github.busituteng.dontstarvereborn.item.ItemDiamondknife;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class OreDictDsrknife extends ElementsDontstarverebornMod.ModElement {
	public OreDictDsrknife(ElementsDontstarverebornMod instance) {
		super(instance, 54);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("dsr_knife", new ItemStack(ItemDiamondknife.block, (int) (1)));
		OreDictionary.registerOre("dsr_knife", new ItemStack(ItemIronknife.block, (int) (1)));
	}
}
