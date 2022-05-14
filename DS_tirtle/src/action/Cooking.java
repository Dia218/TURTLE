package action;

import java.awt.*;
import javax.swing.*;
import java.util.*;

import user.Item;
import user.System;


public class Cooking {

	/*
	 * 재료 선택 - 요리 결과 출력 - 인벤토리에 수납
	 */
	
	//솥 패널 생성
	JPanel potPanel = new JPanel();
	
	//솥 결과 패널
	JPanel resultPanel = new JPanel();

	//솥 버튼 객체 배열 생성
	JButton[] potButton = new JButton[4];
	
	//솥 결과 버튼 객체 배열 생성
	JButton[] resultButton = new JButton[4];
	
	//요리 재료 객체들을 저장할 벡터 생성
	Vector<Item> potItem = new Vector<Item>();
	
	//요리 결과 객체를 저장할 벡터 생성
	Vector<Item> resultItem = newVector<Item>();
	
	Object[] objs;
	
	//결과창에 출력할 텍스트 필드
	String result;
	
	
	//요리하기 메소드
	
	//선택아이템 객체를 요리 재료 아이템 객체로 넣기
	//Item potItem = user.Inventory.vector.get(i);	//Inventory import 필요
	
	//솥에 선택된 아이템을 집어넣기
	void inputItem(Item item) {
		
		//아이템을 넣기 전, 인벤토리에 들어있는 아이템의 갯수
		int vectorSize = potItem.size();
		
		//인벤토리 용량을 초과할 경우
		if (vectorSize >= 4) {
			 result = "솥이 꽉 찼습니다.";
		}
		else {
			potItem.add(item);
			
			//벡터에서 방금 저장한 아이템 객체의 인덱스 값
			int index = item.size()-1;
			
			//벡터 인덱스 값과 동일한 인덱스의 버튼에 이미지 삽입
			potButton[index].setIcon(item.imageIcon);
			potButton[index].setText(item.name);
		}
		
		
	}
	
	//아이템 객체를 사전 순으로 정렬
	void sort(Vector<Item> item) {
		objs = item.toArray();

		Arrays.sort(objs);
	}
	
	//재료들을 분별하여 요리 제작
	void cook () {
		//우선순위 1: 괴물라자냐
		if(objs[0] == "MonsterMeat", objs[1] == "MonsterMeat", objs[2] != "Twigs", objs[3] != "Twigs")
			resultItem.add(MonsterLasagna);
		//우선순위 2: 미트스튜
		else if(objs[0] == "Meat", objs[1] == "Meat", objs[2] != "Twigs", objs[3] != "Twigs")
			resultItem.add(MeatStew);
		//우선순위 3: 
		else if(objs[0] == "Meat", objs[2] != "Twigs", objs[2] !="Twigs", objs[3] != "Twigs")
			resultItem.add(Meatball);
		//재료가 겹치지 않은 가공식품. (가공식품 오름차순 우선순위. 곤죽 제외)
		else {
			if(objs[0] == "Berry", obj[1] == "Berry", obj[2] == "Berry", obj[3] == "Berry") {
				resultItem.add("BerryJam");
			}
			else if(objs[0] == "Fish", obj[1] != "Twigs", obj[2] == "Twigs", obj[3] == "Twigs" || obj[0] != "Twigs", obj[1] == "Fish", obj[2] == "Twigs", obj[3] == "Twigs")
				resultItem.add("Fishsticks");
			else if(objs[0] == "Carrot", obj[1] != "Carrot", obj[2] == "Carrot", obj[3] == "Carrot" || objs[0] == "Carrot", obj[1] != "Carrot", obj[2] == "Carrot", obj[3] == "Mushroom" || objs[0] == "Carrot", obj[1] != "Carrot", obj[2] == "Mushroom", obj[3] == "Mushroom" || objs[0] == "Carrot", obj[1] != "Mushroom", obj[2] == "Mushroom", obj[3] == "Mushroom" || objs[0] == "Mushroom", obj[1] != "Mushroom", obj[2] == "Mushroom", obj[3] == "Mushroom")
				resultItem.add("Ratatouille");
			else if(objs[0] == "Carrot", obj[1] != "Carrot", obj[2] == "Carrot", obj[3] == "FrogLeg" || objs[0] == "Carrot", obj[1] != "Carrot", obj[2] == "FrogLeg", obj[3] == "Mushroom" || objs[0] == "Carrot", obj[1] != "FrogLeg", obj[2] == "Mushroom", obj[3] == "Mushroom" || objs[0] == "FrogLeg", obj[1] != "Mushroom", obj[2] == "Mushroom", obj[3] == "Mushroom")
				resultItem.add("Sandwich");
			else
				resultItem.add("WetGoop");
		}
		
		//가공식품을 인벤토리에 추가
		void inputResultItem() {
			inputItem(resultItem);
		}
		
	}
	
	public Cooking() {
		
		//솥 패널 배치 관리자
		//potPanel.setLayout(new //?(4, 1));
		//솥 결과 패널 배치 관리자 
		//resultPanel.setLayout(new //?(1, 1));
		
		//인벤토리 버튼 초기화 및 배치
		for(int i = 0; i <= 4; i++) {
			potPanel.add(potButton[i] = new JButton("Empty"));
			potButton[i].addActionListener(System.userListener);
		}

		resultPanel.add(resultButton[0] = new JButton("Empty"));
		resultButton[0].addActionListener(System.userListener);
	}

}
