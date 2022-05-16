package item;

import javax.swing.ImageIcon;

public class Empty extends Item {
	private static String name = "empty";
	
	static private ImageIcon img = new ImageIcon("./images/Empty.png");
	
	public String returnName() {
		return name;
	}
	
	public ImageIcon returnImg() {
		return img;
	}
}