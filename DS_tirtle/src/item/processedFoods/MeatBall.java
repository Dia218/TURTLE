package item.processedFoods;

import javax.swing.ImageIcon;

import item.Foods;

public class MeatBall extends Foods {
	private static String name = "¹ÌÆ®º¼";
	private static int starvePoint = 40;
	private static int healPoint = 0;
	
	static private ImageIcon meatBall = new ImageIcon("./images/Meatballs.png");
	
	public String returnName() {
		return name;
	}
	public int returStarvePoint() {
		return starvePoint;
	}
	public int returnHealPoint() {
		return healPoint;
	}
	static public ImageIcon meatBall() {
		return meatBall;
	}
}