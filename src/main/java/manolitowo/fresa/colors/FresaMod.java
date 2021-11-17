package manolitowo.fresa.colors;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FresaMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("fresacolors");

	//public static final Item STRAWBERRY = new Item(new Item.Settings().group(ItemGroup.FOOD));
	public static final Block WHITE_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.STONE).breakByHand(true));
	public static final Block RED_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.STONE).breakByHand(true));
	public static final Block YELLOW_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.STONE).breakByHand(true));
	public static final Block PURPLE_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.STONE).breakByHand(true));
	public static final Block BLUE_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.STONE).breakByHand(true));
	public static final Block ORANGE_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.STONE).breakByHand(true));
	public static final Block GRAY_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.STONE).breakByHand(true));
	public static final Block LIGHT_GRAY_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.STONE).breakByHand(true));
	public static final Block GREEN_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.STONE).breakByHand(true));
	public static final Block LIME_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.STONE).breakByHand(true));
	public static final Block MAGENTA_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.STONE).breakByHand(true));
	public static final Block BLACK_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.STONE).breakByHand(true));
	public static final Block PINK_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.STONE).breakByHand(true));
	public static final Block CYAN_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.STONE).breakByHand(true));
	public static final Block BROWN_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.STONE).breakByHand(true));
	public static final Block LIGHT_BLUE_BLOCK = new Block(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.STONE).breakByHand(true));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		//white
		Registry.register(Registry.ITEM, new Identifier("fresacolors", "white_block"), new BlockItem(WHITE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("fresacolors", "white_block"), WHITE_BLOCK);
		//red
		Registry.register(Registry.ITEM, new Identifier("fresacolors", "red_block"), new BlockItem(RED_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("fresacolors", "red_block"), RED_BLOCK);
		//yellow
		Registry.register(Registry.ITEM, new Identifier("fresacolors", "yellow_block"), new BlockItem(YELLOW_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("fresacolors", "yellow_block"), YELLOW_BLOCK);
		//purple
		Registry.register(Registry.ITEM, new Identifier("fresacolors", "purple_block"), new BlockItem(PURPLE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("fresacolors", "purple_block"), PURPLE_BLOCK);
		//blue
		Registry.register(Registry.ITEM, new Identifier("fresacolors", "blue_block"), new BlockItem(BLUE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("fresacolors", "blue_block"), BLUE_BLOCK);
		//orange
		Registry.register(Registry.ITEM, new Identifier("fresacolors", "orange_block"), new BlockItem(ORANGE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("fresacolors", "orange_block"), ORANGE_BLOCK);
		//gray
		Registry.register(Registry.ITEM, new Identifier("fresacolors", "gray_block"), new BlockItem(GRAY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("fresacolors", "gray_block"), GRAY_BLOCK);
		//light gray
		Registry.register(Registry.ITEM, new Identifier("fresacolors", "light_gray_block"), new BlockItem(LIGHT_GRAY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("fresacolors", "light_gray_block"), LIGHT_GRAY_BLOCK);
		//green
		Registry.register(Registry.ITEM, new Identifier("fresacolors", "green_block"), new BlockItem(GREEN_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("fresacolors", "green_block"), GREEN_BLOCK);
		//lime
		Registry.register(Registry.ITEM, new Identifier("fresacolors", "lime_block"), new BlockItem(LIME_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("fresacolors", "lime_block"), LIME_BLOCK);
		//magenta
		Registry.register(Registry.ITEM, new Identifier("fresacolors", "magenta_block"), new BlockItem(MAGENTA_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("fresacolors", "magenta_block"), MAGENTA_BLOCK);
		//black
		Registry.register(Registry.ITEM, new Identifier("fresacolors", "black_block"), new BlockItem(BLACK_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("fresacolors", "black_block"), BLACK_BLOCK);
		//cyan
		Registry.register(Registry.ITEM, new Identifier("fresacolors", "cyan_block"), new BlockItem(CYAN_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("fresacolors", "cyan_block"), CYAN_BLOCK);
		//brown
		Registry.register(Registry.ITEM, new Identifier("fresacolors", "brown_block"), new BlockItem(BROWN_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("fresacolors", "brown_block"), BROWN_BLOCK);
		//light blue
		Registry.register(Registry.ITEM, new Identifier("fresacolors", "light_blue_block"), new BlockItem(LIGHT_BLUE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("fresacolors", "light_blue_block"), LIGHT_BLUE_BLOCK);
		//pink
		Registry.register(Registry.ITEM, new Identifier("fresacolors", "pink_block"), new BlockItem(PINK_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("fresacolors", "pink_block"), PINK_BLOCK);
	}
}
