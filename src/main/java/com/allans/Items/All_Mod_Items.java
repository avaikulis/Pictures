package com.allans.Items;

import com.allans.EnderFurnace.TileEntityEnderFurnaceAndFuel;
import com.allans.lib.RefStrings;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class All_Mod_Items {
	
	public static void mainRegistry(){
		IntItem();
		registerItem();
		
	}
	
	
	public static Item EnderDust; //Defines Ender Dust
	public static Item ReFragment; //Defines Re Fragment
	public static Item ReDust; //Defines Re Dust
	public static Item ReIngot; //Defines Re Dust
	public static Item EnderFragment; //Defines Re Dust	
	public static Item EnderIngot; //Defines Re Dust
			
	public static void IntItem(){
		EnderDust = new Item().setUnlocalizedName("EnderDust")
				.setCreativeTab(CreativeTabs.tabMaterials)
				.setCreativeTab(CreativeTabs.tabAllSearch);
		ReFragment = new Item().setUnlocalizedName("ReFragment")
				.setCreativeTab(CreativeTabs.tabMaterials)
				.setCreativeTab(CreativeTabs.tabAllSearch)
				.setTextureName(RefStrings.MODID + ":ReFragment");
		ReDust = new Item().setUnlocalizedName("ReDust")
				.setCreativeTab(CreativeTabs.tabMaterials)
				.setCreativeTab(CreativeTabs.tabAllSearch)
				.setTextureName(RefStrings.MODID + ":ReDust");
		ReIngot = new Item().setUnlocalizedName("ReIngot")
				.setCreativeTab(CreativeTabs.tabMaterials)
				.setCreativeTab(CreativeTabs.tabAllSearch)
				.setTextureName(RefStrings.MODID + ":ReIngot");
		EnderFragment = new Item().setUnlocalizedName("EnderFragment")
				.setCreativeTab(CreativeTabs.tabMaterials)
				.setCreativeTab(CreativeTabs.tabAllSearch);
		EnderIngot = new Item().setUnlocalizedName("EnderIngot")
				.setCreativeTab(CreativeTabs.tabMaterials)
				.setCreativeTab(CreativeTabs.tabAllSearch);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(EnderDust, EnderDust.getUnlocalizedName());
		GameRegistry.registerItem(ReFragment, ReFragment.getUnlocalizedName());
		GameRegistry.registerItem(ReDust, ReDust.getUnlocalizedName());
		GameRegistry.registerItem(ReIngot, ReIngot.getUnlocalizedName());
		GameRegistry.registerItem(EnderFragment, EnderFragment.getUnlocalizedName());
		GameRegistry.registerItem(EnderIngot, EnderIngot.getUnlocalizedName());
		
		
		
	}
}
