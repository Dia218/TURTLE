package world_resource;

import world.Resource;
import javax.swing.ImageIcon;

public class Log extends Resource {
	
	private String resource_name = "�볪��";

	static private ImageIcon img = new ImageIcon("./images/Log.png");
	
	public ImageIcon returnImg() {
		return img;
	}
	
	public String returnName() {
		return resource_name;
	}
	
}