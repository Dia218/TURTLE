package user;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Inventory {
	
	/*
	 * 인벤토리 클래스 필드
	 * */
	//인벤토리 패널 생성
	JPanel inventoryPanel = new JPanel();
	
	//인벤토리 버튼 객체 배열 생성
	JButton[] inventoryButton = new JButton[21];
	
	//아이템 객체들을 저장할 벡터 생성
	Vector<Item> vector = new Vector<Item>();
	
	//결과창에 출력할 텍스트 필드
	String result;
	
	
	/*
	 * 인벤토리 클래스 메소드
	 * */
	//인벤토리에 아이템을 집어넣기
	void inputItem(Item item) {
		
		//아이템을 넣기 전, 인벤토리에 들어있는 아이템의 갯수
		int vectorSize = vector.size();
		
		//인벤토리 용량을 초과할 경우
		if (vectorSize >= 21) {
			 result = "인벤토리가 꽉 찼습니다.";
		}
		else {
			vector.add(item);
			
			//벡터에서 방금 저장한 아이템 객체의 인덱스 값
			int index = vector.size()-1;
			
			//벡터 인덱스 값과 동일한 인덱스의 버튼에 이미지 삽입
			inventoryButton[index].setIcon(item.imageIcon);
			inventoryButton[index].setText(item.name);
		}
	}
	
	
	//인벤토리에서 아이템을 소비하기
	int consumeItem(Item item) {
		
		//해당 아이템이 저장된 백터 인덱스 값 찾기
		int index = vector.indexOf(item);
		
		//해당하는 아이템이 없을 경우
		if (index == -1) {
			 result = "재료가 부족합니다.";
			 
			 return 0;
		}
		
		//해당하는 아이템이 있을 경우
		else {
			//벡터에서 해당 객체 삭제
			vector.remove(index);
			
			//현재 인벤토리에 저장된 아이템의 갯수
			int vectorSize = vector.size();
			
			//삭제된 아이템 칸부터 아이템이 들어있는 칸까지의 인벤토리 버튼 다시 그리기
			for(int i = index; i < vectorSize; i++) {
				inventoryButton[i].setIcon(vector.get(i).imageIcon);
				inventoryButton[i].setText(vector.get(i).name);
			}
			
			//아이템이 들어있지 않은 첫번째 칸 초기화
			inventoryButton[vectorSize] = new JButton("Empty");
			
			//인벤토리 패널에 버튼 다시 넣기
			inventoryPanel.removeAll();
			for(int i = 0; i <= 20; i++) {
				inventoryPanel.add(inventoryButton[i]);
				inventoryButton[i].addActionListener(GameSystem.userListener);
			}
			
			//인벤토리 패널 다시 그리기
			inventoryPanel.revalidate();
			inventoryPanel.repaint();
			
			return 1;
		}
		
	}

	//인벤토리에서 아이템을 선택하기
	void choose() {
		
		
	}
	/* 
	 * 인벤토리에서 아이템 선택해서 '선택아이템' 레퍼런스에 객체 저장하는법
	 * Item chooseItem = vector.get(i);
	 * 
	 * */
	
	
	
	
	/*
	 * 인벤토리 클래스 생성자
	 * */
	//인벤토리 클래스 기본 생성자
	public Inventory() {
		
		//인벤토리 패널 배치 관리자 - 그리드레이아웃
		inventoryPanel.setLayout(new GridLayout(7, 3));
		
		//인벤토리 버튼 초기화 및 배치
		for(int i = 0; i <= 20; i++) {
			inventoryPanel.add(inventoryButton[i] = new JButton("Empty"));
			inventoryButton[i].addActionListener(GameSystem.userListener);
		}
	}
	

}
