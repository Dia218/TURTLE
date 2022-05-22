package world_object;

import javax.swing.ImageIcon;

public class Mushroom extends Object{

	private String resource_name = "¹ö¼¸»Ñ¸®";

	static private ImageIcon img = new ImageIcon("./images/Mushroom.png");
	
	public ImageIcon returnImg() {
		return img;
	}
	
	public String returnName() {
		return resource_name;
	}
	
	void getResource(){}
}
