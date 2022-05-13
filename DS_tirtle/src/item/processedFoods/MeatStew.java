package item.processedFoods;

import javax.swing.ImageIcon;

import item.Foods;

public class MeatStew extends Foods {
	private static String name = "¹ÌÆ®½ºÆ©";
	private static int starvePoint = 100;
	private static int healPoint = 10;
	
	static private ImageIcon img = new ImageIcon("./images/Meaty_Stew.png");
	
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