package item;

import javax.swing.ImageIcon;
import item.unprocessedFoods.*;

public class UnprocessedFoods extends Foods {
	//�̸�
	private String name;
	//�̹���
	static private ImageIcon img;
	//��� ȸ����
	private int starvePoint;
	//ü�� ȸ����
	private int healPoint;
		
		
	//�̸� return
	public String returnName() {
		return name;
	}
	//������ ������ return
	public static ImageIcon returnImg() {
		return img;
	}
	//��� ȸ���� return
	public int returnStarvePoint() {
		return starvePoint;
	}
	//ü�� ȸ���� return
	public int returnHealPoint() {
		return healPoint;
	}
}