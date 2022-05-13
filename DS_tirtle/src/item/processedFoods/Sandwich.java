package item.processedFoods;

import javax.swing.ImageIcon;

import item.Foods;

public class Sandwich extends Foods {
	private static String name = "»÷µåÀ§Ä¡";
	private static int starvePoint = 35;
	private static int healPoint = 30;
	
	static private ImageIcon sandwich = new ImageIcon("./images/Froggle_Bunwich.png");
	
	public String returnName() {
		return name;
	}
	public int returStarvePoint() {
		return starvePoint;
	}
	public int returnHealPoint() {
		return healPoint;
	}
	static public ImageIcon sandwich() {
		return sandwich;
	}
}