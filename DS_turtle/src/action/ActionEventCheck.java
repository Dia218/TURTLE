package action;

import javax.swing.JButton;

import gui.*;

public class ActionEventCheck{
	
	//�̺�Ʈ�� �߻��� ��ư�� Ȯ���ϴ� �޼ҵ�
		public void checkbutton(JButton clickButton) {
			
			new MakingEventCheck(clickButton);
			new CookingEventCheck(clickButton);
			//��ư�� üũ�ϴ� Ŭ�������� �߻���Ŵ
		}
}