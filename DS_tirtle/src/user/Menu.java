package user;

import java.awt.*;
import javax.swing.*;

public class Menu {

	/*
	 * �޴� Ŭ���� �ʵ�
	 * */
	
	//�޴� �г� ����
	JPanel menuPanel = new JPanel();
	
	
	/*
	 * �޴� Ŭ���� �޼ҵ�
	 * */
	//�޴� ���� �޼ҵ�
	void selectMenu() {
		System.playPanel.removeAll();
		System.playPanel.add(menuPanel);
	}
	
	
	/*
	 * �޴� Ŭ���� ������
	 * */
	
	//�⺻ ������
	Menu() {
		
		//�޴� �г� ��ġ ������ - �÷ο췹�̾ƿ�
		menuPanel.setLayout(new FlowLayout());
		
		//�޴� ��ư �����
		JButton collectButton = new JButton("ä���ϱ�");
		collectButton.addActionListener(System.userListener);
		JButton cookButton = new JButton("�丮�ϱ�");
		cookButton.addActionListener(System.userListener);
		JButton huntButton = new JButton("����ϱ�");
		huntButton.addActionListener(System.userListener);
		JButton makeButton = new JButton("�����ϱ�");
		makeButton.addActionListener(System.userListener);
		JButton moveButton = new JButton("�̵��ϱ�");
		moveButton.addActionListener(System.userListener);
		
		//�޴��гο� �޴� ��ư ��ġ�ϱ�
		menuPanel.add(moveButton);
		menuPanel.add(cookButton);
		menuPanel.add(huntButton);
		menuPanel.add(makeButton);
		menuPanel.add(collectButton);
	}
	
}
