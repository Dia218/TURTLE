package gui;
import java.awt.*;
import javax.swing.*;

import java.util.*;
import item.*;
import manage.GameSystem;

public class Inventory {
	
	/*
	 * 인벤토리 클래스 필드
	 * */
	//인벤토리 패널 생성
	JPanel inventoryPanel = new JPanel();
	
	//인벤토리 박스들을 저장할 벡터 생성
	Vector<InventoryBox> boxVector = new Vector<InventoryBox>();
	
	//아이템을 저장할 벡터 생성
	Vector<Item> itemVector = new Vector<Item>();
	
	//선택한 아이템을 담을 필드
	Item chooseItem = new Empty();
	
	
	/*
	 * 인벤토리 클래스 생성자
	 * */
	//인벤토리 클래스 기본 생성자
	public Inventory() {	
		//인벤토리 패널 배치 관리자 - 그리드레이아웃
		inventoryPanel.setLayout(new GridLayout(7, 3));
		
		//인벤토리 박스 초기화 및 배치
		for(int i = 0; i <= 20; i++) {
			InventoryBox inventoryBox = new InventoryBox(i);
			boxVector.add(inventoryBox);
			inventoryPanel.add(inventoryBox);
			
			//동작확인
			System.out.println("인벤토리 박스 초기화");
		}
	}
	
	
	/*
	 * 인벤토리 클래스 메소드
	 * */
	//인벤토리에 아이템을 집어넣기
	public void inputItem(Item item) {
		
		//아이템을 넣기 전, 인벤토리에 들어있는 아이템의 갯수
		int vectorSize = itemVector.size();
		
		//인벤토리 용량을 초과할 경우
		if (vectorSize >= 21) {
			GameSystem.result.changeResultArea("인벤토리가 꽉 찼습니다.");
		}
		else {
			//아이템 벡터에 아이템 추가
			itemVector.add(item);
			
			//인벤토리 다시 그리기
			inventoryPanel.repaint();
		}
	}
	

	//인벤토리에서 해당 아이템이 있는 지 확인하기 - 제작하기용
	public boolean checkItem(Item item) {
		
		if(itemVector.contains(item)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	//인벤토리에서 아이템을 소비하기
	public void consumeItem(Item item) {
		
		//아이템 백터에서 해당 인덱스 찾기 
		int index = itemVector.indexOf(item);
		
		//아이템 백터에서 아이템 삭제
		itemVector.remove(index);
		
		//인벤토리 다시 그리기
		inventoryPanel.repaint();
	}
	public void consumeItem(InventoryBox box) {		
		//인벤토리 박스 백터에서 해당 인덱스 찾기 
		int index = boxVector.indexOf(box);
		
		//아이템 백터에서 아이템 삭제
		itemVector.remove(index);
		
		//인벤토리 다시 그리기
		inventoryPanel.repaint();
	}

	//선택된 아이템 가져가기
	public Item getChooseItem() {
		Item item = chooseItem;
		chooseItem = new Empty();
		consumeItem(item);
		return item;
	}
	
	//인벤토리의 음식 섭취
	public void eatFood(InventoryBox foodBox) {
		//인벤토리 박스에 들어있는 음식 아이템 찾기
		Foods food = (Foods) foodBox.getBoxItem();
		
		//허기 값 적용
		GameSystem.player.changeStarvePoint(food.returnStarvePoint());
		
		//체력 값 적용
		GameSystem.player.changeHealPoint(food.returnHealPoint());
		
		//음식 소비 호출
		this.consumeItem(foodBox);
	}
	
	
	//인벤토리의 도구 장착
	public void equipTool(InventoryBox toolBox) {
		//인벤토리 박스에 들어있는 도구 아이템 찾기
		Tools tool = (Tools) toolBox.getBoxItem();
		
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
		if(clickButton.getParent() instanceof InventoryBox) {
			//동작 확인
			System.out.println("인벤토리 이벤트 발생");
			
			//클릭한 버튼의 인벤토리 박스 패널
			InventoryBox clickBox = (InventoryBox) clickButton.getParent();
			
			//클릭한 버튼에 들어있는 아이템 객체
			Item clickItem = (clickBox).getBoxItem();
			
			//비어있는 버튼을 클릭한 경우
			if(clickItem.equals(new Empty())) {
				; //아무 일도 일어나지 않음
			}
			
			//객체가 들어있는 버튼을 클릭한 경우
			else {	
				itemTypeCheck(clickItem, clickBox);
			}
		}
		else 
			;

	}
	
	void itemTypeCheck(Item clickItem, InventoryBox clickBox) {
		//요리 모드일 경우
		if(GameSystem.state.returnMode().equals("요리모드")) {
			GameSystem.inventory.chooseItem = clickItem;
		}
		//요리 모드가 아닐 경우
		else {
			//클릭한 아이템이 장비인 경우
			if (clickItem instanceof Tools) {
				GameSystem.inventory.equipTool(clickBox);
			}
			//클릭한 아이템이 음식인 경우
			else if (clickItem instanceof Foods) {
				GameSystem.inventory.eatFood(clickBox);
			}
			
			//아무 것도 아닌 경우
			else
				;
		}
	}
	
}


//인벤토리 한 칸에 해당하는 클래스
class InventoryBox extends JPanel {
	
	/*인벤토리 박스 필드*/
	private Item boxItem;
	private int boxNumber;
	
	/*인벤토리 박스 생성자*/
	InventoryBox(int index) {
		this.boxNumber = index;
	}
	
	/*인벤토리 박스 메소드*/
	Item getBoxItem() {
		return this.boxItem;
	}

	@Override
	public void paintComponent(Graphics g) {
		if(GameSystem.inventory.itemVector.get(boxNumber) == null) {
			this.boxItem = new Empty();
		}
		else {
			this.boxItem = GameSystem.inventory.itemVector.get(boxNumber);
		}
		
		JButton itemButton = new JButton(boxItem.returnImg());
		itemButton.addActionListener(GameSystem.userListener);
		this.add(itemButton);
	}
	
}
