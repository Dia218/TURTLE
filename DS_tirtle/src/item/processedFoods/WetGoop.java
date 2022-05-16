package item.processedFoods;

import javax.swing.ImageIcon;

import item.*;

public class WetGoop extends ProcessedFoods {
	private static String name = "ฐ๏มื";
	private static int starvePoint = 0;
	private static int healPoint = 0;
	
	static private ImageIcon img = new ImageIcon("./images/Wet_Goop.png");
	
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
