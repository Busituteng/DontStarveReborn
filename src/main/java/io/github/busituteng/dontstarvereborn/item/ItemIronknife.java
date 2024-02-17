
package io.github.busituteng.dontstarvereborn.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import io.github.busituteng.dontstarvereborn.creativetab.TabDsr;
import io.github.busituteng.dontstarvereborn.ElementsDontstarverebornMod;

@ElementsDontstarverebornMod.ModElement.Tag
public class ItemIronknife extends ElementsDontstarverebornMod.ModElement {
	@GameRegistry.ObjectHolder("dontstarvereborn:ironknife")
	public static final Item block = null;
	public ItemIronknife(ElementsDontstarverebornMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("dontstarvereborn:ironknife", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 1;
			setUnlocalizedName("ironknife");
			setRegistryName("ironknife");
			setCreativeTab(TabDsr.tab);
			setContainerItem(this);
		}

		@Override
		public int getItemEnchantability() {
			return 1;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 192;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 2.1F;
		}
	}
}
