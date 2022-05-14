package user;
import java.awt.*;
import javax.swing.*;
import java.util.*;

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
			inventoryButton[index].setIcon(item.imageIcon);
			inventoryButton[index].setText(item.name);
		}
	}
	
	
	//�κ��丮���� �������� �Һ��ϱ�
	int consumeItem(Item item) {
		
		//�ش� �������� ����� ���� �ε��� �� ã��
		int index = vector.indexOf(item);
		
		//�ش��ϴ� �������� ���� ���
		if (index == -1) {
			 result = "��ᰡ �����մϴ�.";
			 
			 return 0;
		}
		
		//�ش��ϴ� �������� ���� ���
		else {
			//���Ϳ��� �ش� ��ü ����
			vector.remove(index);
			
			//���� �κ��丮�� ����� �������� ����
			int vectorSize = vector.size();
			
			//������ ������ ĭ���� �������� ����ִ� ĭ������ �κ��丮 ��ư �ٽ� �׸���
			for(int i = index; i < vectorSize; i++) {
				inventoryButton[i].setIcon(vector.get(i).imageIcon);
				inventoryButton[i].setText(vector.get(i).name);
			}
			
			//�������� ������� ���� ù��° ĭ �ʱ�ȭ
			inventoryButton[vectorSize] = new JButton("Empty");
			
			//�κ��丮 �гο� ��ư �ٽ� �ֱ�
			inventoryPanel.removeAll();
			for(int i = 0; i <= 20; i++) {
				inventoryPanel.add(inventoryButton[i]);
				inventoryButton[i].addActionListener(GameSystem.userListener);
			}
			
			//�κ��丮 �г� �ٽ� �׸���
			inventoryPanel.revalidate();
			inventoryPanel.repaint();
			
			return 1;
		}
		
	}

	//�κ��丮���� �������� �����ϱ�
	void choose() {
		
		
	}
	/* 
	 * �κ��丮���� ������ �����ؼ� '���þ�����' ���۷����� ��ü �����ϴ¹�
	 * Item chooseItem = vector.get(i);
	 * 
	 * */
	
	
	
	
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
