package world_resource;

import javax.swing.ImageIcon;

public class Frog_Legs extends Resource {
	
	private String resource_name = "������ �ٸ�";

	static private ImageIcon img = new ImageIcon("./images/Frog_Legs.png");
	
	public ImageIcon returnImg() {
		return img;
	}
	
	public String returnName() {
		return resource_name;
	}
	
}