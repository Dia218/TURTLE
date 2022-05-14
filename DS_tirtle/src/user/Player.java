package user;

import javax.swing.*;
import java.awt.*;

public class Player {

	public int healPoint = 100;
	public int starvePoint = 200;
	
	public int offensivePower = 0;
	public int defensivePower = 0;
	
	//체력 값을 변화시키는 메소드
	void changeHealPoint(int addHealPoint) {
		
		this.healPoint += addHealPoint;
		
		if (this.healPoint <= 0) {
			//게임오버 발생
			Gameover gameover = new Gameover();
		}	
	}
	
	//허기 값을 변화시키는 메소드
	void changeStarvePoint(int addStarvePoint) {
		
		this.starvePoint += addStarvePoint;
		
		if (this.starvePoint <= 0) {
			//게임오버 발생
			Gameover gameover = new Gameover();
		}
	}
	
	
}

//게임 오버 클래스
class Gameover {
	
	Gameover() {
		//게임오버 패널
		JPanel gameoverPanel = new JPanel();
		
		//게임오버가 적힌 라벨
		JLabel gameoverLabel = new JLabel("Game Over");
		gameoverLabel.setBackground(Color.BLACK);
		gameoverLabel.setForeground(Color.RED);
		gameoverLabel.setFont(new Font("Arial", Font.ITALIC, 40));
		gameoverPanel.add(gameoverLabel);
		
		//게임오버 패널을 중앙 패널 안에 배치하기
		GameSystem.playPanel.removeAll();
		GameSystem.playPanel.add(gameoverPanel);
		
		//중앙패널 다시 그리기
		GameSystem.playPanel.revalidate();
		GameSystem.playPanel.repaint();
	}
}