package world.resource;

import javax.swing.ImageIcon;

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