package com.allans.World;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class World {
	
	public static void MainRigistry(){
		IntWorldGen();
		
		
	}
	
	public static void IntWorldGen(){
		RegWorldGen(new OreMaster(), 1);
		
		
	}
	
	public static void RegWorldGen(IWorldGenerator worldGenClass,int weightedProbability){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
	}
	
	

}
