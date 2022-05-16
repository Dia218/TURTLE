package item;

import javax.swing.*;

public abstract class Item {
	//이름
	static String name;
	//이미지
	private ImageIcon img;
	
	//이름 return
	public abstract String returnName();
}