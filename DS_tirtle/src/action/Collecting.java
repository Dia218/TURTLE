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

////채집하기 클래스////
public class Collecting extends Acting {
	
	/*
	 * 채집하기 클래스 필드
	 * */
	
	//아이템 객체 생성
	Item item = new Item();
	
	
	/*
	 * 채집하기 클래스 생성자
	 * */
	
	//기본 생성자
	public Collecting(){
		CollectPanel collectPanel = new CollectPanel();
	}
	
	
	/*
	 * 채집하기 클래스 메소드
	 * */
	
	void getResource(Object object){
		//오브젝트에 따라 자원을 생성하여 인벤토리 저장 메소드에 전달
		if(object.returnName() =="나무") {Log log = new Log(); GameSystem.inventory.inputItem(log);}
		else if(object.returnName() =="묘목") {Twigs twigs = new Twigs(); GameSystem.inventory.inputItem(twigs);} 
		else if(object.returnName() =="풀뿌리") {CutGrass cutGrass = new CutGrass(); GameSystem.inventory.inputItem(cutGrass);}
		else if(object.returnName() =="베리덤불") {Berry berry = new Berry(); GameSystem.inventory.inputItem(berry);}
		else if(object.returnName() =="당근뿌리") {Carrot carrot = new Carrot(); GameSystem.inventory.inputItem(carrot);}
		else if(object.returnName() =="버섯뿌리") {Mushroom mushroom = new Mushroom(); GameSystem.inventory.inputItem(mushroom);}
		else if(object.returnName() =="바위") {Rock rocky = new Rock(); GameSystem.inventory.inputItem(rocky);}
		else ;
	}
	
	//공복값 받기 필드 공복 + 몬스터 공복 대신 채집 공복
	//(-(monster.Mon_starve + map.mapStarve(map.Map_Num)))
	
}

////채집하기 패널 클래스////
class CollectPanel extends JPanel {
	
	//채집하기 패널 생성자
	CollectPanel() {
		//지역에 따른 오브젝트 종류 별로 각각 이미지가 들어있는 체크박스들 생성 및 패널에 넣기
		
		//이미지 아이콘 만들기
		ImageIcon treeIcon = new ImageIcon("./images/Tree.png");
		ImageIcon saplingIcon = new ImageIcon("./images/Sapling.png");
		ImageIcon grassIcon = new ImageIcon("./images/GrassTuft.png");
		ImageIcon berryIcon = new ImageIcon("./images/BerryBush.png");
		ImageIcon carrotIcon = new ImageIcon("./images/CarrotPlant.png");
		ImageIcon mushroomIcon = new ImageIcon("./images/Mushroom.png");
		ImageIcon rockIcon = new ImageIcon("./images/Rock.png");
		
		//자원별 체크박스 만들기
		JCheckBox tree = new JCheckBox("나무",treeIcon);
		JCheckBox sapling = new JCheckBox("묘목",saplingIcon);
		JCheckBox grass = new JCheckBox("풀뿌리",grassIcon);
		JCheckBox berry = new JCheckBox("베리덤불",berryIcon);
		JCheckBox carrot = new JCheckBox("당근뿌리",carrotIcon);
		JCheckBox mushroom = new JCheckBox("버섯뿌리",mushroomIcon);
		JCheckBox rock = new JCheckBox("바위",rockIcon);
		
		Biome biome = new Biome();
		//맵에 따라서 체크박스 패널에 넣기
		if(biome.returnName()=="초원") {this.add(sapling);this.add(grass);this.add(berry);this.add(carrot);this.add(mushroom);this.add(rock);}
		else if(biome.returnName()=="숲") {this.add(tree);this.add(sapling);}
		else if(biome.returnName()=="버치넛") {this.add(tree);this.add(mushroom);}
		else if(biome.returnName()=="사바나") {this.add(grass);this.add(carrot);}
		else if(biome.returnName()=="늪") {this.add(berry);}
		else if(biome.returnName()=="암석지대") {this.add(rock);}
		else ;

		//채집종료 버튼 만들기
		JButton colEnd = new JButton("채집종료");
		
		//채집종료 버튼 넣기
		this.add(colEnd);
		
		//플레이 패널 요소 전체삭제
		GameSystem.playPanel.removeAll();

		//채집하기 패널을 플레이패널에 넣기
		GameSystem.playPanel.add(this);
		
		//플레이 패널 다시 그리기
		GameSystem.playPanel.revalidate();
		GameSystem.playPanel.repaint();
	}
}

////채집하기 이벤트 클래스////
class CollectEvent  {
	public CollectEvent(JButton button){
		//채집 종료 이벤트?
		if(button.getText().equals("채집종료")){Menu menu = new Menu();}
	}
	
	public CollectEvent(JCheckBox checkbox){
		Collecting c = new Collecting();//콜렉트 메소드 쓰려고 잠깐 객체 생성함
		if(checkbox.getText().equals("나무")) {
			Tree tree = new Tree();
			c.getResource(tree);}
		else if (checkbox.getText().equals("묘목")) {
			Sapling sapling = new Sapling();
			c.getResource(sapling);}
		else if (checkbox.getText().equals("풀뿌리")) {
			GrassTuft grassTuft = new GrassTuft();
			c.getResource(grassTuft);}
		else if (checkbox.getText().equals("베리덤불")) {
			BerryBush berryBush = new BerryBush();
			c.getResource(berryBush);}
		else if (checkbox.getText().equals("당근뿌리")) {
			CarrotPlant carrotPlant = new CarrotPlant();
			c.getResource(carrotPlant);}
		else if (checkbox.getText().equals("버섯뿌리")) {
			MushRoot mushRoot = new MushRoot();
			c.getResource(mushRoot);}
		else if (checkbox.getText().equals("바위")) {
			Boulder rock = new Boulder();
			c.getResource(rock);}
	}
}
