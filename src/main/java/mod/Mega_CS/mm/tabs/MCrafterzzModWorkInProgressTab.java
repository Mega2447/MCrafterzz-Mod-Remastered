package mod.Mega_CS.mm.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MCrafterzzModWorkInProgressTab extends CreativeTabs{

	public MCrafterzzModWorkInProgressTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(ModElements.crusher));
	}

}
