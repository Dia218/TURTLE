package action;

import java.util.Arrays;
import java.util.Vector;

import java.awt.*;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.*;

import item.*;
import item.armors.*;
import item.processedFoods.*;
import item.unprocessedFoods.*;
import item.weapons.*;
import user.*;
import user.Menu;
import world.resource.Twigs;


public class Cooking {

	/*
	 * ��� ���� - �丮 ��� ��� - �κ��丮�� ����
	 */
	
	//�丮�ϱ� ������
	public Cooking() {
		//�� �г� ����
		
		JPanel potPanel = new JPanel();
		
		//�� ��ư ��ü �迭 ����
		JButton[] potButton = new JButton[4];
		
		ImageIcon slot0Img = new ImageIcon("./images/slot0.png");
		
		ImageIcon slot1Img = new ImageIcon("./images/slot1.png");
		
		ImageIcon slot2Img = new ImageIcon("./images/slot2.png");
		
		ImageIcon slot3Img = new ImageIcon("./images/slot3.png");

		//�޴� �г� ��ġ ������ - �׸��巹�̾ƿ�
		potPanel.setLayout(new GridLayout(6, 1));
		
		//�κ��丮 ��ư �ʱ�ȭ �� ��ġ
		potPanel.add(potButton[0] = new JButton("���� 1" ,slot0Img));
		potButton[0].addActionListener(GameSystem.userListener);
		System.out.println("���� 1 �̹��� �ʱ�ȭ");
		
		potPanel.add(potButton[1] = new JButton("���� 2" ,slot1Img));
		potButton[1].addActionListener(GameSystem.userListener);
		System.out.println("���� 2 �̹��� �ʱ�ȭ");
		
		potPanel.add(potButton[2] = new JButton("���� 3" ,slot2Img));
		potButton[2].addActionListener(GameSystem.userListener);
		System.out.println("���� 3 �̹��� �ʱ�ȭ");
		
		potPanel.add(potButton[3] = new JButton("���� 4" ,slot3Img));
		potButton[3].addActionListener(GameSystem.userListener);
		System.out.println("���� 4 �̹��� �ʱ�ȭ");

		
		//�丮���� ��ư ���� �� ��ġ
		JButton start = new JButton("�丮����");
		potPanel.add(start);
		start.addActionListener(GameSystem.userListener);
		
		//Ȱ�� ������ ��ư ���� �� ��ġ
		JButton goBack = new JButton("Ȱ�� ������");
		potPanel.add(goBack);
		goBack.addActionListener(GameSystem.userListener);

		//�޴� �г� ��ġ�ϱ�
				GameSystem.playPanel.removeAll();
				GameSystem.playPanel.add(potPanel);
				
				//�߾� �г� �ٽ� �׸���
				GameSystem.playPanel.revalidate();
				GameSystem.playPanel.repaint();
	}
	
}
	
class CookingEventCheck {
	public CookingEventCheck(JButton clickButton) {
		
		ImageIcon slot0 = new ImageIcon("./images/slot0.png");
		ImageIcon slot1 = new ImageIcon("./images/slot1.png");
		ImageIcon slot2 = new ImageIcon("./images/slot2.png");
		ImageIcon slot3 = new ImageIcon("./images/slot3.png");

		//�� ���� ������ ��ü ����
		Empty empty = new Empty();
		
		//���� ������ ��ü �迭 ����
		Item[] potSlot = {empty, empty, empty, empty};
		
		//������ ��� ��ü ����
		Item resultSlot = empty;
		
		//��� ����
		int br = 0, cr = 0, fs = 0, fl = 0, mt = 0, mm = 0, mr = 0, tg = 0;
		
		//Ȱ�� ������ ��ư�� ���� ���
		if(clickButton.getText().equals("Ȱ�� ������") ) {

			//�޴� ����
			Menu menu = new Menu();
			System.out.println("Ȱ�� ������");
		}
		
		//�丮 ���� ��ư�� ���
		else if(clickButton.getText().equals("�丮����") ) {
			
			//potSlot�� ��Ḧ ������ ��ȯ.
			for(int i = 0; i < 4; i++) {
				//����
				if(potSlot[i] instanceof Berry)
					br++;
				//���
				else if(potSlot[i] instanceof Carrot)
					cr++;
				//�����
				else if(potSlot[i] instanceof Fish)
					fs++;
				//�������ٸ�
				else if(potSlot[i] instanceof FrogLeg)
					fl++;
				//���
				else if(potSlot[i] instanceof Meat)
					mt++;
				//�������
				else if(potSlot[i] instanceof MonsterMeat)
					mm++;
				//����
				else if(potSlot[i] instanceof Mushroom)
					mr++;
				//�ܰ���
				else if(potSlot[i] instanceof Twigs)
					tg++;
			}
			
			//potSlot�� �� ���� �ִٸ� ���
			if(potSlot[0] == empty || potSlot[1] == empty || potSlot[2] == empty || potSlot[3] == empty) {
				System.out.println("��Ḧ 4�� �־��ּ���.");
			}
			//�������ڳ� �丮
			else if(mm >= 2 && tg == 0) {
				MonsterLasagna result = new MonsterLasagna();
				for(int i = 0; i < 4; i++)
					GameSystem.inventory.consumeItem(potSlot[i]);
				GameSystem.inventory.inputItem(result);
				Cooking start = new Cooking();
				GameSystem.player.changeStarvePoint(-5);
			}
			//��Ʈ��Ʃ �丮
			else if(mt >= 2 && tg == 0) {
				MeatStew result = new MeatStew();
				for(int i = 0; i < 4; i++)
					GameSystem.inventory.consumeItem(potSlot[i]);
				GameSystem.inventory.inputItem(result);
				Cooking start = new Cooking();
				GameSystem.player.changeStarvePoint(-5);
			}
			//������ġ �丮
			else if(fl == 1 && cr == 0 && mr == 3 || fl == 1 && cr == 1 && mr == 2 || fl == 1 && cr == 2 && mr == 1 || fl == 1 && cr == 3 && mr == 0) {
				Sandwich result = new Sandwich();
				for(int i = 0; i < 4; i++)
					GameSystem.inventory.consumeItem(potSlot[i]);
				GameSystem.inventory.inputItem(result);
				Cooking start = new Cooking();
				GameSystem.player.changeStarvePoint(-5);
			}
			//������� �丮
			else if(cr == 0 && mr == 4 || cr == 1 && mr == 3 || cr == 2 && mr == 2 || cr == 3 && mr == 1 || cr == 4 && mr == 0) {
				Ratatouille result = new Ratatouille();
				for(int i = 0; i < 4; i++)
					GameSystem.inventory.consumeItem(potSlot[i]);
				GameSystem.inventory.inputItem(result);
				Cooking start = new Cooking();
				GameSystem.player.changeStarvePoint(-5);
			}
			//��Ʈ�� �丮
			else if(mt == 1 && tg == 0) {
				MeatBall result = new MeatBall();
				for(int i = 0; i < 4; i++)
					GameSystem.inventory.consumeItem(potSlot[i]);
				GameSystem.inventory.inputItem(result);
				Cooking start = new Cooking();
				GameSystem.player.changeStarvePoint(-5);
			}
			//����Ƣ�� �丮
			else if(fs == 1 && tg == 2) {
				Fishsticks result = new Fishsticks();
				for(int i = 0; i < 4; i++)
					GameSystem.inventory.consumeItem(potSlot[i]);
				GameSystem.inventory.inputItem(result);
				Cooking start = new Cooking();
				GameSystem.player.changeStarvePoint(-5);
			}
			//������ �丮
			else if(br == 4) {
				BerryJam result = new BerryJam();
				for(int i = 0; i < 4; i++)
					GameSystem.inventory.consumeItem(potSlot[i]);
				GameSystem.inventory.inputItem(result);
				Cooking start = new Cooking();
				GameSystem.player.changeStarvePoint(-5);
			}
			//���� �丮
			else {
				WetGoop result = new WetGoop();
				for(int i = 0; i < 4; i++)
					GameSystem.inventory.consumeItem(potSlot[i]);
				GameSystem.inventory.inputItem(result);
				Cooking start = new Cooking();
				GameSystem.player.changeStarvePoint(-5);
			}
		}
		
		//���� 1 ��ư�� ���� ���
		else if(clickButton.getText().equals("���� 1")) {
			clickButton.setIcon(slot0);
			System.out.println("���� 1");
		}

		//���� 2 ��ư�� ���� ���
		else if(clickButton.getText().equals("���� 2")) {
			clickButton.setIcon(slot1);
			System.out.println("���� 2");
		}

		//���� 3 ��ư�� ���� ���
		else if(clickButton.getText().equals("���� 3") ) {
			clickButton.setIcon(slot2);
			System.out.println("���� 3");
		}

		//���� 4 ��ư�� ���� ���
		else if(clickButton.getText().equals("���� 4") ) {
			clickButton.setIcon(slot3);
			System.out.println("���� 4");


		}
		
		else
			;
	}
	
}