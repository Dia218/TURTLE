package action;

import java.awt.*;
import javax.swing.*;

import gui.GameFrame;
import gui.Inventory;
import gui.Menu;
import item.Item;
import item.unprocessedFoods.*;
import item.unprocessedFoods.Mushroom;
import manage.GameSystem;
import world.Map;
import world.object.*;
import world.object.Object;
import world.resource.*;

public class Collecting {
	Item item = new Item();
	public Collecting(){
		JPanel collectPanel = new JPanel();
	}
	
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

class CollectPanel extends JPanel {
	CollectPanel(){
		//������ ���� ������Ʈ ���� ���� ���� �̹����� ����ִ� üũ�ڽ��� ���� �� �гο� �ֱ�
		
		//�̹��� ������ �����
		ImageIcon treeIcon = new ImageIcon("./images/Tree.png");
		ImageIcon saplingIcon = new ImageIcon("./images/Sapling.png");
		ImageIcon grassIcon = new ImageIcon("./images/GrassTuft.png");
		ImageIcon berryIcon = new ImageIcon("./images/BerryBush.png");
		ImageIcon carrotIcon = new ImageIcon("./images/CarrotPlant.png");
		ImageIcon mushroomIcon = new ImageIcon("./images/Mushroom.png");
		ImageIcon rockIcon = new ImageIcon("./images/Rock.png");
		
		//�ڿ��� üũ�ڽ� �����
		JCheckBox tree = new JCheckBox("����",treeIcon);
		JCheckBox sapling = new JCheckBox("����",saplingIcon);
		JCheckBox grass = new JCheckBox("Ǯ�Ѹ�",grassIcon);
		JCheckBox berry = new JCheckBox("��������",berryIcon);
		JCheckBox carrot = new JCheckBox("��ٻѸ�",carrotIcon);
		JCheckBox mushroom = new JCheckBox("�����Ѹ�",mushroomIcon);
		JCheckBox rock = new JCheckBox("����",rockIcon);
		
		
		//�ʿ� ���� üũ�ڽ� �гο� �ֱ�
		if(Map.Map_Num==1) {this.add(sapling);this.add(grass);this.add(berry);this.add(carrot);this.add(mushroom);this.add(rock);}
		else if(Map.Map_Num==2) {this.add(tree);this.add(sapling);}
		else if(Map.Map_Num==3) {this.add(tree);this.add(mushroom);}
		else if(Map.Map_Num==4) {this.add(grass);this.add(carrot);}
		else if(Map.Map_Num==5) {this.add(berry);}
		else if(Map.Map_Num==6) {this.add(rock);}
		else ;

		//ä������ ��ư �����
		JButton colEnd = new JButton("ä������");
		
		//ä������ ��ư �ֱ�
		this.add(colEnd);
		
		//�÷��� �г� ��� ��ü����
		GameSystem.playPanel.removeAll();

		//ä���ϱ� �г��� �÷����гο� �ֱ�
		GameSystem.playPanel.add(this);
		
		//�÷��� �г� �ٽ� �׸���
		GameSystem.playPanel.revalidate();
		GameSystem.playPanel.repaint();
	}
	
	
	
}

class CollectEvent  {
	public CollectEvent(JButton button){
		//ä�� ���� �̺�Ʈ?
		if(button.getText().equals("ä������")){Menu menu = new Menu();}
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