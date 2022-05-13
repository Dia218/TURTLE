package item.processedFoods;

import javax.swing.ImageIcon;

import item.Foods;

public class Fishsticks extends Foods {
	private static String name = "»ý¼±Æ¢±è";
	private static int starvePoint = 35;
	private static int healPoint = 40;
	
	static private ImageIcon img = new ImageIcon("./images/Fishsticks.png");
	
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