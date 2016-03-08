package com.allans.World;

import com.allans.Blocks.All_Mod_Blocks;
import com.allans.Items.All_Mod_Items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class CustCraftingRecipes {
	
	public static void MainRegistry(){
		
		
		//Shaped Recipe for ReCraftingTable
		GameRegistry.addShapedRecipe(new ItemStack(All_Mod_Blocks.ReCraftingTableDef, 1)
				,  new Object[]{ "OIO" , "ICI" , "OIO" ,
						'O' , Blocks.obsidian,
						'I' , All_Mod_Items.ReIngot ,
						'C' , Blocks.crafting_table});
				}
		
	}

