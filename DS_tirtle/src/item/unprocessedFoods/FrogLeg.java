package item.unprocessedFoods;

import javax.swing.ImageIcon;

import item.UnprocessedFoods;

public class FrogLeg extends UnprocessedFoods {
	private static String name = "개구리다리";
	private static int starvePoint = 10;
	private static int healPoint = -10;
	
	static private ImageIcon frogLeg = new ImageIcon("./images/Frog_Leg.png");
	
	public String returnName() {
		return name;
	}
	public int returStarvePoint() {
		return starvePoint;
	}
	public int returnHealPoint() {
		return healPoint;
	}
	static public ImageIcon frogLeg() {
		return frogLeg;
	}
}