package item;

import javax.swing.ImageIcon;

public class ProcessedFoods extends Foods {
	//�̸�
	private static String name;
	//�̹���
	private static ImageIcon img;
	//��� ȸ����
	private static int starvePoint;
	//ü�� ȸ����
	private int healPoint;
	
	
	//�̸� return
	public String returnName() {
		return name;
	}
	//������ ������ return
	public ImageIcon returnImg() {
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