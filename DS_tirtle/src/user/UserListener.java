package user;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class UserListener implements ActionListener, ItemListener {
	
	/*
	 * ���������� Ŭ������ �ʵ�
	 * */
	
	//�̺�Ʈ�� �߻��� ��ư�� ���۷���
	private JButton clickButton;
	
	//��ư üũ Ŭ���� ����
	 CheckEvent checkevent = new CheckEvent();
	
	 
	/*
	 * ���������� Ŭ������ �޼ҵ�
	 * */
	 
	//��ư �̺�Ʈ ����
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//�̺�Ʈ�� �߻��� ��ư �����ϱ�
		clickButton = (JButton)e.getSource();
		
		//��ư�� üũ�ϴ� �޼ҵ� ȣ���ϱ� -> ������ ��Ű��
		checkevent.checkbutton(clickButton);
	}
	
	
	//üũ�ڽ� �̺�Ʈ ����
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getStateChange() == ItemEvent.SELECTED) {
			//�̺�Ʈ�� �߻��� üũ�ڽ�
			JCheckBox selectedItem = (JCheckBox)e.getItem();
		}
		else {
			return;
		}
		//e.setSelected(false);
	}
}
