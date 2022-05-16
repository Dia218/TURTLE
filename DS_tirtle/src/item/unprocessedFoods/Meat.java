package item.unprocessedFoods;

import javax.swing.ImageIcon;

import item.UnprocessedFoods;

public class Meat extends UnprocessedFoods {
	private static String name = "°í±â";
	private static int starvePoint = 25;
	private static int healPoint = -10;
	
	static private ImageIcon img = new ImageIcon("./images/Meat.png");
	
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
