package action;

import java.util.Arrays;
import java.util.Vector;

import java.awt.*;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.*;

import item.*;
import item.armors.*;
import item.processedFoods.*;
import item.unprocessedFoods.*;
import item.weapons.*;
import user.*;
import user.Menu;
import world.resource.Twigs;


public class Cooking {

	/*
	 * 재료 선택 - 요리 결과 출력 - 인벤토리에 수납
	 */
	
	//요리하기 생성자
	public Cooking() {
		//솥 패널 생성
		
		JPanel potPanel = new JPanel();
		
		//솥 버튼 객체 배열 생성
		JButton[] potButton = new JButton[4];
		
		ImageIcon slot0Img = new ImageIcon("./images/slot0.png");
		
		ImageIcon slot1Img = new ImageIcon("./images/slot1.png");
		
		ImageIcon slot2Img = new ImageIcon("./images/slot2.png");
		
		ImageIcon slot3Img = new ImageIcon("./images/slot3.png");

		//메뉴 패널 배치 관리자 - 그리드레이아웃
		potPanel.setLayout(new GridLayout(6, 1));
		
		//인벤토리 버튼 초기화 및 배치
		potPanel.add(potButton[0] = new JButton("슬롯 1" ,slot0Img));
		potButton[0].addActionListener(GameSystem.userListener);
		System.out.println("슬롯 1 이미지 초기화");
		
		potPanel.add(potButton[1] = new JButton("슬롯 2" ,slot1Img));
		potButton[1].addActionListener(GameSystem.userListener);
		System.out.println("슬롯 2 이미지 초기화");
		
		potPanel.add(potButton[2] = new JButton("슬롯 3" ,slot2Img));
		potButton[2].addActionListener(GameSystem.userListener);
		System.out.println("슬롯 3 이미지 초기화");
		
		potPanel.add(potButton[3] = new JButton("슬롯 4" ,slot3Img));
		potButton[3].addActionListener(GameSystem.userListener);
		System.out.println("슬롯 4 이미지 초기화");

		
		//요리시작 버튼 생성 및 배치
		JButton start = new JButton("요리시작");
		potPanel.add(start);
		start.addActionListener(GameSystem.userListener);
		
		//활동 끝내기 버튼 생성 및 배치
		JButton goBack = new JButton("활동 끝내기");
		potPanel.add(goBack);
		goBack.addActionListener(GameSystem.userListener);

		//메뉴 패널 배치하기
				GameSystem.playPanel.removeAll();
				GameSystem.playPanel.add(potPanel);
				
				//중앙 패널 다시 그리기
				GameSystem.playPanel.revalidate();
				GameSystem.playPanel.repaint();
	}
	
}
	
class CookingEventCheck {
	public CookingEventCheck(JButton clickButton) {
		
		ImageIcon slot0 = new ImageIcon("./images/slot0.png");
		ImageIcon slot1 = new ImageIcon("./images/slot1.png");
		ImageIcon slot2 = new ImageIcon("./images/slot2.png");
		ImageIcon slot3 = new ImageIcon("./images/slot3.png");

		//빈 공간 아이템 객체 생성
		Empty empty = new Empty();
		
		//슬롯 아이템 객체 배열 생성
		Item[] potSlot = {empty, empty, empty, empty};
		
		//아이템 결과 객체 생성
		Item resultSlot = empty;
		
		//재료 수량
		int br = 0, cr = 0, fs = 0, fl = 0, mt = 0, mm = 0, mr = 0, tg = 0;
		
		//활동 끝내기 버튼을 누른 경우
		if(clickButton.getText().equals("활동 끝내기") ) {

			//메뉴 생성
			Menu menu = new Menu();
			System.out.println("활동 끝내기");
		}
		
		//요리 시작 버튼인 경우
		else if(clickButton.getText().equals("요리시작") ) {
			
			//potSlot의 재료를 갯수로 변환.
			for(int i = 0; i < 4; i++) {
				//베리
				if(potSlot[i] instanceof Berry)
					br++;
				//당근
				else if(potSlot[i] instanceof Carrot)
					cr++;
				//물고기
				else if(potSlot[i] instanceof Fish)
					fs++;
				//개구리다리
				else if(potSlot[i] instanceof FrogLeg)
					fl++;
				//고기
				else if(potSlot[i] instanceof Meat)
					mt++;
				//괴물고기
				else if(potSlot[i] instanceof MonsterMeat)
					mm++;
				//버섯
				else if(potSlot[i] instanceof Mushroom)
					mr++;
				//잔가지
				else if(potSlot[i] instanceof Twigs)
					tg++;
			}
			
			//potSlot중 빈 곳이 있다면 출력
			if(potSlot[0] == empty || potSlot[1] == empty || potSlot[2] == empty || potSlot[3] == empty) {
				System.out.println("재료를 4개 넣어주세요.");
			}
			//괴물라자냐 요리
			else if(mm >= 2 && tg == 0) {
				MonsterLasagna result = new MonsterLasagna();
				for(int i = 0; i < 4; i++)
					GameSystem.inventory.consumeItem(potSlot[i]);
				GameSystem.inventory.inputItem(result);
				Cooking start = new Cooking();
				GameSystem.player.changeStarvePoint(-5);
			}
			//미트스튜 요리
			else if(mt >= 2 && tg == 0) {
				MeatStew result = new MeatStew();
				for(int i = 0; i < 4; i++)
					GameSystem.inventory.consumeItem(potSlot[i]);
				GameSystem.inventory.inputItem(result);
				Cooking start = new Cooking();
				GameSystem.player.changeStarvePoint(-5);
			}
			//샌드위치 요리
			else if(fl == 1 && cr == 0 && mr == 3 || fl == 1 && cr == 1 && mr == 2 || fl == 1 && cr == 2 && mr == 1 || fl == 1 && cr == 3 && mr == 0) {
				Sandwich result = new Sandwich();
				for(int i = 0; i < 4; i++)
					GameSystem.inventory.consumeItem(potSlot[i]);
				GameSystem.inventory.inputItem(result);
				Cooking start = new Cooking();
				GameSystem.player.changeStarvePoint(-5);
			}
			//라따뚜이 요리
			else if(cr == 0 && mr == 4 || cr == 1 && mr == 3 || cr == 2 && mr == 2 || cr == 3 && mr == 1 || cr == 4 && mr == 0) {
				Ratatouille result = new Ratatouille();
				for(int i = 0; i < 4; i++)
					GameSystem.inventory.consumeItem(potSlot[i]);
				GameSystem.inventory.inputItem(result);
				Cooking start = new Cooking();
				GameSystem.player.changeStarvePoint(-5);
			}
			//미트볼 요리
			else if(mt == 1 && tg == 0) {
				MeatBall result = new MeatBall();
				for(int i = 0; i < 4; i++)
					GameSystem.inventory.consumeItem(potSlot[i]);
				GameSystem.inventory.inputItem(result);
				Cooking start = new Cooking();
				GameSystem.player.changeStarvePoint(-5);
			}
			//생선튀김 요리
			else if(fs == 1 && tg == 2) {
				Fishsticks result = new Fishsticks();
				for(int i = 0; i < 4; i++)
					GameSystem.inventory.consumeItem(potSlot[i]);
				GameSystem.inventory.inputItem(result);
				Cooking start = new Cooking();
				GameSystem.player.changeStarvePoint(-5);
			}
			//과일잼 요리
			else if(br == 4) {
				BerryJam result = new BerryJam();
				for(int i = 0; i < 4; i++)
					GameSystem.inventory.consumeItem(potSlot[i]);
				GameSystem.inventory.inputItem(result);
				Cooking start = new Cooking();
				GameSystem.player.changeStarvePoint(-5);
			}
			//곤죽 요리
			else {
				WetGoop result = new WetGoop();
				for(int i = 0; i < 4; i++)
					GameSystem.inventory.consumeItem(potSlot[i]);
				GameSystem.inventory.inputItem(result);
				Cooking start = new Cooking();
				GameSystem.player.changeStarvePoint(-5);
			}
		}
		
		//슬롯 1 버튼을 누른 경우
		else if(clickButton.getText().equals("슬롯 1")) {
			clickButton.setIcon(slot0);
			System.out.println("슬롯 1");
		}

		//슬롯 2 버튼을 누른 경우
		else if(clickButton.getText().equals("슬롯 2")) {
			clickButton.setIcon(slot1);
			System.out.println("슬롯 2");
		}

		//슬롯 3 버튼을 누른 경우
		else if(clickButton.getText().equals("슬롯 3") ) {
			clickButton.setIcon(slot2);
			System.out.println("슬롯 3");
		}

		//슬롯 4 버튼을 누른 경우
		else if(clickButton.getText().equals("슬롯 4") ) {
			clickButton.setIcon(slot3);
			System.out.println("슬롯 4");


		}
		
		else
			;
	}
	
}