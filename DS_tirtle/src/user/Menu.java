package user;

import java.awt.*;
import javax.swing.*;

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

	//메뉴패널 버튼 체크 생성자
	public MenuEventCheck(JButton clickButton) {
		//이동하기 버튼인 경우
		if(clickButton.getText().equals("이동하기") ) {
				/*Moving 클래스를 발생시켜서 지역이동*/
				/*
				 * Moving moving = new Moving();
				 * */;
		}
		//사냥하기 버튼인 경우
		else if(clickButton.getText().equals("사냥하기") ) {
				/*Hunting 클래스를 발생시켜서 몬스터 사냥*/
				/*
				 * Hunting hunting = new Hunting(); 
				 * */;
		}
		//채집하기 버튼인 경우
		else if(clickButton.getText().equals("채집하기") ) {
				/*Collecting 클래스를 발생시켜서 오브젝트에서 자원 채집*/
				/*
				 * Collecting collecting = new Collecting();
				 * */;
		}
		//제작하기 버튼인 경우
		else if(clickButton.getText().equals("제작하기") ) {
				/*Making 클래스를 발생시켜서 도구 제작*/
				/*
				 * Making making = new Making();
				 * */;
		}
		//요리하기 버튼인 경우
		else if(clickButton.getText().equals("요리하기") ) {
				/*Cooking 클래스를 발생시켜서 요리하기*/
				/*
				 * Cooking cooking = new Cooking();
				 * */;
		}
		else
			;
	}
}