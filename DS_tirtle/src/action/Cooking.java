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
		String a = clickButton.getText();

		Empty empty = new Empty();
		
		Item[] potSlot = {empty, empty, empty, empty};
		
		Item resultSlot = empty;
		
		//��� ����
		int br = 0, cr = 0, fs = 0, fl = 0, mt = 0, mm = 0, mr = 0, tg = 0;
		
		if(clickButton.getText().equals("Ȱ�� ������") ) {

			Menu menu = new Menu();
			System.out.println("Ȱ�� ������");
		}
		
		//�丮 ���� ��ư�� ���
		else if(clickButton.getText().equals("�丮����") ) {
			
			//potSlot�� ��Ḧ ������ ��ȯ.
			for(int i = 0; i < 4; i++) {
				if(potSlot[i] instanceof Berry)
					br++;
				else if(potSlot[i] instanceof Carrot)
					cr++;
				else if(potSlot[i] instanceof Fish)
					fs++;
				else if(potSlot[i] instanceof FrogLeg)
					fl++;
				else if(potSlot[i] instanceof Meat)
					mt++;
				else if(potSlot[i] instanceof MonsterMeat)
					mm++;
				else if(potSlot[i] instanceof Mushroom)
					mr++;
				else if(potSlot[i] instanceof Twigs)
					tg++;
			}
			
			//potSlot�� �� ���� �ִٸ� ���
			if(potSlot[0] == empty || potSlot[1] == empty || potSlot[2] == empty || potSlot[3] == empty) {
				System.out.println("��Ḧ 4�� �־��ּ���.");
			}
			
			//
			else {
				Cooking start = new Cooking();
			}
		}
		else if(clickButton.getText().equals("���� 1")) {
			clickButton.setIcon(slot0);
			System.out.println("���� 1");
		}
		else if(clickButton.getText().equals("���� 2")) {
			clickButton.setIcon(slot1);
			System.out.println("���� 2");
		}
		else if(clickButton.getText().equals("���� 3") ) {
			clickButton.setIcon(slot2);
			System.out.println("���� 3");
		}
		else if(clickButton.getText().equals("���� 4") ) {
			clickButton.setIcon(slot3);
			System.out.println("���� 4");
		}
		else
			;
	}
	
}