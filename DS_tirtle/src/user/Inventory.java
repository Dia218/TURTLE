package user;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Inventory {
	
	////인벤토리 클래스 필드////
	//인벤토리 패널 생성
	JPanel inventoryPanel = new JPanel();
	
	//인벤토리 버튼 객체 배열 생성
	JButton[] inventoryButton = new JButton[21];
	
	//아이템 객체들을 저장할 벡터 생성
	Vector<Item> vector = new Vector<Item>();
	
	//결과창에 출력할 텍스트 필드
	String result;
	
	/* 
	 * 인벤토리에서 아이템 선택해서 '선택아이템' 레퍼런스에 객체 저장하는법
	 * Item chooseItem = vector.get(i);
	 * 
	 * */
	
	////인벤토리 클래스 메소드////
	//인벤토리에 아이템을 집어넣기
	void inputItem(Item item) {
		
		//아이템을 넣기 전, 인벤토리에 들어있는 아이템의 갯수
		int vectorSize = vector.size();
		
		//인벤토리 용량을 초과할 경우
		if (vectorSize >= 21) {
			 result = "인벤토리가 꽉 찼습니다.";
		}
		else {
			//벡터에 아이템 객체 넣기
			vector.add(item);
			
			//벡터에서 방금 저장한 아이템 객체의 인덱스 값
			int index = vector.size()-1;
			
			//벡터 인덱스 값과 동일한 인덱스의 버튼에 이미지 삽입
			inventoryButton[index].setIcon(item.imageIcon);
			inventoryButton[index].setText(item.name);
		}
	}
	
	//인벤토리에서 아이템을 빼기
	void consumeItem() {
		for(int i = 1; i <= 21; i++) {
			 vector.get(i) ;

			 inventoryPanel.add(inventoryButton[i] = new JButton("Empty"));
		}
	}

	//인벤토리에서 아이템을 선택하기
	void choose() {
		
		
	}
	
	////인벤토리 클래스 생성자////
	//인벤토리 클래스 기본 생성자
	public Inventory() {
		
		//인벤토리 패널 배치 관리자 - 그리드레이아웃
		inventoryPanel.setLayout(new GridLayout(7, 3));
		
		//인벤토리 버튼 초기화 및 배치
		for(int i = 0; i <= 20; i++) {
			inventoryPanel.add(inventoryButton[i] = new JButton("Empty"));
		}
	}
	

}
