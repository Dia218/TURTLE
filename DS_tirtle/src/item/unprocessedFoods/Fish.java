package item.unprocessedFoods;

import javax.swing.ImageIcon;

import item.UnprocessedFoods;

public class Fish extends UnprocessedFoods {
	private static String name = "¹°°í±â";
	private static int starvePoint = 10;
	private static int healPoint = -5;
	
	static private ImageIcon img = new ImageIcon("./images/Fish.png");
	
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