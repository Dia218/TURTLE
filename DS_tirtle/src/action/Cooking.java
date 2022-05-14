package action;

import java.awt.*;
import javax.swing.*;
import java.util.*;

import user.Item;
import user.System;


public class Cooking {

	/*
	 * ��� ���� - �丮 ��� ��� - �κ��丮�� ����
	 */
	
	//�� �г� ����
	JPanel potPanel = new JPanel();
	
	//�� ��� �г�
	JPanel resultPanel = new JPanel();

	//�� ��ư ��ü �迭 ����
	JButton[] potButton = new JButton[4];
	
	//�� ��� ��ư ��ü �迭 ����
	JButton[] resultButton = new JButton[4];
	
	//�丮 ��� ��ü���� ������ ���� ����
	Vector<Item> potItem = new Vector<Item>();
	
	//�丮 ��� ��ü�� ������ ���� ����
	Vector<Item> resultItem = newVector<Item>();
	
	Object[] objs;
	
	//���â�� ����� �ؽ�Ʈ �ʵ�
	String result;
	
	
	//�丮�ϱ� �޼ҵ�
	
	//���þ����� ��ü�� �丮 ��� ������ ��ü�� �ֱ�
	//Item potItem = user.Inventory.vector.get(i);	//Inventory import �ʿ�
	
	//�ܿ� ���õ� �������� ����ֱ�
	void inputItem(Item item) {
		
		//�������� �ֱ� ��, �κ��丮�� ����ִ� �������� ����
		int vectorSize = potItem.size();
		
		//�κ��丮 �뷮�� �ʰ��� ���
		if (vectorSize >= 4) {
			 result = "���� �� á���ϴ�.";
		}
		else {
			potItem.add(item);
			
			//���Ϳ��� ��� ������ ������ ��ü�� �ε��� ��
			int index = item.size()-1;
			
			//���� �ε��� ���� ������ �ε����� ��ư�� �̹��� ����
			potButton[index].setIcon(item.imageIcon);
			potButton[index].setText(item.name);
		}
		
		
	}
	
	//������ ��ü�� ���� ������ ����
	void sort(Vector<Item> item) {
		objs = item.toArray();

		Arrays.sort(objs);
	}
	
	//������ �к��Ͽ� �丮 ����
	void cook () {
		//�켱���� 1: �������ڳ�
		if(objs[0] == "MonsterMeat", objs[1] == "MonsterMeat", objs[2] != "Twigs", objs[3] != "Twigs")
			resultItem.add(MonsterLasagna);
		//�켱���� 2: ��Ʈ��Ʃ
		else if(objs[0] == "Meat", objs[1] == "Meat", objs[2] != "Twigs", objs[3] != "Twigs")
			resultItem.add(MeatStew);
		//�켱���� 3: 
		else if(objs[0] == "Meat", objs[2] != "Twigs", objs[2] !="Twigs", objs[3] != "Twigs")
			resultItem.add(Meatball);
		//��ᰡ ��ġ�� ���� ������ǰ. (������ǰ �������� �켱����. ���� ����)
		else {
			if(objs[0] == "Berry", obj[1] == "Berry", obj[2] == "Berry", obj[3] == "Berry") {
				resultItem.add("BerryJam");
			}
			else if(objs[0] == "Fish", obj[1] != "Twigs", obj[2] == "Twigs", obj[3] == "Twigs" || obj[0] != "Twigs", obj[1] == "Fish", obj[2] == "Twigs", obj[3] == "Twigs")
				resultItem.add("Fishsticks");
			else if(objs[0] == "Carrot", obj[1] != "Carrot", obj[2] == "Carrot", obj[3] == "Carrot" || objs[0] == "Carrot", obj[1] != "Carrot", obj[2] == "Carrot", obj[3] == "Mushroom" || objs[0] == "Carrot", obj[1] != "Carrot", obj[2] == "Mushroom", obj[3] == "Mushroom" || objs[0] == "Carrot", obj[1] != "Mushroom", obj[2] == "Mushroom", obj[3] == "Mushroom" || objs[0] == "Mushroom", obj[1] != "Mushroom", obj[2] == "Mushroom", obj[3] == "Mushroom")
				resultItem.add("Ratatouille");
			else if(objs[0] == "Carrot", obj[1] != "Carrot", obj[2] == "Carrot", obj[3] == "FrogLeg" || objs[0] == "Carrot", obj[1] != "Carrot", obj[2] == "FrogLeg", obj[3] == "Mushroom" || objs[0] == "Carrot", obj[1] != "FrogLeg", obj[2] == "Mushroom", obj[3] == "Mushroom" || objs[0] == "FrogLeg", obj[1] != "Mushroom", obj[2] == "Mushroom", obj[3] == "Mushroom")
				resultItem.add("Sandwich");
			else
				resultItem.add("WetGoop");
		}
		
		//������ǰ�� �κ��丮�� �߰�
		void inputResultItem() {
			inputItem(resultItem);
		}
		
	}
	
	public Cooking() {
		
		//�� �г� ��ġ ������
		//potPanel.setLayout(new //?(4, 1));
		//�� ��� �г� ��ġ ������ 
		//resultPanel.setLayout(new //?(1, 1));
		
		//�κ��丮 ��ư �ʱ�ȭ �� ��ġ
		for(int i = 0; i <= 4; i++) {
			potPanel.add(potButton[i] = new JButton("Empty"));
			potButton[i].addActionListener(System.userListener);
		}

		resultPanel.add(resultButton[0] = new JButton("Empty"));
		resultButton[0].addActionListener(System.userListener);
	}

}
