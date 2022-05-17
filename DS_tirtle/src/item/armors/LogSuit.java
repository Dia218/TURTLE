package item.armors;

import javax.swing.ImageIcon;

import item.Armors;

public class LogSuit extends Armors {
	private static String name = "��������";
	private int durability = 100;
	private static int defence = 80;
	
	private static ImageIcon img = new ImageIcon("./images/Log_Suit.png");
	
	public String returnName() {
		return name;
	}
	public int returnDurability() {
		return durability;
	}
	public void returnDurDec(int i) {
		durability -= i;
	}
	public int returnDEF() {
		return defence;
	}
	public ImageIcon returnImg() {
		return img;
	}
}
