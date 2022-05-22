package world.resource;

import javax.swing.ImageIcon;

import world.Resource;

public class CutGrass  extends Resource {
	
	private String resource_name = "ÀÚ¸¥ Ç®";

	static private ImageIcon img = new ImageIcon("./images/CutGrass.png");
	
	public ImageIcon returnImg() {
		return img;
	}
	
	public String returnName() {
		return resource_name;
	}
	
}