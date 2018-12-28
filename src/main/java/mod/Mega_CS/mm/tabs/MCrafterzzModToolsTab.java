package mod.Mega_CS.mm.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MCrafterzzModToolsTab extends CreativeTabs {

	public MCrafterzzModToolsTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModElementsToolsArmour.amethyst_pickaxe);
	}

}
