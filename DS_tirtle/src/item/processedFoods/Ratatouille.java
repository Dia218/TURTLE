package item.processedFoods;

import javax.swing.ImageIcon;

import item.Foods;

public class Ratatouille extends Foods {
	private static String name = "¶óµû¶ÑÀÌ";
	private static int starvePoint = 25;
	private static int healPoint = 10;
	
	static private ImageIcon ratatouille = new ImageIcon("./images/Ratatouille.png");
	
	public String returnName() {
		return name;
	}
	public int returStarvePoint() {
		return starvePoint;
	}
	public int returnHealPoint() {
		return healPoint;
	}
	static public ImageIcon ratatouille() {
		return ratatouille;
	}
}