package com.allans.Blocks;

import com.allans.EnderFurnace.EnderFurnace;
import com.allans.lib.ReCustCraftingManager;
import com.allans.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class All_Mod_Blocks {
	
	public static void mainRegistry(){
		IntItem();
		registerItem();	
	}
	
	public static Block ReEnderBlockDef; //Defines Re Ender Block Continues In ReEnderBlockDef
	public static Block PinkOreDef; //Defines Pink Ore Continues In PinkOre
	public static Block PinkBlockDef; //Defines Pink Block Continues In PinkBlock
	public static Block ReCraftingTableDef; //Defines Re Crafting Table Continues In ReCraftingTable
	public static Block EnderBlockDef; //Defines Ender Block Continues In EnderBlockDef
	public static Block EnderOreDef; //Defines Ender Ore Continues In EnderOreDef
	public static Block ReOreDef; //Defines Re Ore Continues In ReOreDef
	
	
	
	
	public static Block EnderFurnace;
	public static Block EnderFurnaceActive;
	
	public static void IntItem(){
		
		ReCraftingTableDef = new ReCraftingTableDef(null, Material.iron, null);
		
		ReEnderBlockDef = new ReEnderBlockDef(Material.iron)
				.setBlockName("ReEnderBlockDef")
				.setCreativeTab(CreativeTabs.tabBlock)
				.setBlockTextureName(RefStrings.MODID + ":ReEnderBlockDef")
				.setCreativeTab(CreativeTabs.tabAllSearch)
				.setHardness(10.0F)
				.setLightLevel(0.5F)
				.setResistance(1000.0F)
				;
		
		PinkOreDef = new PinkOreDef(Material.iron)
				.setResistance(10.0F)
				.setBlockName("PinkOreDef")
				.setCreativeTab(CreativeTabs.tabBlock)
				.setBlockTextureName(RefStrings.MODID + ":PinkOreDef")
				.setCreativeTab(CreativeTabs.tabAllSearch)
				.setLightLevel(0.6F)
				.setHardness(25.0F)
				;
		
		PinkBlockDef = new PinkBlockDef(Material.iron)
				.setResistance(10.0F)
				.setBlockName("PinkBlockDef")
				.setCreativeTab(CreativeTabs.tabBlock)
				.setBlockTextureName(RefStrings.MODID + ":PinkBlockDef")
				.setCreativeTab(CreativeTabs.tabAllSearch)
				.setLightLevel(0.6F)
				.setHardness(70.0F)
				;
		EnderBlockDef = new EnderBlockDef(Material.iron)
				.setResistance(10.0F)
				.setBlockName("EnderBlockDef")
				.setCreativeTab(CreativeTabs.tabBlock)
				.setBlockTextureName(RefStrings.MODID + ":EnderBlockDef")
				.setCreativeTab(CreativeTabs.tabAllSearch)
				.setLightLevel(0.2F)
				.setHardness(35.0F)
				;
		EnderOreDef = new EnderOreDef(Material.iron, null, 0, 0, 0)
				.setResistance(10.0F)
				.setBlockName("EnderOreDef")
				.setCreativeTab(CreativeTabs.tabBlock)
				.setBlockTextureName(RefStrings.MODID + ":EnderOreDef")
				.setCreativeTab(CreativeTabs.tabAllSearch)
				.setLightLevel(0.5F)
				.setHardness(15.0F)
				;
		ReOreDef = new ReOreDef(Material.iron, null, 0, 0, 0)
				.setResistance(10.0F)
				.setBlockName("ReOreDef")
				.setCreativeTab(CreativeTabs.tabBlock)
				.setBlockTextureName(RefStrings.MODID + ":ReOreDef")
				.setCreativeTab(CreativeTabs.tabAllSearch)
				.setLightLevel(0.5F)
				.setHardness(15.0F)
				;
		
		
		
		
		EnderFurnace = new com.allans.EnderFurnace.EnderFurnace(false).setBlockName("EnderFurnace").setCreativeTab(CreativeTabs.tabBlock);
		EnderFurnaceActive = new com.allans.EnderFurnace.EnderFurnace(true).setBlockName("EnderFurnaceActive");
		
		
		
	}
				
		
	public static void registerItem(){
		GameRegistry.registerBlock(ReEnderBlockDef, ReEnderBlockDef.getUnlocalizedName());
		GameRegistry.registerBlock(PinkOreDef, PinkOreDef.getUnlocalizedName());
		GameRegistry.registerBlock(PinkBlockDef, PinkBlockDef.getUnlocalizedName());
		GameRegistry.registerBlock(ReCraftingTableDef, ReCraftingTableDef.getUnlocalizedName());
		GameRegistry.registerBlock(EnderBlockDef, EnderBlockDef.getUnlocalizedName());	
		GameRegistry.registerBlock(EnderOreDef, EnderOreDef.getUnlocalizedName());	
		GameRegistry.registerBlock(ReOreDef, ReOreDef.getUnlocalizedName());
		GameRegistry.registerBlock(EnderFurnace, EnderFurnace.getUnlocalizedName());
		GameRegistry.registerBlock(EnderFurnaceActive, EnderFurnaceActive.getUnlocalizedName());
		
		

		
		
		
	}
}