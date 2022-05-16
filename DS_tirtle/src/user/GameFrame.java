package user;
import java.awt.*;
import javax.swing.*;
import item.*;

import user.Menu;

public class GameFrame extends JFrame {

	//ȭ�� ����
	public GameFrame() {
		////������////
		setTitle("������ �ź��� �÷���");
		setSize(800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		////ȭ��////
		Container mainScreen = this.getContentPane();
		mainScreen.setLayout(new BorderLayout(10, 10));
		
		
		/* *
		 * ȭ�� ����
		 * */
		
		//��� - ���� ���//
		JPanel statePanel = new JPanel();
		mainScreen.add(statePanel, BorderLayout.NORTH);
		JLabel map = new JLabel("���� ��ġ ���â test");
		map.setFont(new Font("", Font.PLAIN, 20));
		statePanel.add(map);
		statePanel.setBackground(Color.YELLOW);
	
		
		//�ϴ� - ��� ���//
		JPanel resultPanel = new JPanel();
		mainScreen.add(resultPanel, BorderLayout.SOUTH);
		JTextArea result = new JTextArea("��� ���â test", 7, 70);
		//result.setFont(new Font("", Font.PLAIN, 20));				
		resultPanel.add(new JScrollPane(result));
		resultPanel.setBackground(Color.YELLOW);
		
		
		//������ - ĳ���� ���� ���//
		JPanel profilePanel = new JPanel();
		profilePanel.setLayout(new GridLayout(2, 1));
		profilePanel.add(GameSystem.player.playerPanel);
		profilePanel.add(GameSystem.player.equipPanel);
		mainScreen.add(profilePanel, BorderLayout.EAST);
		
		
		//���� - �κ��丮 ���//
		mainScreen.add(GameSystem.inventory.inventoryPanel, BorderLayout.WEST);
		
		
		//�߾� - ���� ���� ȭ��//
		mainScreen.add(GameSystem.playPanel, BorderLayout.CENTER);
		
		//���ӽ��� �г�
		JPanel startPanel = new JPanel();
		
		//���ӽ��� �г��� ��ư
		JButton gameStartButton = new JButton("�����ϱ�");
		gameStartButton.addActionListener(GameSystem.userListener);
		JButton gameExitButton = new JButton("�����ϱ�");
		gameExitButton.addActionListener(GameSystem.userListener);
		startPanel.add(gameStartButton);
		startPanel.add(gameExitButton);
		
		//���ӽ��� �г� �߾� �гο� ��ġ
		GameSystem.playPanel.add(startPanel);
		

		
<<<<<<< HEAD
		
		/*
		//�׽�Ʈ�� - �����ؾ���
=======
		//�߾� - ���� ���� ȭ��
		JPanel playPanel = new JPanel();
		mainScreen.add(playPanel, BorderLayout.CENTER);
		ItemData a;
>>>>>>> 0658b5a093b23280ab7fb806864f2d876e498203
		JPanel testBiomPanel = new JPanel();
		ImageIcon carrotPlantImg = new ImageIcon("./images/BerryBush.png");
		JCheckBox carrotPlant = new JCheckBox(carrotPlantImg);

		testBiomPanel.add(carrotPlant);
		mainScreen.add(testBiomPanel, BorderLayout.CENTER);
		*/
	}
}

class StartEventCheck {
	
	//�����г� ��ư üũ ������
	public StartEventCheck(JButton eventButton) {
		//�̺�Ʈ ��ư�� �����ϱ� ��ư�� ���
		if(eventButton.getText().equals("�����ϱ�") ) {
			//�޴� Ŭ���� ����
			Menu menu = new Menu();
		}
		//�̺�Ʈ ��ư�� �����ϱ� ��ư�� ���
		else if(eventButton.getText().equals("�����ϱ�") ) {
			//���α׷� ����
			System.exit(0);
		}
		else
			;
	}
}
