package item.processedFoods;

import javax.swing.ImageIcon;

import item.*;

public class MonsterLasagna extends ProcessedFoods {
	private static String name = "±«¹°¶óÀÚ³Ä";
	private static int starvePoint = 60;
	private static int healPoint = -20;
	
	static private ImageIcon img = new ImageIcon("./images/Monster_Lasagna.png");
	
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