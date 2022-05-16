package item.processedFoods;

import javax.swing.ImageIcon;

import item.*;

public class MeatBall extends ProcessedFoods {
	private static String name = "¹ÌÆ®º¼";
	private static int starvePoint = 40;
	private static int healPoint = 0;
	
	static private ImageIcon img = new ImageIcon("./images/Meatballs.png");
	
	public String returnName() {
		return name;
	}
	public int returnStarvePoint() {
		return starvePoint;
	}
	public int returnHealPoint() {
		return healPoint;
	}
	static public ImageIcon returnImg() {
		return img;
	}
}