package world.resource;

import javax.swing.ImageIcon;

public class Rock  extends Resource {
	
	private String resource_name = "Á¶¾àµ¹";

	static private ImageIcon img = new ImageIcon("./images/Rocky.png");
	
	public ImageIcon returnImg() {
		return img;
	}
	
	public String returnName() {
		return resource_name;
	}
	
}