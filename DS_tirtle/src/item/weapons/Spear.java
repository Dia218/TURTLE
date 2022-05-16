package item.weapons;

<<<<<<< HEAD
import javax.swing.ImageIcon;

import item.Weapons;

public class Spear extends Weapons {
	private static String name = "창";
	private int durability = 100;
	private static int attack = 30;
	
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
=======
public class Spear {
	//임시
	static public String name = "창";
}
>>>>>>> af339bbd79ee4ee31bfc6d09a42a0afed7854e69
