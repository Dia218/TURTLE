package gui;

import javax.swing.*;
import action.*;

public class CheckEvent {

	//�̺�Ʈ�� �߻��� ��ư�� Ȯ���ϴ� �޼ҵ�
	public void checkbutton(JButton clickButton) {
		//���� Ȯ��
		System.out.println("��ư Ȯ�� ��ü�� ���� �޼ҵ� ȣ��");
		
		//��ư�� üũ�ϴ� Ŭ�������� �߻���Ŵ
		new StartEventCheck(clickButton);
		new MenuEventCheck(clickButton);
		new InventoryEventCheck(clickButton);
	}
	
}
