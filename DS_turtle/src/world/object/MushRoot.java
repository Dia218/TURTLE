package world.object;

import javax.swing.ImageIcon;

public class MushRoot extends Object{

	private String resource_name = "�����Ѹ�";

	static private ImageIcon img = new ImageIcon("./images/Mushroom.png");
	
	public ImageIcon returnImg() {
		return img;
	}
	
	public String returnName() {
		return resource_name;
	}
	
	void getResource(){}
}
