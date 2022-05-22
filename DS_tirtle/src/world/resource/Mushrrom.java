package world.resource;

import javax.swing.ImageIcon;

import world.Resource;

public class Mushrrom  extends Resource {
	
	private String resource_name = "¹ö¼¸";

	static private ImageIcon img = new ImageIcon("./images/Mushroom.png");
	
	public ImageIcon returnImg() {
		return img;
	}
	
	public String returnName() {
		return resource_name;
	}
	
}