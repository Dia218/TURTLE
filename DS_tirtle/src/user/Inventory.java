package user;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import item.*;

//���ͷ����͸� �̿��� �Һ��� ������ ���� üũ �߰� ���

public class Inventory {
	
	/*
	 * �κ��丮 Ŭ���� �ʵ�
	 * */
	//�κ��丮 �г� ����
	JPanel inventoryPanel = new JPanel();
	
	//�κ��丮 ��ư ��ü �迭 ����
	JButton[] inventoryButton = new JButton[21];
	
	//������ ��ü���� ������ ���� ����
	Vector<Item> vector = new Vector<Item>();
	
	//���â�� ����� �ؽ�Ʈ �ʵ�
	String result;
	
	
	/*
	 * �κ��丮 Ŭ���� �޼ҵ�
	 * */
	//�κ��丮�� �������� ����ֱ�
	void inputItem(Item item) {
		
		//�������� �ֱ� ��, �κ��丮�� ����ִ� �������� ����
		int vectorSize = vector.size();
		
		//�κ��丮 �뷮�� �ʰ��� ���
		if (vectorSize >= 21) {
			 result = "�κ��丮�� �� á���ϴ�.";
		}
		else {
			vector.add(item);
			
			//���Ϳ��� ��� ������ ������ ��ü�� �ε��� ��
			int index = vector.size()-1;
			
			//���� �ε��� ���� ������ �ε����� ��ư�� �̹��� ����
			inventoryButton[index].setIcon(item.returnIcon());
			inventoryButton[index].setText(item.returnName());
		}
	}
	
	//�����ؾ��� - ������ Ÿ�� �˻縦 �ؾ���
	//�κ��丮���� �������� �ִ� �� Ȯ���ϱ�
	int checkItem(Item item) {
		
		//���Ϳ��� �ش� �������� ����� ù��° �ε��� �� ã��
		int index = vector.indexOf(item);
		
		//�ش��ϴ� �������� ���� ���
		if (index == -1) {
			
			 //�������� ������ 0 ����
			 return 0;
		}
		
		//�ش��ϴ� �������� ���� ���
		else {
				
			//�������� ������ 1 ����
			return 1;
		}
	}
	
	
	//�κ��丮���� �������� �Һ��ϱ�
	void consumeItem(Item item) {
		
		//�ش� �������� ����� ���� �ε��� �� ã��
		int index = vector.indexOf(item);
		
		//���Ϳ��� �ش� ��ü ����
		vector.remove(index);
		
		//���� �κ��丮�� ����� �������� ����
		int vectorSize = vector.size();	
	}
	
	
	//�������� �κ��丮�� �����ϱ�
	void applyItem() {
		
		//���� ���Ϳ� ����ִ� �������� ����
		int vectorSize = vector.size();
		
		//�κ��丮 ��ư �ٽ� �׸���
		for(int i = 1; i < vectorSize; i++) {
			inventoryButton[i].setIcon(vector.get(i).returnIcon());
			inventoryButton[i].setText(vector.get(i).returnName());
		}
		
		//�������� ������� ���� ĭ �ʱ�ȭ
		for(int i = vectorSize; i < 21; i++) {
			inventoryButton[i] = new JButton("Empty");
		}
		
		//�κ��丮 �гο� ��ư �ٽ� �ֱ�
		inventoryPanel.removeAll();
		for(int i = 0; i <= 20; i++) {
			inventoryPanel.add(inventoryButton[i]);
			inventoryButton[i].addActionListener(GameSystem.userListener);
		}
			
		//�κ��丮 �г� �ٽ� �׸���
		inventoryPanel.revalidate();
		inventoryPanel.repaint();
	}
	
	
	//�κ��丮���� �������� �����ϱ�
	void choose(Item chooseItem) {
		
		//�丮�ϱ��� ���
		
		
		//�������� ������ ���
		
		//�������� ������ ���
				
		
	}
	
	
	
	/*
	 * �κ��丮 Ŭ���� ������
	 * */
	//�κ��丮 Ŭ���� �⺻ ������
	public Inventory() {
		
		//�κ��丮 �г� ��ġ ������ - �׸��巹�̾ƿ�
		inventoryPanel.setLayout(new GridLayout(7, 3));
		
		//�κ��丮 ��ư �ʱ�ȭ �� ��ġ
		for(int i = 0; i <= 20; i++) {
			inventoryPanel.add(inventoryButton[i] = new JButton("Empty"));
			inventoryButton[i].addActionListener(GameSystem.userListener);
		}
	}
}

class InventoryEventCheck {

	//�κ��丮 �г� ��ư üũ ������
	public InventoryEventCheck(JButton clickButton) {
		
		//����ִ� ��ư�� Ŭ���� ���
		if(clickButton.getText().equals("Empty")) {
			; //�ƹ� �ϵ� �Ͼ�� ����
		}
		
		else {
			//Ŭ���� ��ư�� ����ִ� �������� �����ϱ�
			for(int index = 0; index <= 20; index++) {
				if (GameSystem.inventory.inventoryButton[index].equals(clickButton)) {
					Item chooseItem = GameSystem.inventory.vector.get(index);
					//�κ��丮�� �����ϱ� �޼ҵ� ȣ��
					GameSystem.inventory.choose(chooseItem);
					break;
				}
				else
					;
			}
		}
		
	}
}

