package world.object;

import javax.swing.ImageIcon;

public class GrassTuft extends Object{

	private String resource_name = "Ç®»Ñ¸®";

	static private ImageIcon img = new ImageIcon("./images/GrassTuft.png");
	
	public ImageIcon returnImg() {
		return img;
	}
	
	public String returnName() {
		return resource_name;
	}
	
	void getResource(){}
}
