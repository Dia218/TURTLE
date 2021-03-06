package item.unprocessedFoods;

import javax.swing.ImageIcon;
import item.*;

public class FrogLeg extends UnprocessedFoods {
	private static String name = "개구리다리";
	private static int starvePoint = 10;
	private static int healPoint = -10;
	
	static private ImageIcon img = new ImageIcon("./images/Frog_Legs.png");
	
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