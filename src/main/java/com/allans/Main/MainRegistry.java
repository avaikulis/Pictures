package com.allans.Main;

import com.allans.Blocks.All_Mod_Blocks;
import com.allans.Blocks.ReCraftingTableDef;
import com.allans.Items.All_Mod_Items;
import com.allans.World.GuiHandler;
import com.allans.World.World;
import com.allans.lib.RefStrings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.creativetab.CreativeTabs;


@Mod(modid = RefStrings.MODID , name = RefStrings.NAME , version = RefStrings.VERSION)
public class MainRegistry 
{
	


	
	@Mod.Instance(RefStrings.MODID)
    public static MainRegistry instance;
	
	
	
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		All_Mod_Items.mainRegistry(); //Starts All Items
		All_Mod_Blocks.mainRegistry(); //Starts Block Registry
		
		
		com.allans.World.CustCraftingRecipes.MainRegistry();
		com.allans.ReCraftingTable.RecipeAdder.MainRegistry();
		
		
		
		World.MainRigistry();
		
	}
	@EventHandler
	public static void load(FMLInitializationEvent event){
		NetworkRegistry.INSTANCE.registerGuiHandler(RefStrings.MODID, (IGuiHandler) new GuiHandler());

		
		
		
		
	}
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
	
		
	}

}
