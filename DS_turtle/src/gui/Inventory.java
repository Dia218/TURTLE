package gui;
import java.awt.*;
import javax.swing.*;

import java.util.*;
import item.*;
import manage.GameSystem;

public class Inventory {
	
	/*
	 * �κ��丮 Ŭ���� �ʵ�
	 * */
	//�κ��丮 �г� ����
	JPanel inventoryPanel = new JPanel();
	
	//�κ��丮 �ڽ����� ������ ���� ����
	Vector<InventoryBox> boxVector = new Vector<InventoryBox>();
	
	//�������� ������ ���� ����
	Vector<Item> itemVector = new Vector<Item>();
	
	//������ �������� ���� �ʵ�
	Item chooseItem = new Empty();
	
	
	/*
	 * �κ��丮 Ŭ���� ������
	 * */
	//�κ��丮 Ŭ���� �⺻ ������
	public Inventory() {	
		//�κ��丮 �г� ��ġ ������ - �׸��巹�̾ƿ�
		inventoryPanel.setLayout(new GridLayout(7, 3));
		
		//�κ��丮 �ڽ� �ʱ�ȭ �� ��ġ
		for(int i = 0; i <= 20; i++) {
			InventoryBox inventoryBox = new InventoryBox(i);
			boxVector.add(inventoryBox);
			inventoryPanel.add(inventoryBox);
			
			//����Ȯ��
			System.out.println("�κ��丮 �ڽ� �ʱ�ȭ");
		}
	}
	
	
	/*
	 * �κ��丮 Ŭ���� �޼ҵ�
	 * */
	//�κ��丮�� �������� ����ֱ�
	public void inputItem(Item item) {
		
		//�������� �ֱ� ��, �κ��丮�� ����ִ� �������� ����
		int vectorSize = itemVector.size();
		
		//�κ��丮 �뷮�� �ʰ��� ���
		if (vectorSize >= 21) {
			GameSystem.result.changeResultArea("�κ��丮�� �� á���ϴ�.");
		}
		else {
			//������ ���Ϳ� ������ �߰�
			itemVector.add(item);
			
			//�κ��丮 �ٽ� �׸���
			inventoryPanel.repaint();
		}
	}
	

	//�κ��丮���� �ش� �������� �ִ� �� Ȯ���ϱ� - �����ϱ��
	public boolean checkItem(Item item) {
		
		if(itemVector.contains(item)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	//�κ��丮���� �������� �Һ��ϱ�
	public void consumeItem(Item item) {
		
		//������ ���Ϳ��� �ش� �ε��� ã�� 
		int index = itemVector.indexOf(item);
		
		//������ ���Ϳ��� ������ ����
		itemVector.remove(index);
		
		//�κ��丮 �ٽ� �׸���
		inventoryPanel.repaint();
	}
	public void consumeItem(InventoryBox box) {		
		//�κ��丮 �ڽ� ���Ϳ��� �ش� �ε��� ã�� 
		int index = boxVector.indexOf(box);
		
		//������ ���Ϳ��� ������ ����
		itemVector.remove(index);
		
		//�κ��丮 �ٽ� �׸���
		inventoryPanel.repaint();
	}

	//���õ� ������ ��������
	public Item getChooseItem() {
		Item item = chooseItem;
		chooseItem = new Empty();
		consumeItem(item);
		return item;
	}
	
	//�κ��丮�� ���� ����
	public void eatFood(InventoryBox foodBox) {
		//�κ��丮 �ڽ��� ����ִ� ���� ������ ã��
		Foods food = (Foods) foodBox.getBoxItem();
		
		//��� �� ����
		GameSystem.player.changeStarvePoint(food.returnStarvePoint());
		
		//ü�� �� ����
		GameSystem.player.changeHealPoint(food.returnHealPoint());
		
		//���� �Һ� ȣ��
		this.consumeItem(foodBox);
	}
	
	
	//�κ��丮�� ���� ����
	public void equipTool(InventoryBox toolBox) {
		//�κ��丮 �ڽ��� ����ִ� ���� ������ ã��
		Tools tool = (Tools) toolBox.getBoxItem();
		
		//������ ���
		if(tool instanceof Weapons) {
			//���� ���� ȣ��
			GameSystem.player.changeEquipWeapon((Weapons) tool);
		}
		
		//���� ���
		else if(tool instanceof Armors) {
			//�� ���� ȣ��
			GameSystem.player.changeEquipArmor((Armors) tool);
		}
	}
}

class InventoryEventCheck {

	//�κ��丮 �г� ��ư üũ ������
	public InventoryEventCheck(JButton clickButton) {
		if(clickButton.getParent() instanceof InventoryBox) {
			//���� Ȯ��
			System.out.println("�κ��丮 �̺�Ʈ �߻�");
			
			//Ŭ���� ��ư�� �κ��丮 �ڽ� �г�
			InventoryBox clickBox = (InventoryBox) clickButton.getParent();
			
			//Ŭ���� ��ư�� ����ִ� ������ ��ü
			Item clickItem = (clickBox).getBoxItem();
			
			//����ִ� ��ư�� Ŭ���� ���
			if(clickItem.equals(new Empty())) {
				; //�ƹ� �ϵ� �Ͼ�� ����
			}
			
			//��ü�� ����ִ� ��ư�� Ŭ���� ���
			else {	
				itemTypeCheck(clickItem, clickBox);
			}
		}
		else 
			;

	}
	
	void itemTypeCheck(Item clickItem, InventoryBox clickBox) {
		//�丮 ����� ���
		if(GameSystem.state.returnMode().equals("�丮���")) {
			GameSystem.inventory.chooseItem = clickItem;
		}
		//�丮 ��尡 �ƴ� ���
		else {
			//Ŭ���� �������� ����� ���
			if (clickItem instanceof Tools) {
				GameSystem.inventory.equipTool(clickBox);
			}
			//Ŭ���� �������� ������ ���
			else if (clickItem instanceof Foods) {
				GameSystem.inventory.eatFood(clickBox);
			}
			
			//�ƹ� �͵� �ƴ� ���
			else
				;
		}
	}
	
}


//�κ��丮 �� ĭ�� �ش��ϴ� Ŭ����
class InventoryBox extends JPanel {
	
	/*�κ��丮 �ڽ� �ʵ�*/
	private Item boxItem;
	private int boxNumber;
	
	/*�κ��丮 �ڽ� ������*/
	InventoryBox(int index) {
		this.boxNumber = index;
	}
	
	/*�κ��丮 �ڽ� �޼ҵ�*/
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
