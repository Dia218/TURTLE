package world.object;

import javax.swing.ImageIcon;

public class Tree extends Object{
	
	private String resource_name = "³ª¹«";

	static private ImageIcon img = new ImageIcon("./images/Tree.png");
	
	public ImageIcon returnImg() {
		return img;
	}
	
	public String returnName() {
		return resource_name;
	}
	
	void getResource(){}
}