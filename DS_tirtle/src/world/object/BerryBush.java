package world.object;

import javax.swing.ImageIcon;

public class BerryBush extends Object{

	private String resource_name = "º£¸®´ýºÒ";

	static private ImageIcon img = new ImageIcon("./images/BerryBush.png");
	
	public ImageIcon returnImg() {
		return img;
	}
	
	public String returnName() {
		return resource_name;
	}
	
	void getResource(){}
}