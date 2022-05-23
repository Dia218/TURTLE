package user;

import java.awt.*;
import javax.swing.*;
import action.*;

public class Menu {

	
	/*
	 * 메뉴 클래스 생성자
	 * */
	
	//기본 생성자
	public Menu() {
		
		//메뉴 패널 생성
		JPanel menuPanel = new JPanel();
		
		//메뉴 패널 배치 관리자 - 플로우레이아웃
		menuPanel.setLayout(new FlowLayout());
		
		//메뉴 버튼 만들기
		JButton collectButton = new JButton("채집하기");
		collectButton.addActionListener(GameSystem.userListener);
		JButton cookButton = new JButton("요리하기");
		cookButton.addActionListener(GameSystem.userListener);
		JButton huntButton = new JButton("사냥하기");
		huntButton.addActionListener(GameSystem.userListener);
		JButton makeButton = new JButton("제작하기");
		makeButton.addActionListener(GameSystem.userListener);
		JButton moveButton = new JButton("이동하기");
		moveButton.addActionListener(GameSystem.userListener);
		
		//메뉴패널에 메뉴 버튼 배치하기
		menuPanel.add(moveButton);
		menuPanel.add(cookButton);
		menuPanel.add(huntButton);
		menuPanel.add(makeButton);
		menuPanel.add(collectButton);
		
		//메뉴 패널 배치하기
		GameSystem.playPanel.removeAll();
		GameSystem.playPanel.add(menuPanel);
		
		//중앙 패널 다시 그리기
		GameSystem.playPanel.revalidate();
		GameSystem.playPanel.repaint();
	}
	
}

class MenuEventCheck {

	/*
	 * 모드에 대한 필드
	 * */
	//사냥 모드
	String huntingMode = "사냥모드";

	//이동 모드
	String movingMode = "이동모드";

	//채집 모드
	String collectingMode = "채집모드";

	//제작 모드
	String makingMode = "제작모드";

	//요리 모드
	String cookingMode = "요리모드";

	
	/*
	 * 메뉴패널 버튼 체크 생성자
	 * */
	public MenuEventCheck(JButton clickButton) {
		//이동하기 버튼인 경우
		if(clickButton.getText().equals("이동하기") ) {
			
				/*Moving 클래스를 발생시켜서 지역이동*/
				 Moving moving = new Moving();

			//모드 바꾸는 메소드를 호출하여 이동 모드로 전환
			GameSystem.state.changeMode(movingMode);	
		}
		//사냥하기 버튼인 경우
		else if(clickButton.getText().equals("사냥하기") ) {
			
				/*Hunting 클래스를 발생시켜서 몬스터 사냥*/
				Hunting hunting = new Hunting(); 
				hunting.startHuntMenu();
				 
			//모드 바꾸는 메소드를 호출하여 사냥 모드로 전환
			GameSystem.state.changeMode(huntingMode);
		}
		//채집하기 버튼인 경우
		else if(clickButton.getText().equals("채집하기") ) {
			
				/*Collecting 클래스를 발생시켜서 오브젝트에서 자원 채집*/
				Collecting collecting = new Collecting();
				 
			//모드 바꾸는 메소드를 호출하여 채집 모드로 전환
			GameSystem.state.changeMode(collectingMode);
		}
		//제작하기 버튼인 경우
		else if(clickButton.getText().equals("제작하기") ) {
				
			//Making 클래스를 발생시켜서 도구 제작
			Making making = new Making();
			
			//모드 바꾸는 메소드를 호출하여 제작 모드로 전환
			GameSystem.state.changeMode(makingMode);
		}
		//요리하기 버튼인 경우
		else if(clickButton.getText().equals("요리하기") ) {
				
			//Cooking 클래스를 발생시켜서 요리하기
			Cooking cooking = new Cooking();
			
			//모드 바꾸는 메소드를 호출하여 요리 모드로 전환
			GameSystem.state.changeMode(cookingMode);
		}
		else
			;
	}
}