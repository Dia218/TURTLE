package item.armors;

import javax.swing.ImageIcon;

import item.Armors;

public class LogSuit extends Armors {
	private static String name = "��������";
	private int durability = 100;
	private int defence = 80;
	
	static private ImageIcon img = new ImageIcon("./images/Log_Suit.png");
	
	public String returnName() {
		return name;
	}
	public int returnDurability() {
		return durability;
	}
	public int returnDEF() {
		return defence;
	}
	static public ImageIcon returnImg() {
		return img;
	}
}