package mod.Mega_CS.mm.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MCrafterzzModTab extends CreativeTabs {

	public MCrafterzzModTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModElements.bronze_ingot);
	}

}
