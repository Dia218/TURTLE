package user;
import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame {

	public GameFrame() {
		//프레임
		setTitle("굶지마 거북이 플레이");
		setSize(800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//화면
		Container mainScreen = this.getContentPane();
		mainScreen.setLayout(new BorderLayout(10, 10));
		
		
		//상단 - 지역 출력
		JPanel statePanel = new JPanel();
		mainScreen.add(statePanel, BorderLayout.NORTH);
		JLabel map = new JLabel("현재 위치 출력창 test");
		map.setFont(new Font("", Font.PLAIN, 20));
		statePanel.add(map);
		statePanel.setBackground(Color.YELLOW);
		
		//하단 - 결과 출력
		JPanel resultPanel = new JPanel();
		mainScreen.add(resultPanel, BorderLayout.SOUTH);
		JTextArea result = new JTextArea("결과 출력창 test", 7, 70);
		//result.setFont(new Font("", Font.PLAIN, 20));				
		resultPanel.add(new JScrollPane(result));
		resultPanel.setBackground(Color.YELLOW);
		
		
		//오른쪽 - 캐릭터창 출력
		JPanel profilePanel = new JPanel();
		mainScreen.add(profilePanel, BorderLayout.EAST);
		profilePanel.setLayout(new GridLayout(4, 2, 20, 20));
		profilePanel.add(new JLabel("체력"));
		profilePanel.add(new JTextField(10));
		profilePanel.add(new JLabel("허기"));
		profilePanel.add(new JTextField(10));
		profilePanel.add(new JLabel("공격력"));
		profilePanel.add(new JTextField(10));
		profilePanel.add(new JLabel("방어력"));
		profilePanel.add(new JTextField(10));
		
		
		//왼쪽 - 인벤토리 출력
		JPanel inventoryPanel = new JPanel();
		mainScreen.add(inventoryPanel, BorderLayout.WEST);
		inventoryPanel.setLayout(new GridLayout(7, 3));
		
		JButton[] inventory = new JButton[21];
		for(int i = 0; i <= 20; i++) {
			inventoryPanel.add(inventory[i] = new JButton("Empty"));
		}
		inventoryPanel.setBackground(Color.GREEN);

		
		//중앙 - 게임 진행 화면
		JPanel playPanel = new JPanel();
		mainScreen.add(playPanel, BorderLayout.CENTER);
		JPanel testBiomPanel = new JPanel();
		ImageIcon carrotPlantImg = new ImageIcon("./images/BerryBush.png");
		JCheckBox carrotPlant = new JCheckBox(carrotPlantImg);

		testBiomPanel.add(carrotPlant);
		mainScreen.add(testBiomPanel, BorderLayout.CENTER);
		
	}
	
	
}
