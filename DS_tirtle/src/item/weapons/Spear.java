package item.weapons;

import javax.swing.ImageIcon;

import item.Weapons;

public class Spear extends Weapons {
	private static String name = "â";
	private int durability = 100;
	private int attack = 30;
	
	static private ImageIcon img = new ImageIcon("./images/Spear.png");
	
	public String returnName() {
		return name;
	}
	public int returnDurability() {
		return durability;
	}
	public int returnATK() {
		return attack;
	}
	static public ImageIcon returnImg() {
		return img;
	}
}