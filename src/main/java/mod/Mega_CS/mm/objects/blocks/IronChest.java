package mod.Mega_CS.mm.objects.blocks;

import javax.annotation.Nullable;

import mod.Mega_CS.mm.util.Reference;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class IronChest extends BlockContainer {

	public IronChest(Material material) {
		super(material);
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos blockPos, IBlockState state, EntityPlayer player,
			EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		TileEntity tileEntity = world.getTileEntity(blockPos);

		if (tileEntity == null || !(tileEntity instanceof TileEntityIronChest)) {
			return true;
		}
		if (world.isRemote) {
			return true;
		}
		player.openGui(Reference.MODID, GuiHandlerIronChest.iron_chest_gui, world, blockPos.getX(), blockPos.getY(),
				blockPos.getZ());
		return true;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityIronChest();
	}

	@Override
	public void breakBlock(World world, BlockPos blockPos, IBlockState state) {
		TileEntityIronChest tileEntity = (TileEntityIronChest) world.getTileEntity(blockPos);
		InventoryHelper.dropInventoryItems(world, blockPos, tileEntity);
		super.breakBlock(world, blockPos, state);
	}

	@Override
	public void onBlockPlacedBy(World world, BlockPos blockPos, IBlockState state, EntityLivingBase player,
			ItemStack itemStack) {
		if (itemStack.hasDisplayName()) {
			((TileEntityIronChest) world.getTileEntity(blockPos)).setCustomName(itemStack.getDisplayName());
		}
	}

}