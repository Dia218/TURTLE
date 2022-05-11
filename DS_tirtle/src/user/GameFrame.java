package user;
import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame {

	public GameFrame() {
		//������
		setTitle("������ �ź��� �÷���");
		setSize(800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ȭ��
		Container mainScreen = this.getContentPane();
		mainScreen.setLayout(new BorderLayout(10, 10));
		
		
		//��� - ���� ���
		JPanel statePanel = new JPanel();
		mainScreen.add(statePanel, BorderLayout.NORTH);
		JLabel map = new JLabel("���� ��ġ ���â test");
		map.setFont(new Font("", Font.PLAIN, 20));
		statePanel.add(map);
		statePanel.setBackground(Color.YELLOW);
		
		//�ϴ� - ��� ���
		JPanel resultPanel = new JPanel();
		mainScreen.add(resultPanel, BorderLayout.SOUTH);
		JTextArea result = new JTextArea("��� ���â test", 7, 70);
		//result.setFont(new Font("", Font.PLAIN, 20));				
		resultPanel.add(new JScrollPane(result));
		resultPanel.setBackground(Color.YELLOW);
		
		
		//������ - ĳ����â ���
		JPanel profilePanel = new JPanel();
		mainScreen.add(profilePanel, BorderLayout.EAST);
		profilePanel.setLayout(new GridLayout(4, 2, 20, 20));
		profilePanel.add(new JLabel("ü��"));
		profilePanel.add(new JTextField(10));
		profilePanel.add(new JLabel("���"));
		profilePanel.add(new JTextField(10));
		profilePanel.add(new JLabel("���ݷ�"));
		profilePanel.add(new JTextField(10));
		profilePanel.add(new JLabel("����"));
		profilePanel.add(new JTextField(10));
		
		
		//���� - �κ��丮 ���
		JPanel inventoryPanel = new JPanel();
		mainScreen.add(inventoryPanel, BorderLayout.WEST);
		inventoryPanel.setLayout(new GridLayout(7, 3));
		
		JButton[] inventory = new JButton[21];
		for(int i = 0; i <= 20; i++) {
			inventoryPanel.add(inventory[i] = new JButton("Empty"));
		}
		inventoryPanel.setBackground(Color.GREEN);

		
		//�߾� - ���� ���� ȭ��
		JPanel playPanel = new JPanel();
		mainScreen.add(playPanel, BorderLayout.CENTER);
		
		JPanel testBiomPanel = new JPanel();
		ImageIcon carrotPlantImg = new ImageIcon("./images/BerryBush.png");
		JCheckBox carrotPlant = new JCheckBox(carrotPlantImg);

		testBiomPanel.add(carrotPlant);
		mainScreen.add(testBiomPanel, BorderLayout.CENTER);
		
	}
	
	
}