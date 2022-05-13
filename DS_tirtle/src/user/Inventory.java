package user;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Inventory {
	
	////인벤토리 클래스 필드////
	//인벤토리 패널 생성
	JPanel inventoryPanel = new JPanel();
	//아이템 객체들을 저장할 벡터 생성
	Vector<Item> vector = new Vector<Item>(21);
	
	/*
	 * 벡터에 요소 삽입하는 법
	 * vector.add(Item클래스 객체);
	 * 
	 * 인벤토리에서 아이템 선택해서 '선택아이템' 레퍼런스에 객체 저장하는법
	 * Item chooseItem = vector.get(i);
	 * 
	 * */
	
	void test() {
		for(int i = 1; i <= 21; i++) {
			 vector.get(i) ;

			 inventoryPanel.add(inventoryButton[i] = new JButton("Empty"));
		}
	}

	
	////인벤토리 클래스 생성자////
	//인벤토리 클래스 기본 생성자
	public Inventory() {
		
		//인벤토리 패널 배치 관리자 - 그리드레이아웃
		inventoryPanel.setLayout(new GridLayout(7, 3));
		
		//인벤토리 버튼 객체 배열 생성
		JButton[] inventoryButton = new JButton[21];
		//인벤토리 버튼 배치
		for(int i = 0; i <= 20; i++) {
			inventoryPanel.add(inventoryButton[i] = new JButton("Empty"));
		}
	}
	

}
