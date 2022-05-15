package user;
import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame {

	//화면 구성
	public GameFrame() {
		////프레임////
		setTitle("굶지마 거북이 플레이");
		setSize(800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		////화면////
		Container mainScreen = this.getContentPane();
		mainScreen.setLayout(new BorderLayout(10, 10));
		
		
		/* *
		 * 화면 구성
		 * */
		
		//상단 - 지역 출력//
		JPanel statePanel = new JPanel();
		mainScreen.add(statePanel, BorderLayout.NORTH);
		JLabel map = new JLabel("현재 위치 출력창 test");
		map.setFont(new Font("", Font.PLAIN, 20));
		statePanel.add(map);
		statePanel.setBackground(Color.YELLOW);
	
		
		//하단 - 결과 출력//
		JPanel resultPanel = new JPanel();
		mainScreen.add(resultPanel, BorderLayout.SOUTH);
		JTextArea result = new JTextArea("결과 출력창 test", 7, 70);
		//result.setFont(new Font("", Font.PLAIN, 20));				
		resultPanel.add(new JScrollPane(result));
		resultPanel.setBackground(Color.YELLOW);
		
		
		//오른쪽 - 캐릭터창 출력//
		mainScreen.add(GameSystem.player.playerPanel, BorderLayout.EAST);
		
		
		//왼쪽 - 인벤토리 출력//
		mainScreen.add(GameSystem.inventory.inventoryPanel, BorderLayout.WEST);
		
		
		//중앙 - 게임 진행 화면//
		mainScreen.add(GameSystem.playPanel, BorderLayout.CENTER);
		
		//게임시작 패널
		JPanel startPanel = new JPanel();
		
		//게임시작 패널의 버튼
		JButton gameStartButton = new JButton("게임하기");
		gameStartButton.addActionListener(GameSystem.userListener);
		JButton gameExitButton = new JButton("종료하기");
		gameExitButton.addActionListener(GameSystem.userListener);
		startPanel.add(gameStartButton);
		startPanel.add(gameExitButton);
		
		//게임시작 패널 중앙 패널에 배치
		GameSystem.playPanel.add(startPanel);
		

		
		
		/*
		//테스트용 - 삭제해야함
		JPanel testBiomPanel = new JPanel();
		ImageIcon carrotPlantImg = new ImageIcon("./images/BerryBush.png");
		JCheckBox carrotPlant = new JCheckBox(carrotPlantImg);

		testBiomPanel.add(carrotPlant);
		mainScreen.add(testBiomPanel, BorderLayout.CENTER);
		*/
	}
	
}
