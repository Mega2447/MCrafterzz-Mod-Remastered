package mod.Mega_CS.mm.init;

import java.util.ArrayList;
import java.util.List;

import mod.Mega_CS.mm.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Ore
	public static final Block AMETHYST_ORE = new BlockBase("amethyst_ore", Material.ROCK, "pickaxe", 3);
	public static final Block JADE_ORE = new BlockBase("jade_ore", Material.ROCK, "pickaxe", 3);
	public static final Block COPPER_ORE = new BlockBase("copper_ore", Material.ROCK, "pickaxe", 1);
	public static final Block TIN_ORE = new BlockBase("tin_ore", Material.ROCK, "pickaxe", 1);
	
	//Mineral Blocks
	public static final Block AMETHYST_BLOCK = new BlockBase("amethyst_block", Material.ROCK, "pickaxe", 3);
	public static final Block JADE_BLOCK = new BlockBase("jade_block", Material.ROCK, "pickaxe", 3);
	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.ROCK, "pickaxe", 1);
	public static final Block TIN_BLOCK = new BlockBase("tin_block", Material.ROCK, "pickaxe", 1);
	public static final Block BRONZE_BLOCK = new BlockBase("bronze_block", Material.ROCK, "pickaxe", 2);
	
	//Chests
	public static final Block IRON_CHEST;
	
	// Doors
	public static final Block COPPER_DOOR;
	public static final Block TIN_DOOR;
	public static final Block BRONZE_DOOR;
	public static final Block AMETHYST_DOOR;
	
	//Pressure plates
	public static final Block DIAMOND_PRESSURE_PLATE;
	public static final Block COPPER_PRESSURE_PLATE;
	public static final Block TIN_PRESSURE_PLATE;
	public static final Block BRONZE_PRESSURE_PLATE;
	public static final Block AMETHYST_PRESSURE_PLATE;
	public static final Block JADE_PRESSURE_PLATE;
	public static final Block EMERALD_PRESSURE_PLATE;
	public static final Block QUARTZ_PRESSURE_PLATE;
	
	// Bars
	public static final Block STONE_BARS;
	public static final Block GOLD_BARS;
	public static final Block DIAMOND_BARS;
	public static final Block COPPER_BARS;
	public static final Block TIN_BARS;
	public static final Block BRONZE_BARS;
	public static final Block AMETHYST_BARS;
	public static final Block JADE_BARS;
	public static final Block EMERALD_BARS;
	public static final Block QUARTZ_BARS;
	
	// Trap doors
	public static final Block STONE_TRAPDOOR;
	public static final Block GOLD_TRAPDOOR;
	public static final Block DIAMOND_TRAPDOOR;
	public static final Block COPPER_TRAPDOOR;
	public static final Block TIN_TRAPDOOR;
	public static final Block BRONZE_TRAPDOOR;
	public static final Block AMETHYST_TRAPDOOR;
	public static final Block JADE_TRAPDOOR;
	public static final Block EMERALD_TRAPDOOR;
	public static final Block QUARTZ_TRAPDOOR;
	
	// Buttons
	public static final Block IRON_BUTTON;
	public static final Block GOLD_BUTTON;
	public static final Block DIAMOND_BUTTON;
	public static final Block COPPER_BUTTON;
	public static final Block TIN_BUTTON;
	public static final Block BRONZE_BUTTON;
	public static final Block AMETHYST_BUTTON;
	public static final Block JADE_BUTTON;
	public static final Block EMERALD_BUTTON;
	public static final Block QUARTZ_BUTTON;
	
	// Colour blocks
	public static Block COLOUR_BLOCK_WHITE;
	public static Block COLOUR_BLOCK_LIGHT_GRAY;
	public static Block COLOUR_BLOCK_GRAY;
	public static Block COLOUR_BLOCK_BLACK;
	public static Block COLOUR_BLOCK_LIGHT_BLUE;
	public static Block COLOUR_BLOCK_CYAN;
	public static Block COLOUR_BLOCK_BLUE;
	public static Block COLOUR_BLOCK_LIGHT_GREEN;
	public static Block COLOUR_BLOCK_GREEN;
	public static Block COLOUR_BLOCK_YELLOW;
	public static Block COLOUR_BLOCK_ORANGE;
	public static Block COLOUR_BLOCK_BROWN;
	public static Block COLOUR_BLOCK_MAGENTA;
	public static Block COLOUR_BLOCK_PURPLE;
	public static Block COLOUR_BLOCK_RED;
	public static Block COLOUR_BLOCK_PINK;
	public static Block COLOUR_CHANGING_BLOCK;
	public static Block GLOWING_COLOUR_BLOCK_WHITE;
	public static Block GLOWING_COLOUR_BLOCK_LIGHT_GRAY;
	public static Block GLOWING_COLOUR_BLOCK_GRAY;
	public static Block GLOWING_COLOUR_BLOCK_BLACK;
	public static Block GLOWING_COLOUR_BLOCK_LIGHT_BLUE;
	public static Block GLOWING_COLOUR_BLOCK_CYAN;
	public static Block GLOWING_COLOUR_BLOCK_BLUE;
	public static Block GLOWING_COLOUR_BLOCK_LIGHT_GREEN;
	public static Block GLOWING_COLOUR_BLOCK_GREEN;
	public static Block GLOWING_COLOUR_BLOCK_YELLOW;
	public static Block GLOWING_COLOUR_BLOCK_ORANGE;
	public static Block GLOWING_COLOUR_BLOCK_BROWN;
	public static Block GLOWING_COLOUR_BLOCK_MAGENTA;
	public static Block GLOWING_COLOUR_BLOCK_PURPLE;
	public static Block GLOWING_COLOUR_BLOCK_RED;
	public static Block GLOWING_COLOUR_BLOCK_PINK;
	public static Block GLOWING_COLOUR_CHANGING_BLOCK;
	
	// Coloured stone brICKS
	public static Block COLOURED_STONE_BRICKS_WHITE;
	public static Block COLOURED_STONE_BRICKS_LIGHT_GRAY;
	public static Block COLOURED_STONE_BRICKS_GRAY;
	public static Block COLOURED_STONE_BRICKS_BLACK;
	public static Block COLOURED_STONE_BRICKS_LIGHT_BLUE;
	public static Block COLOURED_STONE_BRICKS_CYAN;
	public static Block COLOURED_STONE_BRICKS_BLUE;
	public static Block COLOURED_STONE_BRICKS_LIGHT_GREEN;
	public static Block COLOURED_STONE_BRICKS_GREEN;
	public static Block COLOURED_STONE_BRICKS_YELLOW;
	public static Block COLOURED_STONE_BRICKS_ORANGE;
	public static Block COLOURED_STONE_BRICKS_BROWN;
	public static Block COLOURED_STONE_BRICKS_MAGENTA;
	public static Block COLOURED_STONE_BRICKS_PURPLE;
	public static Block COLOURED_STONE_BRICKS_RED;
	public static Block COLOURED_STONE_BRICKS_PINK;
	public static Block COLOUR_CHANGING_STONE_BRICKS;
	public static Block GLOWING_COLOURED_STONE_BRICKS_WHITE;
	public static Block GLOWING_COLOURED_STONE_BRICKS_LIGHT_GRAY;
	public static Block GLOWING_COLOURED_STONE_BRICKS_GRAY;
	public static Block GLOWING_COLOURED_STONE_BRICKS_BLACK;
	public static Block GLOWING_COLOURED_STONE_BRICKS_LIGHT_BLUE;
	public static Block GLOWING_COLOURED_STONE_BRICKS_CYAN;
	public static Block GLOWING_COLOURED_STONE_BRICKS_BLUE;
	public static Block GLOWING_COLOURED_STONE_BRICKS_LIGHT_GREEN;
	public static Block GLOWING_COLOURED_STONE_BRICKS_GREEN;
	public static Block GLOWING_COLOURED_STONE_BRICKS_YELLOW;
	public static Block GLOWING_COLOURED_STONE_BRICKS_ORANGE;
	public static Block GLOWING_COLOURED_STONE_BRICKS_BROWN;
	public static Block GLOWING_COLOURED_STONE_BRICKS_MAGENTA;
	public static Block GLOWING_COLOURED_STONE_BRICKS_PURPLE;
	public static Block GLOWING_COLOURED_STONE_BRICKS_RED;
	public static Block GLOWING_COLOURED_STONE_BRICKS_PINK;
	public static Block GLOWING_COLOUR_CHANGING_STONE_BRICKS;
	
	// Coloured stone
	public static Block COLOURED_STONE_WHITE;
	public static Block COLOURED_STONE_LIGHT_GRAY;
	public static Block COLOURED_STONE_GRAY;
	public static Block COLOURED_STONE_BLACK;
	public static Block COLOURED_STONE_LIGHT_BLUE;
	public static Block COLOURED_STONE_CYAN;
	public static Block COLOURED_STONE_BLUE;
	public static Block COLOURED_STONE_LIGHT_GREEN;
	public static Block COLOURED_STONE_GREEN;
	public static Block COLOURED_STONE_YELLOW;
	public static Block COLOURED_STONE_ORANGE;
	public static Block COLOURED_STONE_BROWN;
	public static Block COLOURED_STONE_MAGENTA;
	public static Block COLOURED_STONE_PURPLE;
	public static Block COLOURED_STONE_RED;
	public static Block COLOURED_STONE_PINK;
	public static Block COLOUR_CHANGING_STONE;
	public static Block GLOWING_COLOURED_STONE_WHITE;
	public static Block GLOWING_COLOURED_STONE_LIGHT_GRAY;
	public static Block GLOWING_COLOURED_STONE_GRAY;
	public static Block GLOWING_COLOURED_STONE_BLACK;
	public static Block GLOWING_COLOURED_STONE_LIGHT_BLUE;
	public static Block GLOWING_COLOURED_STONE_CYAN;
	public static Block GLOWING_COLOURED_STONE_BLUE;
	public static Block GLOWING_COLOURED_STONE_LIGHT_GREEN;
	public static Block GLOWING_COLOURED_STONE_GREEN;
	public static Block GLOWING_COLOURED_STONE_YELLOW;
	public static Block GLOWING_COLOURED_STONE_ORANGE;
	public static Block GLOWING_COLOURED_STONE_BROWN;
	public static Block GLOWING_COLOURED_STONE_MAGENTA;
	public static Block GLOWING_COLOURED_STONE_PURPLE;
	public static Block GLOWING_COLOURED_STONE_RED;
	public static Block GLOWING_COLOURED_STONE_PINK;
	public static Block GLOWING_COLOUR_CHANGING_STONE;
	
	// Coloured cobblestONE
	public static Block COLOURED_COBBLESTONE_WHITE;
	public static Block COLOURED_COBBLESTONE_LIGHT_GRAY;
	public static Block COLOURED_COBBLESTONE_GRAY;
	public static Block COLOURED_COBBLESTONE_BLACK;
	public static Block COLOURED_COBBLESTONE_LIGHT_BLUE;
	public static Block COLOURED_COBBLESTONE_CYAN;
	public static Block COLOURED_COBBLESTONE_BLUE;
	public static Block COLOURED_COBBLESTONE_LIGHT_GREEN;
	public static Block COLOURED_COBBLESTONE_GREEN;
	public static Block COLOURED_COBBLESTONE_YELLOW;
	public static Block COLOURED_COBBLESTONE_ORANGE;
	public static Block COLOURED_COBBLESTONE_BROWN;
	public static Block COLOURED_COBBLESTONE_MAGENTA;
	public static Block COLOURED_COBBLESTONE_PURPLE;
	public static Block COLOURED_COBBLESTONE_RED;
	public static Block COLOURED_COBBLESTONE_PINK;
	public static Block COLOUR_CHANGING_COBBLESTONE;
	public static Block GLOWING_COLOURED_COBBLESTONE_WHITE;
	public static Block GLOWING_COLOURED_COBBLESTONE_LIGHT_GRAY;
	public static Block GLOWING_COLOURED_COBBLESTONE_GRAY;
	public static Block GLOWING_COLOURED_COBBLESTONE_BLACK;
	public static Block GLOWING_COLOURED_COBBLESTONE_LIGHT_BLUE;
	public static Block GLOWING_COLOURED_COBBLESTONE_CYAN;
	public static Block GLOWING_COLOURED_COBBLESTONE_BLUE;
	public static Block GLOWING_COLOURED_COBBLESTONE_LIGHT_GREEN;
	public static Block GLOWING_COLOURED_COBBLESTONE_GREEN;
	public static Block GLOWING_COLOURED_COBBLESTONE_YELLOW;
	public static Block GLOWING_COLOURED_COBBLESTONE_ORANGE;
	public static Block GLOWING_COLOURED_COBBLESTONE_BROWN;
	public static Block GLOWING_COLOURED_COBBLESTONE_MAGENTA;
	public static Block GLOWING_COLOURED_COBBLESTONE_PURPLE;
	public static Block GLOWING_COLOURED_COBBLESTONE_RED;
	public static Block GLOWING_COLOURED_COBBLESTONE_PINK;
	public static Block GLOWING_COLOUR_CHANGING_COBBLESTONE;
	
	// Seamless blocks
	public static Block SEAMLESS_STONE_SLAB;
	public static Block SEAMLESS_OAK_LOG;
	public static Block SEAMLESS_BIRCH_LOG;
	public static Block SEAMLESS_SPRUCE_LOG;
	public static Block SEAMLESS_JUNGLE_LOG;
	public static Block SEAMLESS_ACACIA_LOG;
	public static Block SEAMLESS_DARK_OAK_LOG;
	public static Block SEAMLESS_SMOOTH_SANDSTONE;
	public static Block SEAMLESS_SMOOTH_RED_SANDSTONE;
	
	// Map making
	public static Block INVISIBLE_PRESSURE_PLATE;
	public static Block GLOWING_BARRIER;
	public static Block GLOWING_AIR;
	public static Block BLOCK_OF_DEATH;
	
	// Machines
	public static Block CRUSHER;
	
	// Flowers
	public static BlockBush YELLOW_TULIP;
	public static BlockBush BLUE_TULIP;
	public static BlockBush BLACK_TULIP;
	public static BlockBush GREEN_TULIP;
	public static BlockBush PURPLE_TULIP;
	
	// Misc blocks
	public static Block NULL_BLOCK;
	public static Block SCAFFOLDING_BLOCK;
	public static Block COLOUR_CHANGING_WOOL;
	public static Block COLOUR_CHANGING_CLAY;
	public static Block COLOUR_CHANGING_GLASS;
	
	// Stone blocks
	public static Block BASALT;
	public static Block BASALT_BRICKS;
	public static Block POLISHED_BASALT;
	public static Block POLISHED_STONE;
	public static Block GRANITE_BRICKS;
	public static Block ANDESITE_BRICKS;
	public static Block DIORITE_BRICKS;
	public static Block SANDY_BRICKS;
	public static Block SANDY_STONE_BRICKS;
	
	// Nether blocks
	public static Block DARK_NETHER_BRICKS;
}
