package item.processedFoods;

import javax.swing.ImageIcon;

import item.*;

public class MeatStew extends ProcessedFoods {
	private static String name = "¹ÌÆ®½ºÆ©";
	private static int starvePoint = 100;
	private static int healPoint = 10;
	
	static private ImageIcon img = new ImageIcon("./images/Meaty_Stew.png");
	
	public String returnName() {
		return name;
	}
	public int returnStarvePoint() {
		return starvePoint;
	}
	public int returnHealPoint() {
		return healPoint;
	}
	public ImageIcon returnImg() {
		return img;
	}
}