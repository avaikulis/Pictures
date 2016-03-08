package com.allans.Blocks;

import java.util.ArrayList;
import java.util.Random;

import com.allans.Main.MainRegistry;
import com.allans.lib.RefStrings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ReCraftingTableDef extends Block
{
	
	private Item drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;
	

	
	public IIcon Side0;
	public IIcon Side1;
	public IIcon Side2;
	public IIcon Side3;
	public IIcon Side4;
	public IIcon Side5;
	
	public void registerBlockIcons(IIconRegister icon){
		Side0 = icon.registerIcon(RefStrings.MODID + ":ReCraftingTableDef_0");
		Side1 = icon.registerIcon(RefStrings.MODID + ":ReCraftingTableDef_1");
		Side2 = icon.registerIcon(RefStrings.MODID + ":ReCraftingTableDef_2");
		Side3 = icon.registerIcon(RefStrings.MODID + ":ReCraftingTableDef_3");
		Side4 = icon.registerIcon(RefStrings.MODID + ":ReCraftingTableDef_4");
		Side5 = icon.registerIcon(RefStrings.MODID + ":ReCraftingTableDef_5");
	}
	
	public IIcon getIcon(int side, int meta){
		if(side == 0){
			return Side0;
		}
		if(side == 1){
			return Side1;
		}
		if(side == 2){
			return Side2;
		}
		if(side == 3){
			return Side3;
		}
		if(side == 4){
			return Side4;
		}
		if(side == 5){
			return Side5;
		}
		return null;
	}
	
	

    @SideOnly(Side.CLIENT)
    private IIcon field_150035_a;
    @SideOnly(Side.CLIENT)
    private IIcon field_150034_b;
    private static final String __OBFID = "CL_00000221";

    protected ReCraftingTableDef(String unlocalizedName, Material iron, Item drop2, int i, int least_quantity2, int most_quantity2)
    {
        super(Material.iron);
        this.setCreativeTab(CreativeTabs.tabBlock);
        setBlockName("ReCraftingTableDef");
		this.drop = drop;
		this.meta = meta;
		this.least_quantity = least_quantity;
		this.most_quantity = most_quantity;
    }
    
    public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_,
    		EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        if (p_149727_5_.isSneaking())
        {
            return true;
        }
        else
        {
            p_149727_5_.openGui(MainRegistry.instance, 20, p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_);
            return true;
        }
        
    }
    
    protected ReCraftingTableDef(String unlocalizedName, Material mat, Item drop, int least_quantity, int most_quantity) {
		this(unlocalizedName, mat, drop, 0, least_quantity, most_quantity);
	}

	protected ReCraftingTableDef(String unlocalizedName, Material mat, Item drop) {
		this(unlocalizedName, mat, drop, 1, 1);
	}

	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
		return this.drop;
	}

	@Override
	public int damageDropped(int meta) {
		return meta;
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
		if (this.least_quantity >= this.most_quantity)
			return this.least_quantity;
		return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
	}
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
	    ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        drops.add(new ItemStack(All_Mod_Blocks.ReCraftingTableDef, 1));
        return drops;
    }
}