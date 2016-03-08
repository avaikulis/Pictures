package com.allans.World;

import com.allans.EnderFurnace.ContainerEnderFurnace;
import com.allans.EnderFurnace.GuiEnderFurnace;
import com.allans.EnderFurnace.TileEntityEnderFurnaceAndFuel;
import com.allans.Gui.ReCraftingTable.CustContainerWorkBench;
import com.allans.Gui.ReCraftingTable.ReTableCraftingGui;
import com.allans.Gui.ReCraftingTable.inventory.GuiContainer;
import com.typesafe.config.Config;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler
{

 @Override
 public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	 if (ID == CustContainerWorkBench.GUI_ID){
		 return new CustContainerWorkBench(player.inventory,world,x,y,z);
 }
	 if(ID == 0){
			TileEntityEnderFurnaceAndFuel tileEntityFurnace = (TileEntityEnderFurnaceAndFuel) world.getTileEntity(x, y, z);
			return new ContainerEnderFurnace(player.inventory, tileEntityFurnace);
		}
	return null;
 }
 @Override
 public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z){
	 if (ID == ReTableCraftingGui.GUI_ID){
		 return new ReTableCraftingGui(player.inventory,world,x,y,z);
 }
	 if(ID == 0){
			TileEntityEnderFurnaceAndFuel tileEntityTestContainer = (TileEntityEnderFurnaceAndFuel) world.getTileEntity(x, y, z);
			return new GuiEnderFurnace(player.inventory, tileEntityTestContainer);
		}
	return null;
 }


}



 

