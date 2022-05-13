package item.processedFoods;

import javax.swing.ImageIcon;

import item.Foods;

public class MonsterLasagna extends Foods {
	private static String name = "±«¹°¶óÀÚ³Ä";
	private static int starvePoint = 60;
	private static int healPoint = -20;
	
	static private ImageIcon img = new ImageIcon("./images/Monster_Lasagna.png");
	
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