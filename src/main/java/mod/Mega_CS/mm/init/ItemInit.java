package mod.Mega_CS.mm.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final ToolMaterial AMETHYST = EnumHelper.addToolMaterial("material_amethyst", harvestLevel, maxUses, efficiency, damage, enchantability)
}
