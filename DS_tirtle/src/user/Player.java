package user;

import javax.swing.*;
import java.awt.*;

public class Player {

	public int healPoint = 100;
	public int starvePoint = 200;
	
	public int offensivePower = 0;
	public int defensivePower = 0;
	
	//ü�� ���� ��ȭ��Ű�� �޼ҵ�
	void changeHealPoint(int addHealPoint) {
		
		this.healPoint += addHealPoint;
		
		if (this.healPoint <= 0) {
			//���ӿ��� �߻�
			Gameover gameover = new Gameover();
		}	
	}
	
	//��� ���� ��ȭ��Ű�� �޼ҵ�
	void changeStarvePoint(int addStarvePoint) {
		
		this.starvePoint += addStarvePoint;
		
		if (this.starvePoint <= 0) {
			//���ӿ��� �߻�
			Gameover gameover = new Gameover();
		}
	}
	
	
}

//���� ���� Ŭ����
class Gameover {
	
	Gameover() {
		//���ӿ��� �г�
		JPanel gameoverPanel = new JPanel();
		
		//���ӿ����� ���� ��
		JLabel gameoverLabel = new JLabel("Game Over");
		gameoverLabel.setBackground(Color.BLACK);
		gameoverLabel.setForeground(Color.RED);
		gameoverLabel.setFont(new Font("Arial", Font.ITALIC, 40));
		gameoverPanel.add(gameoverLabel);
		
		//���ӿ��� �г��� �߾� �г� �ȿ� ��ġ�ϱ�
		GameSystem.playPanel.removeAll();
		GameSystem.playPanel.add(gameoverPanel);
		
		//�߾��г� �ٽ� �׸���
		GameSystem.playPanel.revalidate();
		GameSystem.playPanel.repaint();
	}
}