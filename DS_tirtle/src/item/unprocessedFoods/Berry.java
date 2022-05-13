package item.unprocessedFoods;

import javax.swing.ImageIcon;

import item.UnprocessedFoods;

public class Berry extends UnprocessedFoods {
	private static String name = "º£¸®";
	private static int starvePoint = 10;
	private static int healPoint = 0;
	
	static private ImageIcon img = new ImageIcon("./images/Berries.png");
	
	public String returnName() {
		return name;
	}
	public int returStarvePoint() {
		return starvePoint;
	}
	public int returnHealPoint() {
		return healPoint;
	}
	public ImageIcon returnImg() {
		return img;
	}
}
