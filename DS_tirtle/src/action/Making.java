package action;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import item.*;
import user.*;

public class Making {

	/*
	 * �����ϰ� ���� ������ ��ư Ŭ��(�ڵ� ������ �Ҹ�) - ���� ��� ��� - �κ��丮�� ����
	 */
	
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
		
		
>>>>>>> af339bbd79ee4ee31bfc6d09a42a0afed7854e69
}

}