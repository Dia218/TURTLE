package item.processedFoods;

import javax.swing.ImageIcon;

public class WetGoop {
	private static String name = "ฐ๏มื";
	private static int starvePoint = 0;
	private static int healPoint = 0;
	
	static private ImageIcon img = new ImageIcon("./images/Wet_Goop.png");
	
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
