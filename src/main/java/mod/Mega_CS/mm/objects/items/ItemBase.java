package mod.Mega_CS.mm.objects.items;

import mod.Mega_CS.mm.Main;
import mod.Mega_CS.mm.init.ItemInit;
import mod.Mega_CS.mm.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MOD_TAB);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
