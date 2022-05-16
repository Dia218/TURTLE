package user;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import item.Item;
import item.armors.GrassSuit;

//장비 교체 추가 예정

public class Player {

	/*
	 * 플레이어 클래스 필드
	 * */
	public static int healPoint = 100;
	public static int starvePoint = 200;
	
	public static int offensivePower = 0;
	public static int defensivePower = 0;
	
	//캐릭터 수치 정보를 나타내는 풀레이어 패널 생성
	PlayerPanel playerPanel = new PlayerPanel();
	
	//캐릭터가 착용한 장비 정보를 나타내는 장비 패널 생성
	EquipPanel equipPanel = new EquipPanel();
	
	
	/*
	 * 플레이어 클래스 메소드
	 * */
	//체력 값을 변화시키는 메소드
	void changeHealPoint(int addHealPoint) {
		
		//체력 값 변화
		this.healPoint += addHealPoint;
		
		//체력 텍스트 필드 갱신
		playerPanel.healField.setText(Integer.toString(this.healPoint));
		
		//플레이어 패널 갱신
		playerPanel.revalidate();
		playerPanel.repaint();
		
		//체력이 0일 때
		if (this.healPoint <= 0) {
			//게임오버 발생
			Gameover gameover = new Gameover();
		}	
	}
	
	//허기 값을 변화시키는 메소드
	void changeStarvePoint(int addStarvePoint) {
		
		//허기 값 변화
		this.starvePoint += addStarvePoint;
		
		//허기 텍스트 필드 갱신
		playerPanel.starveField.setText(Integer.toString(this.starvePoint));
		
		//플레이어 패널 갱신
		playerPanel.revalidate();
		playerPanel.repaint();
		
		//허기가 0일 때
		if (this.starvePoint <= 0) {
			//게임오버 발생
			Gameover gameover = new Gameover();
		}
	}
	
	//공격값을 변화시키는 메소드
	void changeOffensivePower(int OffensivePower) {
			
		//공격값 변화
		this.offensivePower = OffensivePower;
			
		//공격력 텍스트 필드 갱신
		playerPanel.offensiveField.setText(Integer.toString(this.offensivePower));
		
		//플레이어 패널 갱신
		playerPanel.revalidate();
		playerPanel.repaint();	
		
		//방어구 체크 박스 갱신
		
		//장비 패널 갱신
		equipPanel.revalidate();
		equipPanel.repaint();
	}
	
	//방어값을 변화시키는 메소드
	void changeDefensivePower(int DefensivePower) {
			
		//방어값 변화
		this.defensivePower = DefensivePower;
			
		//방어력 텍스트 필드 갱신
		playerPanel.defensiveField.setText(Integer.toString(this.defensivePower));
		
		//플레이어 패널 갱신
		playerPanel.revalidate();
		playerPanel.repaint();
		
		//방어구 체크 박스 갱신
		
		//장비 패널 갱신
		equipPanel.revalidate();
		equipPanel.repaint();
	}
}


////플레이어 패널 클래스////
class PlayerPanel extends JPanel {
	
	/*
	 * 플레이어 패널 필드
	 * */
	//텍스트 필드 생성
	JTextField healField = new JTextField(Integer.toString(Player.healPoint), 10);
	JTextField starveField = new JTextField(Integer.toString(Player.starvePoint), 10);
	JTextField offensiveField = new JTextField(Integer.toString(Player.offensivePower), 10);
	JTextField defensiveField = new JTextField(Integer.toString(Player.defensivePower), 10);
	
	
	/*
	 * 플레이어 패널 생성자
	 * */
	PlayerPanel() {
		
		//플레이어 패널 배치 관리자
		this.setLayout(new GridLayout(4, 2, 20, 20));
		
		//텍스트 필드 사용자 입력 불가
		healField.setEditable(false);
		starveField.setEditable(false);
		offensiveField.setEditable(false);
		defensiveField.setEditable(false);
		
		//플레이어 패널에 요소 배치
		this.add(new JLabel("체력"));
		this.add(healField);
		
		this.add(new JLabel("허기"));
		this.add(starveField);
		
		this.add(new JLabel("공격력"));
		this.add(offensiveField);
		
		this.add(new JLabel("방어력"));
		this.add(defensiveField);
	}
}


////착용 장비 패널 클래스////
class EquipPanel extends JPanel {
	//장비 체크 박스 만들기
	ImageIcon noEquip = new ImageIcon("./images/NoEquip.jpg");
	JCheckBox equipWeapon = new JCheckBox(noEquip);
	JCheckBox equipArmor = new JCheckBox(noEquip);
	
	/*
	 * 장비 패널 생성자
	 * */
	EquipPanel() {
		
		//장비 패널 배치 관리자
		this.setLayout(new GridLayout(2, 2));
		
		//장비 패널 요소 배치
		this.add(new JLabel("방어구"));
		this.add(equipArmor);
		this.add(new JLabel("무기"));
		this.add(equipWeapon);
	}	
}


////게임 오버 클래스////
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