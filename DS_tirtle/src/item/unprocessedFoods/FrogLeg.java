package item.unprocessedFoods;

import javax.swing.ImageIcon;
import item.*;

public class FrogLeg extends UnprocessedFoods {
	private static String name = "�������ٸ�";
	private static int starvePoint = 10;
	private static int healPoint = -10;
	
	static private ImageIcon img = new ImageIcon("./images/Frog_Leg.png");
	
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