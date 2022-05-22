package world_resource;

import javax.swing.ImageIcon;

public class Monster_Meat extends Resource {
	
	private String resource_name = "±«¹° °í±â";

	static private ImageIcon img = new ImageIcon("./images/Monster_Meat.png");
	
	public ImageIcon returnImg() {
		return img;
	}
	
	public String returnName() {
		return resource_name;
	}
	
}