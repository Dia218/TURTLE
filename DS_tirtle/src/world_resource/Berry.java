package world_resource;

import javax.swing.ImageIcon;

public class Berry extends Resource {
	
	private String resource_name = "º£¸®";

	static private ImageIcon img = new ImageIcon("./images/Berries.png");
	
	public ImageIcon returnImg() {
		return img;
	}
	
	public String returnName() {
		return resource_name;
	}
	
}