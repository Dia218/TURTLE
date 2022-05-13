package item;

import javax.swing.ImageIcon;

public class Empty extends Item {
	private String name = "empty";
	
	static private ImageIcon img = new ImageIcon("./images/Empty.png");
	
	public String returnName() {
		return name;
	}
	
	static public ImageIcon returnImg() {
		return img;
	}
}