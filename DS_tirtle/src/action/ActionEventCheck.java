package action;

import javax.swing.JButton;
import user.*;

public class ActionEventCheck {
	//�� �޴��г� ��ư üũ ������
	public ActionEventCheck(JButton clickButton) {

		//�� ����� ��ư�� ���
		if(clickButton.getText().equals("Ȱ�� ������") ) {
			/*MakingArmors Ŭ������ �߻����Ѽ� �� �����*/

			Menu menu = new Menu();

		}
		else if(clickButton.getText().equals("�� �����") ) {
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
