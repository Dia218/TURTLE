package world.object;

import javax.swing.ImageIcon;

public class Boulder extends Object{

	private String resource_name = "πŸ¿ß";

	static private ImageIcon img = new ImageIcon("./images/Rock.png");
	
	public ImageIcon returnImg() {
		return img;
	}
	
	public String returnName() {
		return resource_name;
	}
	
	void getResource(){}
}
