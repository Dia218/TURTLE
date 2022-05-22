package action;

import javax.swing.*;
import java.awt.*;
import item.*;
import user.*;
import user.Menu;

public class Making {

	/*
	 * 제작하고 싶은 아이템 버튼 클릭(자동 아이템 소모) - 제작 결과 출력 - 인벤토리에 수납
	 */
	
	//기본 생성자
	public Making() {

		//제작하기 패널 생성
		JPanel makingPanel = new JPanel();

		//제작하기 패널 배치 관리자 - 플로우레이아웃
		makingPanel.setLayout(new FlowLayout());

		//제작하기 버튼 만들기
		JButton makingArmors = new JButton("방어구 만들기");
		makingArmors.addActionListener(GameSystem.userListener);
		JButton makingWeapons = new JButton("무기 만들기");
		makingWeapons.addActionListener(GameSystem.userListener);

		//제작하기 패널에 제작하기 버튼 배치하기
		makingPanel.add(makingArmors);
		makingPanel.add(makingWeapons);
		
		//제작하기 패널 배치하기
		GameSystem.playPanel.removeAll();
		GameSystem.playPanel.add(makingPanel);
		
		//중앙 패널 다시 그리기
		GameSystem.playPanel.revalidate();
		GameSystem.playPanel.repaint();
	}
	
	
	/*
		
	//제작 종류, 아이템 버튼 객체 배열 생성
	JButton[][] makingButton = new JButton[2][2];
	
	//제작 패널에 아이템을 집어넣기
		void inputItem() {
			
			//버튼 이벤트 리스너
			if (makingButton[0][0].addActionListener(ActionEvent)) {
				//인벤토리 공간
				int vectorSize = vector.size();
				
				String result;
				
				//제료가 부족할 떄
				if (consumeItem(Grass, Twigs) == 0) {
					 result = "재료가 부족합니다..";
					 break;
				}
				//제작 할 떄
				else {
					consumeItem(Grass, Twigs);
					inputItem(GrassSuit);
				}
			}
			makingButton[0][1].setIcon(item.armors.LogSuit.imageIcon);
			makingButton[0][1].setText(item.armors.LogSuit.name);
			if (makingButton[0][0].addActionListener(ActionEvent)) {
				int vectorSize = vector.size();
				String result;
				if (consumeItem(Grass, Log) == 0) {
					 result = "재료가 부족합니다.";
					 break;
				}
				else {
					consumeItem(Grass, Log);
					inputItem(LogSuit);
				}
			}
			
			makingButton[1][0].setIcon(item.weapons.Spear.imageIcon);
			makingButton[1][0].setText(item.weapons.Spear.name); {
				int vectorSize = vector.size();
				String result;
				if (consumeItem(Twigs, Stone) == 0) {
					 result = "재료가 부족합니다..";
					 break;
				}
				else {
					consumeItem(Twigs, Stone);
					inputItem(Spear);
				}
			}
			makingButton[1][1].setIcon(item.weapons.TentacleSpike.imageIcon);
			makingButton[1][1].setText(item.weapons.TentacleSpike.name);
			}

		
*/	
}

class MakingArmors {
	
	//방어구 만들기 생성자
	public MakingArmors() {

		//제작하기 패널 생성
		JPanel makingArmorPanel = new JPanel();

		ImageIcon grassSuit = new ImageIcon("./images/Grass_Suit.png");
		ImageIcon logSuit = new ImageIcon("./images/Log_Suit.png");

		//제작하기 패널 배치 관리자 - 플로우레이아웃
		makingArmorPanel.setLayout(new GridLayout(3, 1));
		
		//제작하기 버튼 만들기
		JButton makingGrassSuit = new JButton("풀 갑옷 만들기", grassSuit);
		makingGrassSuit.addActionListener(GameSystem.userListener);
		JButton makingLogSuit = new JButton("나무 갑옷 만들기", logSuit);
		makingLogSuit.addActionListener(GameSystem.userListener);
		JButton goBack = new JButton("활동 끝내기");
		goBack.addActionListener(GameSystem.userListener);

		//제작하기 패널에 제작하기 버튼 배치하기
		makingArmorPanel.add(makingGrassSuit);
		makingArmorPanel.add(makingLogSuit);
		makingArmorPanel.add(goBack);
		
		
		//제작하기 패널 배치하기
		GameSystem.playPanel.removeAll();
		GameSystem.playPanel.add(makingArmorPanel);
		
		//중앙 패널 다시 그리기
		GameSystem.playPanel.revalidate();
		GameSystem.playPanel.repaint();
	}
	
}

class MakingWeapons {
	
	//무기 만들기 생성자
	public MakingWeapons() {

		//제작하기 패널 생성
		JPanel makingWeaponsPanel = new JPanel();

		ImageIcon spear = new ImageIcon("./images/Spear.png");

		//제작하기 패널 배치 관리자 - 플로우레이아웃
		makingWeaponsPanel.setLayout(new GridLayout(2, 1));
		
		//제작하기 버튼 만들기
		JButton makingSpear = new JButton("창 만들기", spear);
		makingSpear.addActionListener(GameSystem.userListener);
		JButton goBack = new JButton("활동 끝내기");
		goBack.addActionListener(GameSystem.userListener);

		//제작하기 패널에 제작하기 버튼 배치하기
		makingWeaponsPanel.add(makingSpear);
		makingWeaponsPanel.add(goBack);
		
		//제작하기 패널 배치하기
		GameSystem.playPanel.removeAll();
		GameSystem.playPanel.add(makingWeaponsPanel);
		
		//중앙 패널 다시 그리기
		GameSystem.playPanel.revalidate();
		GameSystem.playPanel.repaint();
	}
	
}

class MakingEventCheck {
	public MakingEventCheck(JButton clickButton) {
	
		if(clickButton.getText().equals("활동 끝내기") ) {
			/*MakingArmors 클래스를 발생시켜서 방어구 만들기*/

				Menu menu = new Menu();
				System.out.println("활동 끝내기");
		}
		
		//방어구 만들기 버튼인 경우
		else if(clickButton.getText().equals("방어구 만들기") ) {
		/*MakingArmors 클래스를 발생시켜서 방어구 만들기*/

			MakingArmors makingArmors = new MakingArmors();
		}
		
		else if(clickButton.getText().equals("무기 만들기") ) {
			/*MakingArmors 클래스를 발생시켜서 방어구 만들기*/

				MakingWeapons makingWeapons = new MakingWeapons();
				
		}
		
		else if(clickButton.getText().equals("풀 갑옷 만들기") ) {

			System.out.println("풀 갑옷 만들기");
		}
		
		else if(clickButton.getText().equals("나무 갑옷 만들기") ) {
			
			System.out.println("나무 갑옷 만들기");
		}
		
		else if(clickButton.getText().equals("창 만들기") ) {
			
			System.out.println("창 만들기");
		}

		else
			;
	}
	
}
