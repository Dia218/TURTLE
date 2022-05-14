package user;

import java.awt.*;
import javax.swing.*;

public class Menu {

	/*
	 * 메뉴 클래스 필드
	 * */
	
	//메뉴 패널 생성
	JPanel menuPanel = new JPanel();
	
	
	/*
	 * 메뉴 클래스 메소드
	 * */
	//메뉴 선택 메소드
	void selectMenu() {
		System.playPanel.removeAll();
		System.playPanel.add(menuPanel);
	}
	
	
	/*
	 * 메뉴 클래스 생성자
	 * */
	
	//기본 생성자
	Menu() {
		
		//메뉴 패널 배치 관리자 - 플로우레이아웃
		menuPanel.setLayout(new FlowLayout());
		
		//메뉴 버튼 만들기
		JButton collectButton = new JButton("채집하기");
		collectButton.addActionListener(System.userListener);
		JButton cookButton = new JButton("요리하기");
		cookButton.addActionListener(System.userListener);
		JButton huntButton = new JButton("사냥하기");
		huntButton.addActionListener(System.userListener);
		JButton makeButton = new JButton("제작하기");
		makeButton.addActionListener(System.userListener);
		JButton moveButton = new JButton("이동하기");
		moveButton.addActionListener(System.userListener);
		
		//메뉴패널에 메뉴 버튼 배치하기
		menuPanel.add(moveButton);
		menuPanel.add(cookButton);
		menuPanel.add(huntButton);
		menuPanel.add(makeButton);
		menuPanel.add(collectButton);
	}
	
}
