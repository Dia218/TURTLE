package action;

import javax.swing.*;
import java.awt.*;
import item.*;
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
	
	
	/*
		
	//���� ����, ������ ��ư ��ü �迭 ����
	JButton[][] makingButton = new JButton[2][2];
	
	//���� �гο� �������� ����ֱ�
		void inputItem() {
			
			//��ư �̺�Ʈ ������
			if (makingButton[0][0].addActionListener(ActionEvent)) {
				//�κ��丮 ����
				int vectorSize = vector.size();
				
				String result;
				
				//���ᰡ ������ ��
				if (consumeItem(Grass, Twigs) == 0) {
					 result = "��ᰡ �����մϴ�..";
					 break;
				}
				//���� �� ��
				else {
					consumeItem(Grass, Twigs);
					inputItem(GrassSuit);
				}
			}
			makingButton[0][1].setIcon(item.armors.LogSuit.imageIcon);
			makingButton[0][1].setText(item.armors.LogSuit.name);
			if (makingButton[0][0].addActionListener(ActionEvent)) {
				int vectorSize = vector.size();
				String result;
				if (consumeItem(Grass, Log) == 0) {
					 result = "��ᰡ �����մϴ�.";
					 break;
				}
				else {
					consumeItem(Grass, Log);
					inputItem(LogSuit);
				}
			}
			
			makingButton[1][0].setIcon(item.weapons.Spear.imageIcon);
			makingButton[1][0].setText(item.weapons.Spear.name); {
				int vectorSize = vector.size();
				String result;
				if (consumeItem(Twigs, Stone) == 0) {
					 result = "��ᰡ �����մϴ�..";
					 break;
				}
				else {
					consumeItem(Twigs, Stone);
					inputItem(Spear);
				}
			}
			makingButton[1][1].setIcon(item.weapons.TentacleSpike.imageIcon);
			makingButton[1][1].setText(item.weapons.TentacleSpike.name);
			}

		
*/	
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
		
		else if(clickButton.getText().equals("���� �����") ) {
			/*MakingArmors Ŭ������ �߻����Ѽ� �� �����*/

				MakingWeapons makingWeapons = new MakingWeapons();
				
		}
		
		else if(clickButton.getText().equals("Ǯ ���� �����") ) {

			System.out.println("Ǯ ���� �����");
		}
		
		else if(clickButton.getText().equals("���� ���� �����") ) {
			
			System.out.println("���� ���� �����");
		}
		
		else if(clickButton.getText().equals("â �����") ) {
			
			System.out.println("â �����");
		}

		else
			;
	}
	
}
