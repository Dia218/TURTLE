package action;

import world.Map;
import world.Monster;

import java.util.Random;
import world.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

import gui.Menu;
import gui.Player;
import manage.GameSystem;

public class Hunting {
	
	int rNum;
	Random rnd = new Random();
	
	public Hunting(){
		
		Random_mon();
		JPanel huntPanel = new JPanel();
		
	}
	
	void Random_mon(){
		if(Map.Map_Num == 1) {//초원
			rNum = rnd.nextInt(2)+1;//2마리 몬스터 랜덤
			if(rNum==1) {Frog frog = new Frog(5);Hunt(frog);}
			else {Bunny bunny = new Bunny(5);Hunt(bunny);}
		}
		
		else if(Map.Map_Num == 2) {//숲
			rNum = rnd.nextInt(2)+1;
			if(rNum==1) {Spider spider = new Spider(10);Hunt(spider);}
			else {Pig pig = new Pig(10);Hunt(pig);}
		}
		
		else if(Map.Map_Num == 3) {//버치넛
			Pig pig = new Pig(10);Hunt(pig);
		}
		
		else if(Map.Map_Num == 4) {//사바나
			rNum = rnd.nextInt(2)+1;
			if(rNum==1) {Buffalo buffalo = new Buffalo(15);Hunt(buffalo);}
			else {Bunny bunny = new Bunny(15);Hunt(bunny);}
		}
		
		else if(Map.Map_Num == 5) {//늪
			rNum = rnd.nextInt(3)+1;//3마리 몬스터 랜덤
			if(rNum==1) {Spider spider = new Spider(20);Hunt(spider);}
			else if(rNum==2) {Fishman fishman = new Fishman(20);Hunt(fishman);}
			else {Tentacle tentacle = new Tentacle(20);Hunt(tentacle);}
		}
		
		else {//암석지대
			Spider spider = new Spider(15);Hunt(spider);
		}
		
	}
	
	void Hunt(Monster monster) {
		int PH=0;//메소드 들어갈 자리
		int PA=0;
		int PD=0;
		int PS=0;//공복
		int MH=monster.Mon_HP;
		int MA=monster.Mon_ATK;
		
		//공복값 받기 필드 공복 + 몬스터 공복
		//(-(monster.Mon_starve + map.mapStarve(map.Map_Num)))
		
		for(int i=1;MH<=0;i++) {
			PH=PH-(MA-PD);
			MH=MH-PA;
			}
		
		//몬스터가 드롭하는 자원을 인벤토리 저장 메소드에 전달 
		
		Menu menu = new Menu(); //이렇게 하면 메뉴로 가지는거 맞아?
		}
}

class HuntPanel extends JPanel {
	public HuntPanel(Monster monster) {
		//몬스터 랜덤 발생 메소드의 결과를 받아서 해당 몬스터 이미지가 들어간 체크박스 생성 및 패널에 넣기
		
		if(monster.Mon_name=="Frog") {
			ImageIcon frogIcon = new ImageIcon("./images/Frog.png");
			JCheckBox frog = new JCheckBox("개구리",frogIcon);
			this.add(frog);
		}
		else if(monster.Mon_name=="Bunny") {
			ImageIcon rabbitIcon = new ImageIcon("./images/Rabbit.png");
			JCheckBox rabbit = new JCheckBox("토끼",rabbitIcon);
			this.add(rabbit);
		}
		else if(monster.Mon_name=="Pig") {
			ImageIcon pigIcon = new ImageIcon("./images/Pig.png");
			JCheckBox pig = new JCheckBox("돼지",pigIcon);
			this.add(pig);
		}
		else if(monster.Mon_name=="Beefalo") {
			ImageIcon beefaloIcon = new ImageIcon("./images/Beefalo.png");
			JCheckBox beefalo = new JCheckBox("비팔로",beefaloIcon);
			this.add(beefalo);
		}
		else if(monster.Mon_name=="Spider") {
			ImageIcon spiderIcon = new ImageIcon("./images/Spider.png");
			JCheckBox spider = new JCheckBox("거미",spiderIcon);
			this.add(spider);
		}
		else if(monster.Mon_name=="Tentacle") {
			ImageIcon tentacleIcon = new ImageIcon("./images/Tentacle.png");
			JCheckBox tentacle = new JCheckBox("촉수",tentacleIcon);
			this.add(tentacle);
		}
		else if (monster.Mon_name=="Tentacle") {
			ImageIcon fishmanIcon = new ImageIcon("./images/Fishman.png");
			JCheckBox fishman = new JCheckBox("어인",fishmanIcon);
			this.add(fishman);
		}
		else ;
		
		//공격 도망 버튼 생성및 패널에 넣은거같다
		JButton huntAtk = new JButton("공격하기");
		JButton huntRun = new JButton("도망가기");
		this.add(huntAtk);this.add(huntRun);
	}
}

