package item.weapons;

import javax.swing.ImageIcon;

import item.Weapons;

public class TentacleSpike extends Weapons {
	private static String name = "ÃË¼ö°¡½Ã";
	private int durability = 100;
	private static int attack = 50;
	
	static private ImageIcon img = new ImageIcon("./images/Tentacle_Spike.png");
	
	public String returnName() {
		return name;
	}
	public int returnDurability() {
		return durability;
	}
	public int returnATK() {
		return attack;
	}
	public ImageIcon returnImg() {
		return img;
	}
}