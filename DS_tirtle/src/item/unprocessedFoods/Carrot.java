package item.unprocessedFoods;

import javax.swing.ImageIcon;

import item.UnprocessedFoods;

public class Carrot extends UnprocessedFoods {
	private static String name = "´ç±Ù";
	private static int starvePoint = 10;
	private static int healPoint = 0;
	
	static private ImageIcon img = new ImageIcon("./images/Carrot.png");
	
	public String returnName() {
		return name;
	}
	public int returStarvePoint() {
		return starvePoint;
	}
	public int returnHealPoint() {
		return healPoint;
	}
	static public ImageIcon returnImg() {
		return img;
	}
}