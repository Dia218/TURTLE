package user;

import java.awt.*;
import javax.swing.*;
import action.*;

public class Menu {

	
	/*
	 * �޴� Ŭ���� ������
	 * */
	
	//�⺻ ������
	public Menu() {
		
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

class MenuEventCheck {

	/*
	 * ��忡 ���� �ʵ�
	 * */
	//��� ���
	String huntingMode = "��ɸ��";

	//�̵� ���
	String movingMode = "�̵����";

	//ä�� ���
	String collectingMode = "ä�����";

	//���� ���
	String makingMode = "���۸��";

	//�丮 ���
	String cookingMode = "�丮���";

	
	/*
	 * �޴��г� ��ư üũ ������
	 * */
	public MenuEventCheck(JButton clickButton) {
		//�̵��ϱ� ��ư�� ���
		if(clickButton.getText().equals("�̵��ϱ�") ) {
			
				/*Moving Ŭ������ �߻����Ѽ� �����̵�*/
				 Moving moving = new Moving();

			//��� �ٲٴ� �޼ҵ带 ȣ���Ͽ� �̵� ���� ��ȯ
			GameSystem.state.changeMode(movingMode);	
		}
		//����ϱ� ��ư�� ���
		else if(clickButton.getText().equals("����ϱ�") ) {
			
				/*Hunting Ŭ������ �߻����Ѽ� ���� ���*/
				Hunting hunting = new Hunting(); 
				hunting.startHuntMenu();
				 
			//��� �ٲٴ� �޼ҵ带 ȣ���Ͽ� ��� ���� ��ȯ
			GameSystem.state.changeMode(huntingMode);
		}
		//ä���ϱ� ��ư�� ���
		else if(clickButton.getText().equals("ä���ϱ�") ) {
			
				/*Collecting Ŭ������ �߻����Ѽ� ������Ʈ���� �ڿ� ä��*/
				Collecting collecting = new Collecting();
				 
			//��� �ٲٴ� �޼ҵ带 ȣ���Ͽ� ä�� ���� ��ȯ
			GameSystem.state.changeMode(collectingMode);
		}
		//�����ϱ� ��ư�� ���
		else if(clickButton.getText().equals("�����ϱ�") ) {
				
			//Making Ŭ������ �߻����Ѽ� ���� ����
			Making making = new Making();
			
			//��� �ٲٴ� �޼ҵ带 ȣ���Ͽ� ���� ���� ��ȯ
			GameSystem.state.changeMode(makingMode);
		}
		//�丮�ϱ� ��ư�� ���
		else if(clickButton.getText().equals("�丮�ϱ�") ) {
				
			//Cooking Ŭ������ �߻����Ѽ� �丮�ϱ�
			Cooking cooking = new Cooking();
			
			//��� �ٲٴ� �޼ҵ带 ȣ���Ͽ� �丮 ���� ��ȯ
			GameSystem.state.changeMode(cookingMode);
		}
		else
			;
	}
}