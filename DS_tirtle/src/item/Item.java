package item;

import javax.swing.*;

public abstract class Item {
	//이름
	private String name;
	//이미지
	static private ImageIcon img;
	
	//이름 return
	public abstract String returnName();
	
}