package manage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import action.*;
import action.Cooking;
import gui.CheckEvent;

public class UserListener extends MouseAdapter implements ActionListener, ItemListener {
	
	/*
	 * ���������� Ŭ������ �ʵ�
	 * */
	
	//�̺�Ʈ�� �߻��� ��ư�� ���۷���
	private JButton clickButton;
	//�̺�Ʈ�� �߻��� üũ�ڽ��� ���۷���
	private JCheckBox clickBox;
	
	//�̺�Ʈ üũ Ŭ���� ����
	 CheckEvent checkevent = new CheckEvent();
	 ActionEventCheck actioncheckevent = new ActionEventCheck();
	 
	 
	 
	/*
	 * ���������� Ŭ������ �޼ҵ�
	 * */
	 
	//��ư �̺�Ʈ ����
	@Override
	public void actionPerformed(ActionEvent e) {
		//���� Ȯ��
		System.out.println("��ư �̺�Ʈ �߻�");
		
		//�̺�Ʈ�� �߻��� ��ư �����ϱ�
		clickButton = (JButton)e.getSource();
		
		//��ư�� üũ�ϴ� �޼ҵ� ȣ���ϱ�
		checkevent.checkbutton(clickButton);
		actioncheckevent.checkbutton(clickButton);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		//�̺�Ʈ�� �߻��� ��ư �����ϱ�
		clickButton = (JButton)e.getSource();
		
		//��ư�� üũ�ϴ� �޼ҵ� ȣ���ϱ�
		checkevent.checkbutton(clickButton);
		actioncheckevent.checkbutton(clickButton);
	}
	
	
	//üũ�ڽ� �̺�Ʈ ����
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		//�̺�Ʈ�� �߻��� üũ�ڽ� �����ϱ�
		clickBox = (JCheckBox)e.getSource();

	}
}
