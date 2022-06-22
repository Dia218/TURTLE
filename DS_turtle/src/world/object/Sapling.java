package world.object;

import javax.swing.ImageIcon;

public class Sapling extends Object{

	private String resource_name = "¹¦¸ñ";

	static private ImageIcon img = new ImageIcon("./images/Sapling.png");
	
	public ImageIcon returnImg() {
		return img;
	}
	
	public String returnName() {
		return resource_name;
	}
	
	void getResource(){}
}
