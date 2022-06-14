package gui;
import java.awt.*;
import javax.swing.*;

import java.util.*;
import item.*;
import manage.GameSystem;

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
	
	//선택한 아이템을 담을 필드
	Item chooseItem = new Empty();
	
	
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
			
			//동작확인
			System.out.println("인벤토리 버튼 초기화");
		}
	}
	
	
	/*
	 * 인벤토리 클래스 메소드
	 * */
	//인벤토리에 아이템을 집어넣기
	public void inputItem(Item item) {
		
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
			inventoryButton[index].setIcon(item.returnImg());
			inventoryButton[index].setText(item.returnName());
		}
	}
	

	//인벤토리에서 아이템이 있는 지 확인하기 - 제작하기용
	public Boolean checkItem(String itemName) {
		//현재 백터에 들어있는 아이템의 갯수
		int vectorSize = vector.size();
		
		//인벤토리 버튼 중에서 같은 이름을 가진 아이템 찾기
		for(int i = 0; i < vectorSize; i++) {
			//찾으려는 아이템 이름과 같은 이름의 버튼을 찾았을 경우
			if(inventoryButton[i].getText().equals(itemName)) {
				//true 리턴
				return true;
			}
		}
		//없을 경우 false 리턴
		return false;
	}
	
	
	//인벤토리에서 아이템을 소비하기
	public void consumeItem(Item item) {
		
		//현재 백터에 들어있는 아이템의 갯수
		int vectorSize = vector.size();
		
		//벡터에 저장된 아이템 중에서 소비할 아이템과 같은 이름 찾기
		for(int i = 0; i < vectorSize; i++) {
			//같은 이름을 찾았을 경우
			if(vector.get(i).returnName().equals(item.returnName())) {
				//벡터에서 해당 객체 삭제
				vector.remove(i);
				break;
			}
		}
	}
	
	
	//아이템을 인벤토리에 적용하기
	void applyItem() {
		
		//현재 백터에 들어있는 아이템의 갯수
		int vectorSize = vector.size();
		
		//인벤토리 버튼 다시 그리기
		for(int i = 0; i < vectorSize; i++) {
			inventoryButton[i].setIcon(vector.get(i).returnImg());
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
	
	
	//인벤토리에서 선택된 아이템을 리턴하기
	Item returnChoose() {
		return this.chooseItem;
	}
	
	
	//인벤토리의 음식 섭취
	public void eatFood(Foods food) {
		//허기 값 적용
		GameSystem.player.changeStarvePoint(food.returnStarvePoint());
		
		//체력 값 적용
		GameSystem.player.changeHealPoint(food.returnHealPoint());
		
		//음식 소비 호출
		this.consumeItem(food);
	}
	
	
	//인벤토리의 도구 장착
	public void equipTool(Tools tool) {
		//무기일 경우
		if(tool instanceof Weapons) {
			//무기 장착 호출
			GameSystem.player.changeEquipWeapon((Weapons) tool);
		}
		
		//방어구일 경우
		else if(tool instanceof Armors) {
			//방어구 장착 호출
			GameSystem.player.changeEquipArmor((Armors) tool);
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
		
		//객체가 들어있는 버튼을 클릭한 경우
		else {
			
			//클릭한 버튼에 들어있는 아이템 객체를 가져오기
			for(int index = 0; index <= 20; index++) {
				//클릭한 버튼에 들어있는 아이템 객체를 인벤토리에서 순차적으로 검색 -> 이터레이터가 되나?
				if (GameSystem.inventory.inventoryButton[index].getText().equals(clickButton.getText())) {
					//클릭한 아이템 객체 저장
					Item clickItem = GameSystem.inventory.vector.get(index);
					//아이템 타입에 따라 이벤트 처리하는 메소드 호출
					this.itemTypeCheck(clickItem);
					break;
				}
				else
					;
			}
		}
		
	}
	
	void itemTypeCheck(Item clickItem) {
		//요리 모드일 경우
		if(GameSystem.state.returnMode().equals("요리모드")) {
			GameSystem.inventory.chooseItem = clickItem;
		}
		//요리 모드가 아닐 경우
		else {
			//클릭한 아이템이 장비인 경우
			if (clickItem instanceof Tools) {
				GameSystem.inventory.equipTool((Tools) clickItem);
			}
			//클릭한 아이템이 음식인 경우
			else if (clickItem instanceof Foods) {
				GameSystem.inventory.eatFood((Foods) clickItem);
			}
			
			//아무 것도 아닌 경우
			else
				;
		}
	}
	
}

