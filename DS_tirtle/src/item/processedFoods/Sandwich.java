package item.processedFoods;

import javax.swing.ImageIcon;

import item.*;

public class Sandwich extends ProcessedFoods {
	private static String name = "»÷µåÀ§Ä¡";
	private static int starvePoint = 35;
	private static int healPoint = 30;
	
	static private ImageIcon img = new ImageIcon("./images/Froggle_Bunwich.png");
	
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