package world_resource;

import javax.swing.ImageIcon;

import world.Resource;

public class Carrot  extends Resource {
	
	private String resource_name = "´ç±Ù";

	static private ImageIcon img = new ImageIcon("./images/Carrot.png");
	
	public ImageIcon returnImg() {
		return img;
	}
	
	public String returnName() {
		return resource_name;
	}
	
}