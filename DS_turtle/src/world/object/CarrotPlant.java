package world.object;

import javax.swing.ImageIcon;

public class CarrotPlant extends Object{

	private String resource_name = "´ç±Ù»Ñ¸®";

	static private ImageIcon img = new ImageIcon("./images/CarrotPlant.png");
	
	public ImageIcon returnImg() {
		return img;
	}
	
	public String returnName() {
		return resource_name;
	}
	
	void getResource(){}
}
