package item.unprocessedFoods;

import javax.swing.ImageIcon;

import item.UnprocessedFoods;

public class Carrot extends UnprocessedFoods {
	private static String name = "????";
	private static int starvePoint = 10;
	private static int healPoint = 0;
	
	static private ImageIcon img = new ImageIcon("./images/Carrot.png");
	
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