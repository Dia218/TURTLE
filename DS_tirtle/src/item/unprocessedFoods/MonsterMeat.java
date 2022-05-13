package item.unprocessedFoods;

import javax.swing.ImageIcon;

import item.UnprocessedFoods;

public class MonsterMeat extends UnprocessedFoods {
	private static String name = "±«¹°°í±â";
	private static int starvePoint = 20;
	private static int healPoint = -30;
	
	static private ImageIcon monsterMeat = new ImageIcon("./images/Monster_Meat.png");
	
	public String returnName() {
		return name;
	}
	public int returStarvePoint() {
		return starvePoint;
	}
	public int returnHealPoint() {
		return healPoint;
	}
	static public ImageIcon monsterMeat() {
		return monsterMeat;
	}
}