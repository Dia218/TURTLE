package item.processedFoods;

import javax.swing.ImageIcon;

import item.*;

public class Fishsticks extends ProcessedFoods {
	private static String name = "»ý¼±Æ¢±è";
	private static int starvePoint = 35;
	private static int healPoint = 40;
	
	static private ImageIcon img = new ImageIcon("./images/Fishsticks.png");
	
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