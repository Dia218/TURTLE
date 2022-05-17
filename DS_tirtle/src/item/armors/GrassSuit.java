package item.armors;

import javax.swing.ImageIcon;

import item.Armors;

public class GrassSuit extends Armors {
	private static String name = "Ç®°©¿Ê";
	private int durability = 100;
	private static int defence = 60;
	
	static private ImageIcon img = new ImageIcon("./images/Grass_Suit.png");
	
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

