package item.processedFoods;

import javax.swing.ImageIcon;

import item.*;

public class Ratatouille extends ProcessedFoods {
	private static String name = "¶óµû¶ÑÀÌ";
	private static int starvePoint = 25;
	private static int healPoint = 10;
	
	static private ImageIcon img = new ImageIcon("./images/Ratatouille.png");
	
	public String returnName() {
		return name;
	}
	public int returnStarvePoint() {
		return starvePoint;
	}
	public int returnHealPoint() {
		return healPoint;
	}
	static public ImageIcon returnImg() {
		return img;
	}
}