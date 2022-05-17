package action;

import javax.swing.*;
import java.awt.*;
import item.*;
import user.*;

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
	//���� �г� ����
	JPanel makingPanel = new JPanel();
		
	//���� ����, ������ ��ư ��ü �迭 ����
	JButton[][] makingButton = new JButton[2][2];
	
	//���� �гο� �������� ����ֱ�
		void inputItem() {
			
			//�����ϱ� �г� ����
			makingPanel.add(makingButton[0][0]);
			makingPanel.add(makingButton[0][1]);
			makingPanel.add(makingButton[1][0]);
			makingPanel.add(makingButton[1][1]);
			
			makingButton[0].setIcon(item.Armors.imageIcon);
			makingButton[0].setText(item.Armors.name);
			
			makingButton[1].setIcon(item.Weapons.imageIcon);
			makingButton[1].setText(item.Weapons.name);
			
			makingButton[0][0].setIcon(item.armors.GrassSuit.imageIcon);
			makingButton[0][0].setText(item.armors.GrassSuit.name);
			
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
		makingArmorPanel.setLayout(new FlowLayout());
		
		//�����ϱ� ��ư �����
		JButton makingGrassSuit = new JButton(grassSuit);
		makingGrassSuit.addActionListener(GameSystem.userListener);
		JButton makingLogSuit = new JButton(logSuit);
		makingLogSuit.addActionListener(GameSystem.userListener);

		//�����ϱ� �гο� �����ϱ� ��ư ��ġ�ϱ�
		makingArmorPanel.add(makingLogSuit);
		makingArmorPanel.add(makingLogSuit);
		
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
		makingWeaponsPanel.setLayout(new FlowLayout());
		
		//�����ϱ� ��ư �����
		JButton makingSpear = new JButton(spear);
		makingSpear.addActionListener(GameSystem.userListener);

		//�����ϱ� �гο� �����ϱ� ��ư ��ġ�ϱ�
		makingWeaponsPanel.add(makingSpear);
		
		//�����ϱ� �г� ��ġ�ϱ�
		GameSystem.playPanel.removeAll();
		GameSystem.playPanel.add(makingWeaponsPanel);
		
		//�߾� �г� �ٽ� �׸���
		GameSystem.playPanel.revalidate();
		GameSystem.playPanel.repaint();
	}
	
}

class MakingEventCheck {

	//�޴��г� ��ư üũ ������
	public MakingEventCheck(JButton clickButton) {
		//�� ����� ��ư�� ���
		if(clickButton.getText().equals("�� �����") ) {
				/*MakingArmors Ŭ������ �߻����Ѽ� �� �����*/

			MakingArmors makingArmors = new MakingArmors();

		}
		//���� ����� ��ư�� ���
		else if(clickButton.getText().equals("���� �����") ) {
				/*MakingWeapons Ŭ������ �߻����Ѽ� ���� �����*/
	
			MakingWeapons makingWeapons = new MakingWeapons(); 
		}
		
		else
			;
	}
}