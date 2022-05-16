package user;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import item.*;

//이터레이터를 이용해 소비할 아이템 갯수 체크 추가 고려

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
			inventoryButton[index].setIcon(item.returnIcon());
			inventoryButton[index].setText(item.returnName());
		}
	}
	
	//수정해야함 - 아이템 타입 검사를 해야함
	//인벤토리에서 아이템이 있는 지 확인하기
	int checkItem(Item item) {
		
		//벡터에서 해당 아이템이 저장된 첫번째 인덱스 값 찾기
		int index = vector.indexOf(item);
		
		//해당하는 아이템이 없을 경우
		if (index == -1) {
			
			 //아이템이 없으면 0 리턴
			 return 0;
		}
		
		//해당하는 아이템이 있을 경우
		else {
				
			//아이템이 있으면 1 리턴
			return 1;
		}
	}
	
	
	//인벤토리에서 아이템을 소비하기
	void consumeItem(Item item) {
		
		//해당 아이템이 저장된 백터 인덱스 값 찾기
		int index = vector.indexOf(item);
		
		//벡터에서 해당 객체 삭제
		vector.remove(index);
		
		//현재 인벤토리에 저장된 아이템의 갯수
		int vectorSize = vector.size();	
	}
	
	
	//아이템을 인벤토리에 적용하기
	void applyItem() {
		
		//현재 백터에 들어있는 아이템의 갯수
		int vectorSize = vector.size();
		
		//인벤토리 버튼 다시 그리기
		for(int i = 1; i < vectorSize; i++) {
			inventoryButton[i].setIcon(vector.get(i).returnIcon());
			inventoryButton[i].setText(vector.get(i).returnName());
		}
		
		//아이템이 들어있지 않은 칸 초기화
		for(int i = vectorSize; i < 21; i++) {
			inventoryButton[i] = new JButton("Empty");
		}
		
		//인벤토리 패널에 버튼 다시 넣기
		inventoryPanel.removeAll();
		for(int i = 0; i <= 20; i++) {
			inventoryPanel.add(inventoryButton[i]);
			inventoryButton[i].addActionListener(GameSystem.userListener);
		}
			
		//인벤토리 패널 다시 그리기
		inventoryPanel.revalidate();
		inventoryPanel.repaint();
	}
	
	
	//인벤토리에서 아이템을 선택하기
	void choose(Item chooseItem) {
		
		//요리하기인 경우
		
		
		//아이템이 도구인 경우
		
		//아이템이 음식인 경우
				
		
	}
	
	
	
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

class InventoryEventCheck {

	//인벤토리 패널 버튼 체크 생성자
	public InventoryEventCheck(JButton clickButton) {
		
		//비어있는 버튼을 클릭한 경우
		if(clickButton.getText().equals("Empty")) {
			; //아무 일도 일어나지 않음
		}
		
		else {
			//클릭한 버튼에 들어있는 아이템을 선택하기
			for(int index = 0; index <= 20; index++) {
				if (GameSystem.inventory.inventoryButton[index].equals(clickButton)) {
					Item chooseItem = GameSystem.inventory.vector.get(index);
					//인벤토리의 선택하기 메소드 호출
					GameSystem.inventory.choose(chooseItem);
					break;
				}
				else
					;
			}
		}
		
	}
}

