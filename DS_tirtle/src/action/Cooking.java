package action;

import java.util.Arrays;
import java.util.Vector;

import java.awt.*;
import javax.swing.*;

import item.*;
import item.armors.*;
import item.processedFoods.*;
import item.unprocessedFoods.*;
import item.weapons.*;
import user.*;


public class Cooking {

	/*
	 * ��� ���� - �丮 ��� ��� - �κ��丮�� ����
	 */

	//�丮�ϱ� ������
	public Cooking() {
		
		//�� �г� ����
		JPanel potPanel = new JPanel();
		
		//�� ��ư ��ü �迭 ����
		JButton[] potButton = new JButton[6];
		
		ImageIcon slot = new ImageIcon("./images/slot.png");

		JButton potresultButton = new JButton();
		
		//�޴� �г� ��ġ ������ - �÷ο췹�̾ƿ�
		potPanel.setLayout(new GridLayout(5, 1));
		
		//�κ��丮 ��ư �ʱ�ȭ �� ��ġ
		for(int i = 0; i <= 3; i++) {
			potPanel.add(potButton[i] = new JButton(slot));
			potButton[i].addActionListener(GameSystem.userListener);
		}

		potPanel.add(potButton[4] = new JButton("�丮�ϱ�"));
		potButton[4].addActionListener(GameSystem.userListener);

		//�޴� �г� ��ġ�ϱ�
		GameSystem.playPanel.removeAll();
		GameSystem.playPanel.add(potPanel);
		
		//�߾� �г� �ٽ� �׸���
		GameSystem.playPanel.revalidate();
		GameSystem.playPanel.repaint();
	}
	
/*	
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
		if(potButton[0].returnName == "MonsterMeat", potButton[1] == "MonsterMeat", objs[2] != "Twigs", objs[3] != "Twigs") {
			resultItem.add(MonsterLasagna);
			consumeItem(MonsterMeat);
			consumeItem(MonsterMeat);
			
			
			resultButton.setIcon(item.MonsterLasagna.imageIcon);
			resultButton.setText(item.MonsterLasagna.name);
		}
		
		//�켱���� 2: ��Ʈ��Ʃ
		else if(objs[0] == "Meat", objs[1] == "Meat", objs[2] != "Twigs", objs[3] != "Twigs") {
			resultItem.add(MeatStew);

			resultButton.setIcon(item.MeatStew.imageIcon);
			resultButton.setText(item.MeatStew.name);
		}
		
		//�켱���� 3: 
		else if(objs[0] == "Meat", objs[2] != "Twigs", objs[2] !="Twigs", objs[3] != "Twigs") {
			resultItem.add(Meatball);

			resultButton.setIcon(item.Meatball.imageIcon);
			resultButton.setText(item.Meatball.name);
		}
		
		//��ᰡ ��ġ�� ���� ������ǰ. (������ǰ �������� �켱����. ���� ����)
		else {
			//�� �� ��
			if(objs[0] == "Berry", obj[1] == "Berry", obj[2] == "Berry", obj[3] == "Berry") {
				resultItem.add(BerryJam);

				resultButton.setIcon(item.BerryJam.imageIcon);
				resultButton.setText(item.BerryJam.name);
			}
			
			//����Ƣ��
			else if(objs[0] == "Fish", obj[1] != "Twigs", obj[2] == "Twigs", obj[3] == "Twigs" || obj[0] != "Twigs", obj[1] == "Fish", obj[2] == "Twigs", obj[3] == "Twigs") {
				resultItem.add(Fishsticks);

				resultButton.setIcon(Fishsticks.returnImg);
				resultButton.setText(Fishsticks.returName);
			}
			
			//�������
			else if(objs[0] == "Carrot", obj[1] != "Carrot", obj[2] == "Carrot", obj[3] == "Carrot" || objs[0] == "Carrot", obj[1] != "Carrot", obj[2] == "Carrot", obj[3] == "Mushroom" || objs[0] == "Carrot", obj[1] != "Carrot", obj[2] == "Mushroom", obj[3] == "Mushroom" || objs[0] == "Carrot", obj[1] != "Mushroom", obj[2] == "Mushroom", obj[3] == "Mushroom" || objs[0] == "Mushroom", obj[1] != "Mushroom", obj[2] == "Mushroom", obj[3] == "Mushroom") {
				resultItem.add(Ratatouille);

				resultButton.setIcon(item.Ratatouille.imageIcon);
				resultButton.setText(item.Ratatouille.name);
			}
			
			//������ġ
			else if(objs[0] == "Carrot", obj[1] != "Carrot", obj[2] == "Carrot", obj[3] == "FrogLeg" || objs[0] == "Carrot", obj[1] != "Carrot", obj[2] == "FrogLeg", obj[3] == "Mushroom" || objs[0] == "Carrot", obj[1] != "FrogLeg", obj[2] == "Mushroom", obj[3] == "Mushroom" || objs[0] == "FrogLeg", obj[1] != "Mushroom", obj[2] == "Mushroom", obj[3] == "Mushroom") {
				resultItem.add(Sandwich);

				resultButton.setIcon(item.Sandwich.imageIcon);
				resultButton.setText(item.Sandwich.name);
			}
			
			//����
			else {
				resultItem.add(WetGoop);

				resultButton.setIcon(item.WetGoop.imageIcon);
				resultButton.setText(item.WetGoop.name);
			}
		}
		
		//������ǰ�� �κ��丮�� �߰�
		void inputResultItem() {
			inputItem(resultItem);
		}
		
	}
*/
}
