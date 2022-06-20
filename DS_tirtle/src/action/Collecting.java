package action;

import java.awt.*;
import javax.swing.*;

import item.Item;
import item.unprocessedFoods.*;
import item.unprocessedFoods.Mushroom;
import user.GameSystem;
import user.Menu;
import world.*;
import world.object.*;
import world.object.Object;
import world.resource.*;
import user.GameFrame;
import user.Inventory;

////ä���ϱ� Ŭ����////
public class Collecting extends Acting {
	
	/*
	 * ä���ϱ� Ŭ���� �ʵ�
	 * */
	
	//������ ��ü ����
	Item item = new Item();
	
	
	/*
	 * ä���ϱ� Ŭ���� ������
	 * */
	
	//�⺻ ������
	public Collecting(){
		CollectPanel collectPanel = new CollectPanel();
	}
	
	
	/*
	 * ä���ϱ� Ŭ���� �޼ҵ�
	 * */
	
	void getResource(Object object){
		//������Ʈ�� ���� �ڿ��� �����Ͽ� �κ��丮 ���� �޼ҵ忡 ����
		if(object.returnName() =="����") {Log log = new Log(); GameSystem.inventory.inputItem(log);}
		else if(object.returnName() =="����") {Twigs twigs = new Twigs(); GameSystem.inventory.inputItem(twigs);} 
		else if(object.returnName() =="Ǯ�Ѹ�") {CutGrass cutGrass = new CutGrass(); GameSystem.inventory.inputItem(cutGrass);}
		else if(object.returnName() =="��������") {Berry berry = new Berry(); GameSystem.inventory.inputItem(berry);}
		else if(object.returnName() =="��ٻѸ�") {Carrot carrot = new Carrot(); GameSystem.inventory.inputItem(carrot);}
		else if(object.returnName() =="�����Ѹ�") {Mushroom mushroom = new Mushroom(); GameSystem.inventory.inputItem(mushroom);}
		else if(object.returnName() =="����") {Rock rocky = new Rock(); GameSystem.inventory.inputItem(rocky);}
		else ;
	}
	
	//������ �ޱ� �ʵ� ���� + ���� ���� ��� ä�� ����
	//(-(monster.Mon_starve + map.mapStarve(map.Map_Num)))
	
}

////ä���ϱ� �г� Ŭ����////
class CollectPanel extends JPanel {
	
	//ä���ϱ� �г� ������
	CollectPanel() {
		//������ ���� ������Ʈ ���� ���� ���� �̹����� ����ִ� üũ�ڽ��� ���� �� �гο� �ֱ�
		
		
		
	}
}

////ä���ϱ� �̺�Ʈ Ŭ����////
class CollectEvent  {
	public CollectEvent(JButton clickButton, Collecting collecting){
		//ä�� ���� �̺�Ʈ?
		if(clickButton.getText().equals("ä������")){
			Menu menu = new Menu();
			}
	}
	
	public CollectEvent(JCheckBox checkbox){
		Collecting c = new Collecting();//�ݷ�Ʈ �޼ҵ� ������ ��� ��ü ������
		if(checkbox.getText().equals("����")) {
			Tree tree = new Tree();
			c.getResource(tree);}
		else if (checkbox.getText().equals("����")) {
			Sapling sapling = new Sapling();
			c.getResource(sapling);}
		else if (checkbox.getText().equals("Ǯ�Ѹ�")) {
			GrassTuft grassTuft = new GrassTuft();
			c.getResource(grassTuft);}
		else if (checkbox.getText().equals("��������")) {
			BerryBush berryBush = new BerryBush();
			c.getResource(berryBush);}
		else if (checkbox.getText().equals("��ٻѸ�")) {
			CarrotPlant carrotPlant = new CarrotPlant();
			c.getResource(carrotPlant);}
		else if (checkbox.getText().equals("�����Ѹ�")) {
			MushRoot mushRoot = new MushRoot();
			c.getResource(mushRoot);}
		else if (checkbox.getText().equals("����")) {
			Boulder rock = new Boulder();
			c.getResource(rock);}
	}
}
