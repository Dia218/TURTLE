package item;

import javax.swing.ImageIcon;
import item.armors.*;

public class Armors extends Tools {
	//�̸�
	private String name;
	//�̹���
	private static ImageIcon img;
	//������
	private int durability;
	//����
	private int defence;
	
	
	//�̸� return
	public String returnName() {
		return name;
	}
	//�̹��� ������ return
	public ImageIcon returnImg() {
		return img;
	}
	//������ return
	public int returnDurability() {
		return durability;
	}
	//���� return
	public int returnDEF() {
		return defence;
	}
	
}