
package io.github.busituteng.dontstarvereborn.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import io.github.busituteng.dontstarvereborn.item.ItemIronknife;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class TabDsr extends ElementsDontstarverebornMod.ModElement {
	public TabDsr(ElementsDontstarverebornMod instance) {
		super(instance, 57);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabdsr") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemIronknife.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
