package mod.Mega_CS.mm.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MCrafterzzModWorldTab extends CreativeTabs {

	public MCrafterzzModWorldTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(BlockInit.purple_tulip));
	}

}
