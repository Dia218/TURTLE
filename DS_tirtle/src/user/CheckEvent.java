package user;

import javax.swing.*;
import action.*;

public class CheckEvent {

	//�̺�Ʈ�� �߻��� ��ư�� Ȯ���ϴ� �޼ҵ�
	public void checkbutton(JButton clickButton) {
		System.out.println("�̺�Ʈ �߻�");

		//��ư�� üũ�ϴ� Ŭ�������� �߻���Ŵ
		new StartEventCheck(clickButton);
		new MenuEventCheck(clickButton);
		new InventoryEventCheck(clickButton);
	}
	
}
