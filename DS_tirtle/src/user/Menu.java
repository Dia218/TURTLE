package user;

import java.awt.*;
import javax.swing.*;

public class Menu {

	
	/*
	 * �޴� Ŭ���� ������
	 * */
	
	//�⺻ ������
	Menu() {
		
		//�޴� �г� ����
		JPanel menuPanel = new JPanel();
		
		//�޴� �г� ��ġ ������ - �÷ο췹�̾ƿ�
		menuPanel.setLayout(new FlowLayout());
		
		//�޴� ��ư �����
		JButton collectButton = new JButton("ä���ϱ�");
		collectButton.addActionListener(GameSystem.userListener);
		JButton cookButton = new JButton("�丮�ϱ�");
		cookButton.addActionListener(GameSystem.userListener);
		JButton huntButton = new JButton("����ϱ�");
		huntButton.addActionListener(GameSystem.userListener);
		JButton makeButton = new JButton("�����ϱ�");
		makeButton.addActionListener(GameSystem.userListener);
		JButton moveButton = new JButton("�̵��ϱ�");
		moveButton.addActionListener(GameSystem.userListener);
		
		//�޴��гο� �޴� ��ư ��ġ�ϱ�
		menuPanel.add(moveButton);
		menuPanel.add(cookButton);
		menuPanel.add(huntButton);
		menuPanel.add(makeButton);
		menuPanel.add(collectButton);
		
		//�޴� �г� ��ġ�ϱ�
		GameSystem.playPanel.removeAll();
		GameSystem.playPanel.add(menuPanel);
		
		//�߾� �г� �ٽ� �׸���
		GameSystem.playPanel.revalidate();
		GameSystem.playPanel.repaint();
	}
	
}
