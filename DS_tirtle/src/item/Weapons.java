package item;

import javax.swing.ImageIcon;

public class Weapons extends Tools {
	//�̸�
	private String name;
	//�̹���
	private static ImageIcon img;
	//������
	private int durability;
	//���ݷ�
	private int attack;
		
	
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
	public int returnATK() {
		return attack;
	}
}