package user;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Inventory {
	
	////�κ��丮 Ŭ���� �ʵ�////
	//�κ��丮 �г� ����
	JPanel inventoryPanel = new JPanel();
	//������ ��ü���� ������ ���� ����
	Vector<Item> vector = new Vector<Item>(21);
	
	/*
	 * ���Ϳ� ��� �����ϴ� ��
	 * vector.add(ItemŬ���� ��ü);
	 * 
	 * �κ��丮���� ������ �����ؼ� '���þ�����' ���۷����� ��ü �����ϴ¹�
	 * Item chooseItem = vector.get(i);
	 * 
	 * */
	
	void test() {
		for(int i = 1; i <= 21; i++) {
			 vector.get(i) ;

			 inventoryPanel.add(inventoryButton[i] = new JButton("Empty"));
		}
	}

	
	////�κ��丮 Ŭ���� ������////
	//�κ��丮 Ŭ���� �⺻ ������
	public Inventory() {
		
		//�κ��丮 �г� ��ġ ������ - �׸��巹�̾ƿ�
		inventoryPanel.setLayout(new GridLayout(7, 3));
		
		//�κ��丮 ��ư ��ü �迭 ����
		JButton[] inventoryButton = new JButton[21];
		//�κ��丮 ��ư ��ġ
		for(int i = 0; i <= 20; i++) {
			inventoryPanel.add(inventoryButton[i] = new JButton("Empty"));
		}
	}
	

}
