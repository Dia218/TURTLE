package item;

import javax.swing.ImageIcon;
import item.unprocessedFoods.*;

public class UnprocessedFoods extends Foods {
	//이름
	private String name;
	//이미지
	static private ImageIcon img;
	//허기 회복량
	private int starvePoint;
	//체력 회복량
	private int healPoint;
		
		
	//이름 return
	public String returnName() {
		return name;
	}
	//아이템 아이콘 return
	public static ImageIcon returnImg() {
		return img;
	}
	//허기 회복량 return
	public int returnStarvePoint() {
		return starvePoint;
	}
	//체력 회복량 return
	public int returnHealPoint() {
		return healPoint;
	}
}