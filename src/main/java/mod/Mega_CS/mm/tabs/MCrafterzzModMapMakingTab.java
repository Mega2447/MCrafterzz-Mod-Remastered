package mod.Mega_CS.mm.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MCrafterzzModMapMakingTab extends CreativeTabs {

	public MCrafterzzModMapMakingTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(ModElements.invisible_pressure_plate));
	}

}
