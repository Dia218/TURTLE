package action;

import javax.swing.*;
import java.awt.*;
import item.*;
import item.armors.*;
import item.weapons.*;
import user.*;
import user.Menu;

public class Making {

	/*
	 * �����ϰ� ���� ������ ��ư Ŭ��(�ڵ� ������ �Ҹ�) - ���� ��� ��� - �κ��丮�� ����
	 */
	
	//�⺻ ������
	public Making() {

		//�����ϱ� �г� ����
		JPanel makingPanel = new JPanel();

		//�����ϱ� �г� ��ġ ������ - �÷ο췹�̾ƿ�
		makingPanel.setLayout(new FlowLayout());

		//�����ϱ� ��ư �����
		JButton makingArmors = new JButton("�� �����");
		makingArmors.addActionListener(GameSystem.userListener);
		JButton makingWeapons = new JButton("���� �����");
		makingWeapons.addActionListener(GameSystem.userListener);

		//�����ϱ� �гο� �����ϱ� ��ư ��ġ�ϱ�
		makingPanel.add(makingArmors);
		makingPanel.add(makingWeapons);
		
		//�����ϱ� �г� ��ġ�ϱ�
		GameSystem.playPanel.removeAll();
		GameSystem.playPanel.add(makingPanel);
		
		//�߾� �г� �ٽ� �׸���
		GameSystem.playPanel.revalidate();
		GameSystem.playPanel.repaint();
	}
	
}

class MakingArmors {
	
	//�� ����� ������
	public MakingArmors() {

		//�����ϱ� �г� ����
		JPanel makingArmorPanel = new JPanel();

		ImageIcon grassSuit = new ImageIcon("./images/Grass_Suit.png");
		ImageIcon logSuit = new ImageIcon("./images/Log_Suit.png");

		//�����ϱ� �г� ��ġ ������ - �÷ο췹�̾ƿ�
		makingArmorPanel.setLayout(new GridLayout(3, 1));
		
		//�����ϱ� ��ư �����
		JButton makingGrassSuit = new JButton("Ǯ ���� �����", grassSuit);
		makingGrassSuit.addActionListener(GameSystem.userListener);
		JButton makingLogSuit = new JButton("���� ���� �����", logSuit);
		makingLogSuit.addActionListener(GameSystem.userListener);
		JButton goBack = new JButton("Ȱ�� ������");
		goBack.addActionListener(GameSystem.userListener);

		//�����ϱ� �гο� �����ϱ� ��ư ��ġ�ϱ�
		makingArmorPanel.add(makingGrassSuit);
		makingArmorPanel.add(makingLogSuit);
		makingArmorPanel.add(goBack);
		
		
		//�����ϱ� �г� ��ġ�ϱ�
		GameSystem.playPanel.removeAll();
		GameSystem.playPanel.add(makingArmorPanel);
		
		//�߾� �г� �ٽ� �׸���
		GameSystem.playPanel.revalidate();
		GameSystem.playPanel.repaint();
	}
	
}

class MakingWeapons {
	
	//���� ����� ������
	public MakingWeapons() {

		//�����ϱ� �г� ����
		JPanel makingWeaponsPanel = new JPanel();

		ImageIcon spear = new ImageIcon("./images/Spear.png");

		//�����ϱ� �г� ��ġ ������ - �÷ο췹�̾ƿ�
		makingWeaponsPanel.setLayout(new GridLayout(2, 1));
		
		//�����ϱ� ��ư �����
		JButton makingSpear = new JButton("â �����", spear);
		makingSpear.addActionListener(GameSystem.userListener);
		JButton goBack = new JButton("Ȱ�� ������");
		goBack.addActionListener(GameSystem.userListener);

		//�����ϱ� �гο� �����ϱ� ��ư ��ġ�ϱ�
		makingWeaponsPanel.add(makingSpear);
		makingWeaponsPanel.add(goBack);
		
		//�����ϱ� �г� ��ġ�ϱ�
		GameSystem.playPanel.removeAll();
		GameSystem.playPanel.add(makingWeaponsPanel);
		
		//�߾� �г� �ٽ� �׸���
		GameSystem.playPanel.revalidate();
		GameSystem.playPanel.repaint();
	}
	
}

class MakingEventCheck {
	public MakingEventCheck(JButton clickButton) {
	
		if(clickButton.getText().equals("Ȱ�� ������") ) {
			/*MakingArmors Ŭ������ �߻����Ѽ� �� �����*/

				Menu menu = new Menu();
				System.out.println("Ȱ�� ������");
		}
		
		//�� ����� ��ư�� ���
		else if(clickButton.getText().equals("�� �����") ) {
		/*MakingArmors Ŭ������ �߻����Ѽ� �� �����*/

			MakingArmors makingArmors = new MakingArmors();
		}
		
		//���� ����� ��ư�� ���
		else if(clickButton.getText().equals("���� �����") ) {
			/*MakingWeapons Ŭ������ �߻����Ѽ� ���� �����*/

				MakingWeapons makingWeapons = new MakingWeapons();
				
		}
		
		//Ǯ ���� ����� ��ư�� ���
		else if(clickButton.getText().equals("Ǯ ���� �����") ) {

			System.out.println("Ǯ ���� �����");
			/*
			//Ǯ, �ܰ��� �κ��丮 Ȯ��
			if(GameSystem.inventory.checkItem(new CutGrass()) && GameSystem.inventory.checkItem(new Twigs())) {
				//�κ��丮 ����
				GameSystem.inventory.consumeItem(new CutGrass());
				GameSystem.inventory.consumeItem(new Twigs());
				//�κ��丮 ����
				GameSystem.inventory.inputItem(new GrassSuit());
				
			}
			*/
		}
		 
		//���� ���� ����� ��ư�� ���
		else if(clickButton.getText().equals("���� ���� �����") ) {
			
			System.out.println("���� ���� �����");
			/*
			//Ǯ, �볪�� �κ��丮 Ȯ��
			if(GameSystem.inventory.checkItem(new CutGrass()) && GameSystem.inventory.checkItem(new Log())) {
				//�κ��丮 ����
				GameSystem.inventory.consumeItem(new CutGrass());
				GameSystem.inventory.consumeItem(new Log());
				//�κ��丮 ����
				GameSystem.inventory.inputItem(new LogSuit());
				
			}
			*/
		}
		
		//â ����� ��ư�� ���
		else if(clickButton.getText().equals("â �����") ) {
			
			System.out.println("â �����");
			/*
			//�ܰ���, �� �κ��丮 Ȯ��
			if(GameSystem.inventory.checkItem(new Twigs()) && GameSystem.inventory.checkItem(new Rock())) {
				//�κ��丮 ����
				GameSystem.inventory.consumeItem(new Twigs());
				GameSystem.inventory.consumeItem(new Rock());
				//�κ��丮 ����
				GameSystem.inventory.inputItem(new Spear());
			}
			*/
		}

		else
			;
	}
	
}
