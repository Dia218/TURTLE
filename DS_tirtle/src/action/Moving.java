package action;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import user.GameSystem;

public class Moving {
	
	
	
}

class MovingPanel {
	
	public MovingPanel() {
		
		//메뉴 패널 생성
		JPanel movingPanel = new JPanel();
		
		//메뉴 패널 배치 관리자 - 플로우레이아웃
		movingPanel.setLayout(new FlowLayout());
		
		//메뉴 버튼 만들기
		JButton chowonButton = new JButton("초원");
		chowonButton.addActionListener(GameSystem.userListener);
		JButton supButton = new JButton("숲");
		supButton.addActionListener(GameSystem.userListener);
		JButton buchinutButton = new JButton("버치넛");
		buchinutButton.addActionListener(GameSystem.userListener);
		JButton samakButton = new JButton("사막");
		samakButton.addActionListener(GameSystem.userListener);
		JButton savanaButton = new JButton("사바나");
		savanaButton.addActionListener(GameSystem.userListener);
		
		//메뉴패널에 메뉴 버튼 배치하기
		movingPanel.add(chowonButton);
		movingPanel.add(supButton);
		movingPanel.add(buchinutButton);
		movingPanel.add(samakButton);
		movingPanel.add(savanaButton);
		
		//메뉴 패널 배치하기
		GameSystem.playPanel.removeAll();
		GameSystem.playPanel.add(movingPanel);
		
		//중앙 패널 다시 그리기
		GameSystem.playPanel.revalidate();
		GameSystem.playPanel.repaint();
	}
}
