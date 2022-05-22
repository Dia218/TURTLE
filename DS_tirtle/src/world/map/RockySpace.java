package world.map;

import world.Biome;

public class RockySpace extends Biome{
	private static int num = 6;
	private static int stavePoint = -15;
	private static String name = "암석지대";
	
	public int returnNum() {return num;}
	public int returnStavePoint() {return stavePoint;}
	public String returnName() {return name;}

}