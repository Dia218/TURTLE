package world_resource;

import javax.swing.ImageIcon;

import world.Resource;

public class Twigs  extends Resource {
	
	private String resource_name = "��������";

	static private ImageIcon img = new ImageIcon("./images/Twigs.png");
	
	public ImageIcon returnImg() {
		return img;
	}
	
	public String returnName() {
		return resource_name;
	}
	
}