package world_resource;

import javax.swing.ImageIcon;

public class Frog_Legs extends Resource {
	
	private String resource_name = "개구리 다리";

	static private ImageIcon img = new ImageIcon("./images/Frog_Legs.png");
	
	public ImageIcon returnImg() {
		return img;
	}
	
	public String returnName() {
		return resource_name;
	}
	
}