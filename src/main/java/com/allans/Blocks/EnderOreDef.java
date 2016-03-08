package com.allans.Blocks;

import java.util.ArrayList;
import java.util.Random;

import com.allans.Items.All_Mod_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EnderOreDef extends Block {
	
	private Item drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;


	public EnderOreDef(Material mat,Item drop, int meta, int least_quantity, int most_quantity) {
		super(mat);
		setHarvestLevel("pickaxe",2);
	    this.drop = drop;
	    this.meta = meta;
	    this.least_quantity = least_quantity;
	    this.most_quantity = most_quantity;
	}

		@Override
		public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		    ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
	        drops.add(new ItemStack(All_Mod_Items.EnderDust, world.rand.nextInt(1) + 1));
	        return drops;
	    }
	}

