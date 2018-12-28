package mod.Mega_CS.mm.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MCrafterzzModSmallerBuildingBlocksTab extends CreativeTabs {

	public MCrafterzzModSmallerBuildingBlocksTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(ModElementsSmallerBlocks.sandy_stone_bricks_wall));
	}

}
