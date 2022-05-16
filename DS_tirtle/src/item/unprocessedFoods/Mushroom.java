package item.unprocessedFoods;

import javax.swing.ImageIcon;

import item.UnprocessedFoods;

public class Mushroom extends UnprocessedFoods {
	private static String name = "¹ö¼¸";
	private static int starvePoint = 10;
	private static int healPoint = -50;
	
	static private ImageIcon img = new ImageIcon("./images/Red_Cap.png");
	
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