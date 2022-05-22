package action;

import java.util.Arrays;
import java.util.Vector;

import java.awt.*;
import javax.swing.*;

import item.*;
import item.armors.*;
import item.processedFoods.*;
import item.unprocessedFoods.*;
import item.weapons.*;
import user.*;
import user.Menu;


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
	
	public static void salryojo() {
		int i = hahaha();
	}
	public int hahaha() {
		return 3;
	}
}
	
class CookingEventCheck {
	public CookingEventCheck(JButton clickButton) {
		
		ImageIcon slot0 = new ImageIcon("./images/slot0.png");
		ImageIcon slot1 = new ImageIcon("./images/slot1.png");
		ImageIcon slot2 = new ImageIcon("./images/slot2.png");
		ImageIcon slot3 = new ImageIcon("./images/slot3.png");
		String a = clickButton.getText();

		Empty empty = new Empty();
		
		Item[] potSlot = {empty, empty, empty, empty};
		
		Item resultSlot = empty;
		
		//재료 수량
		int br = 0, cr = 0, fs = 0, fl = 0, mt = 0, mm = 0, mr = 0, tg = 0;
		
		if(clickButton.getText().equals("활동 끝내기") ) {

			Menu menu = new Menu();
			System.out.println("활동 끝내기");
		}
		
		//요리 시작 버튼인 경우
		else if(clickButton.getText().equals("요리시작") ) {
			
			//potSlot의 재료를 갯수로 변환.
			for(int i = 0; i < 4; i++) {
				switch(potSlot[i].returnName()) {
				case "베리" :
					br++;
					break;
				case "당근" :
					cr++;
					break;
				case "물고기" :
					fs++;
					break;
				case "개구리다리" :
					fl++;
					break;
				case "고기" :
					mt++;
					break;
				case "괴물고기" :
					mm++;
					break;
				case "버섯" :
					mr++;
					break;
				case "나무가지" :
					tg++;
					break;
				}
			}
			
			//potSlot중 빈 곳이 있다면 출력
			if(potSlot[0] == empty || potSlot[1] == empty || potSlot[2] == empty || potSlot[3] == empty) {
				System.out.println("재료를 4개 넣어주세요.");
			}
			
			//
			else {
				Cooking start = new Cooking();
			}
		}
		else if(clickButton.getText().equals("슬롯 1")) {
			clickButton.setIcon(slot0);
			System.out.println("슬롯 1");
		}
		else if(clickButton.getText().equals("슬롯 2")) {
			clickButton.setIcon(slot1);
			System.out.println("슬롯 2");
		}
		else if(clickButton.getText().equals("슬롯 3") ) {
			clickButton.setIcon(slot2);
			System.out.println("슬롯 3");
		}
		else if(clickButton.getText().equals("슬롯 4") ) {
			clickButton.setIcon(slot3);
			System.out.println("슬롯 4");
			Cooking.salryojo();
		}
		else
			;
	}
	
}