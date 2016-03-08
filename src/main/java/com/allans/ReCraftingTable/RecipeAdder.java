package com.allans.ReCraftingTable;

import com.allans.lib.ReCustCraftingManager;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RecipeAdder {
	
	public static void MainRegistry(){
		RecipeManager();
	}
	
	private static void RecipeManager(){
		//Here is Example on How To Add Recipes to ReCraftingTable
		ReCustCraftingManager.instance.addRecipe(new ItemStack(Blocks.hopper, 64), new Object[] {"I I", "ICI", " I ", 'I', Items.iron_ingot, 'C', Blocks.chest});
	}

}
