package user;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UserListener implements ActionListener, ItemListener {
		
	@Override
	public void actionPerformed(ActionEvent e) {
		//�̺�Ʈ�� �߻��� ��ư
		JButton clickButton = (JButton)e.getSource();
		
		
		//���� ����//
		if(clickButton.getText().equals("�����ϱ�") ) {
			Menu menu = new Menu();
		}
		else if(clickButton.getText().equals("�����ϱ�") ) {
			System.exit(0);
		}
		else
			;
		
		
		//�޴� ����//
		if(clickButton.getText().equals("�̵��ϱ�") ) {
			/*Moving Ŭ������ �޼ҵ带 ȣ���Ͽ� �����̵�*/
			/*
			 * Moving moving = new Moving();
			 * moving.moveEx();
			 * */
		}
		else if(clickButton.getText().equals("����ϱ�") ) {
			/*Hunting Ŭ������ �޼ҵ带 ȣ���Ͽ� ���� ���*/
			/*
			 * Hunting hunting = new Hunting(); 
			 * hunting.huntEx();
			 * */
		}
		else if(clickButton.getText().equals("ä���ϱ�") ) {
			/*Collecting Ŭ������ �޼ҵ带 ȣ���Ͽ� ������Ʈ���� �ڿ� ä��*/
			/*
			 * Collecting collecting = new Collecting();
			 * collecting.collectEx();
			 * */
		}
		else if(clickButton.getText().equals("�����ϱ�") ) {
			/*Making Ŭ������ �޼ҵ带 ȣ���Ͽ� ���� ����*/
			/*
			 * Making making = new Making();
			 * making.makeEx();
			 * */
		}
		else if(clickButton.getText().equals("�丮�ϱ�") ) {
			/*Cooking Ŭ������ �޼ҵ带 ȣ���Ͽ� �丮�ϱ�*/
			/*
			 * Cooking cooking = new Cooking();
			 * cooking.cookEx();
			 * */
		}
		else
			;
		
		//
		
	}
	
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
