package item;

import javax.swing.ImageIcon;
import item.armors.*;

public class Armors extends Tools {
	//이름
	private String name;
	//이미지
	private static ImageIcon img;
	//내구도
	private int durability;
	//방어력
	private int defence;
	
	
	//이름 return
	public String returnName() {
		return name;
	}
	//이미지 아이콘 return
	public ImageIcon returnImg() {
		return img;
	}
	//내구도 return
	public int returnDurability() {
		return durability;
	}
	//방어력 return
	public int returnDEF() {
		return defence;
	}
	
}