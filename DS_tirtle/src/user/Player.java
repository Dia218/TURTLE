package user;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import item.Armors;
import item.Empty;
import item.Tools;
import item.Weapons;

//장비 교체 추가 예정

public class Player {

	/*
	 * 플레이어 클래스 필드
	 * */
	private static int healPoint = 100;
	private static int starvePoint = 200;
	
	private static int offensivePower = 0;
	private static int defensivePower = 0;
	
	private Tools equipWeapon = null;
	private Tools equipArmor = null;
	
	
	//캐릭터 수치 정보를 나타내는 풀레이어 패널 생성
	PlayerPanel playerPanel = new PlayerPanel(healPoint, starvePoint, offensivePower, defensivePower);
	
	//캐릭터가 착용한 장비 정보를 나타내는 장비 패널 생성
	EquipPanel equipPanel = new EquipPanel();
	
	
	/*
	 * 플레이어 클래스 메소드
	 * */
	
	/*필드 값을 반환하는 메소드들*/
	
	//체력 값을 리턴하는 메소드
	public int returnHealPoint() {
		return Player.healPoint;
	}
	
	//허기 값을 리턴하는 메소드
	public int returnStarvePoint() {
		return Player.starvePoint;
	}
	
	//공격값을 리턴하는 메소드
	public int returnOffensivePower() {
		return Player.offensivePower;
	}
	
	//방어값을 리턴하는 메소드
	public int returnDefensivePower() {
		return Player.defensivePower;
	} 
	
	//장착한 무기 객체를 리턴하는 메소드
	public Tools returnEquipWeapon() {
		return this.equipWeapon;
	}
	
	//장착한 방어구 객체를 리턴하는 메소드
	public Tools returnEquipArmor() {
		return this.equipArmor;
	}
	
	
	/*필드 값을 변화시키는 메소드들*/
	
	//체력 값을 변화시키는 메소드
	public void changeHealPoint(int addHealPoint) {
		
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
	public void changeStarvePoint(int addStarvePoint) {
		
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
	public void changeOffensivePower(int changeOffensivePower) {
			
		//공격값 변화
		this.offensivePower = changeOffensivePower;
			
		//공격력 텍스트 필드 갱신
		playerPanel.offensiveField.setText(Integer.toString(this.offensivePower));
		
		//플레이어 패널 갱신
		playerPanel.revalidate();
		playerPanel.repaint();
	}
	
	//방어값을 변화시키는 메소드
	public void changeDefensivePower(int changeDefensivePower) {
			
		//방어값 변화
		this.defensivePower = changeDefensivePower;
			
		//방어력 텍스트 필드 갱신
		playerPanel.defensiveField.setText(Integer.toString(this.defensivePower));
		
		//플레이어 패널 갱신
		playerPanel.revalidate();
		playerPanel.repaint();
	}
	
	//착용한 무기를 바꾸는 메소드
	public void changeEquipWeapon(Weapons changeEquipWeapon) {
		//착용 무기 교체
		this.equipWeapon = changeEquipWeapon;
		
		//공격값 변화 호출
		this.changeOffensivePower(changeEquipWeapon.returnATK());
		
		//무기 체크박스 갱신
		equipPanel.weaponBox.setIcon(this.equipWeapon.returnImg());
		
		//착용 장비 패널 갱신
		equipPanel.revalidate();
		equipPanel.repaint();
	}

	//착용한 방어구를 바꾸는 메소드
	public void changeEquipArmor(Armors changeEquipArmor) {
		//착용 무기 교체
		this.equipArmor = changeEquipArmor;

		//방어값 변화 호출
		this.changeDefensivePower(changeEquipArmor.returnDEF());
		
		//방어구 체크박스 갱신
		equipPanel.armorBox.setIcon(this.equipArmor.returnImg());
		
		//착용 장비 패널 갱신
		equipPanel.revalidate();
		equipPanel.repaint();
	}
	
	
	/*
	 * 플레이어 클래스 생성자
	 * */
	public Player() {

		
	}
	
}


////플레이어 패널 클래스////
class PlayerPanel extends JPanel {
	
	/*
	 * 플레이어 패널 필드
	 * */
	//텍스트 필드 생성
	JTextField healField;
	JTextField starveField;
	JTextField offensiveField;
	JTextField defensiveField;
	
	
	/*
	 * 플레이어 패널 생성자
	 * */
	PlayerPanel(int firstHealPoint, int firstStarvePoint, int firstOffensivePower, int firstDefensivePower) {
		
		//플레이어 패널 배치 관리자
		this.setLayout(new GridLayout(4, 2, 20, 20));
		
		//텍스트 필드 초기화
		healField = new JTextField(Integer.toString(firstHealPoint), 10);
		starveField = new JTextField(Integer.toString(firstStarvePoint), 10);
		offensiveField = new JTextField(Integer.toString(firstOffensivePower), 10);
		defensiveField = new JTextField(Integer.toString(firstDefensivePower), 10);
		
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
	JCheckBox weaponBox = new JCheckBox(noEquip);
	JCheckBox armorBox = new JCheckBox(noEquip);
	
	/*
	 * 장비 패널 생성자
	 * */
	EquipPanel() {
		
		//장비 패널 배치 관리자
		this.setLayout(new GridLayout(2, 2));
		
		//장비 패널 요소 배치
		this.add(new JLabel("무기"));
		this.add(weaponBox);
		this.add(new JLabel("방어구"));
		this.add(armorBox);
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