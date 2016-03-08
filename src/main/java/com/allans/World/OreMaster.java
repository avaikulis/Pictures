package com.allans.World;

import java.util.Random;

import com.allans.Blocks.All_Mod_Blocks;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

@SuppressWarnings("unused")
public class OreMaster implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
			generateEnd(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 0:
			generateOverWorld(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 1:
			generateNether(random, chunkX * 16, chunkZ * 16, world);
			break;
			
		}


	}
	@SuppressWarnings("unused")
	private void addOre(Block block, Block blockspawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVien, int maxVien, int spawnChance){
		for(int i = 0; i < spawnChance; i++){
			int defaultChunkSize = 16;
			
			int xPos = posX + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY - minY);
			int zPos = posZ + random.nextInt(defaultChunkSize);
			
			new WorldGenMinable(block, (minVien + random.nextInt(maxVien - minVien)), blockspawn).generate(world, random, xPos, yPos, zPos);
					
			
		}
	}

	private void generateNether(Random random, int chunkX, int chunkZ, World world) {
		
		
	}

	private void generateOverWorld(Random random, int chunkX, int chunkZ, World world) {
		//Test Or Beta my friends                              addOre(All_Mod_Blocks.PinkOreDef, Blocks.stone,random,world,chunkX,chunkZ,5,100,10,20,60);
		
	}

	private void generateEnd(Random random, int chunkX, int chunkZ, World world) {
		
	}

}
