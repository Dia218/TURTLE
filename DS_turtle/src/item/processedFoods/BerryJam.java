package item.processedFoods;

import javax.swing.ImageIcon;

import item.*;

public class BerryJam extends ProcessedFoods {
	private static String name = "∫£∏Æ¿Î";
	private static int starvePoint = 35;
	private static int healPoint = 10;
	
	static private ImageIcon img = new ImageIcon("./images/Berry_Jam.png");
	
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
