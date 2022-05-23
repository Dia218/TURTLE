package action;

import user.GameSystem;
import user.Menu;
import user.Player;
import java.util.Random;
import world.*;
import world.monster.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

////사냥하기 클래스////
public class Hunting extends Acting{
	
	int rNum;
	Random rnd = new Random();
	Monster randomMonster;

	
	/*
	 * 사냥하기 클래스 생성자
	 * */
	public Hunting() {
		this.randomMonster = Random_mon();
		HuntPanel huntPanel = new HuntPanel(randomMonster);
	}
	
	
	/*
	 * 사냥하기 클래스 메소드
	 * */
	
	//몬스터 랜덤발생 메소드
	Monster Random_mon() {
		Biome biome = new Biome();
		if(biome.returnName()=="초원") {//초원
			rNum = rnd.nextInt(2)+1;//2마리 몬스터 랜덤
			if(rNum==1) {Frog frog = new Frog(); return frog;}
			else {Bunny bunny = new Bunny(); return bunny;}
		}
		
		else if(biome.returnName()=="숲") {//숲
			rNum = rnd.nextInt(2)+1;
			if(rNum==1) {Spider spider = new Spider(); return spider;}
			else {Pig pig = new Pig(); return pig;}
		}
		
		else if(biome.returnName()=="버치넛") {//버치넛
			Pig pig = new Pig(); return pig;
		}
		
		else if(biome.returnName()=="사바나") {//사바나
			rNum = rnd.nextInt(2)+1;
			if(rNum==1) {Beefalo beefalo = new Beefalo(); return beefalo;}
			else {Bunny bunny = new Bunny(); return bunny;}
		}
		
		else if(biome.returnName()=="늪") {//늪
			rNum = rnd.nextInt(3)+1;//3마리 몬스터 랜덤
			if(rNum==1) {Spider spider = new Spider(); return spider;}
			else if(rNum==2) {Fishman fishman = new Fishman(); return fishman;}
			else {Tentacle tentacle = new Tentacle(); return tentacle;}
		}
		
		else if(biome.returnName()=="암석지대") {//암석지대
			Spider spider = new Spider(); return spider;
		}
		else
			return null;
		
	}
	
	//몬스터 사냥 계산 메소드
	void Hunt(Monster monster) {
		int PH=0;//메소드 들어갈 자리
		int PA=0;
		int PD=0;
		int PS=0;//공복
		int MH=monster.getHP();
		int MA=monster.getATK();
		
		//공복값 받기 필드 공복 + 몬스터 공복
		//(-(monster.Mon_starve + map.mapStarve(map.Map_Num)))
		
		for(int i=1;MH<=0;i++) {
			PH=PH-(MA-PD);
			MH=MH-PA;
			}
		
		//몬스터가 드롭하는 자원을 인벤토리 저장 메소드에 전달 
		
		//메뉴로 이동
		Menu menu = new Menu();
	}
}

////사냥하기 패널 클래스////
class HuntPanel extends JPanel {
	public HuntPanel(Monster monster) {
		//몬스터 랜덤 발생 메소드의 결과를 받아서 해당 몬스터 이미지가 들어간 체크박스 생성 및 패널에 넣기
		
		if(monster.getName()=="Frog") {
			ImageIcon frogIcon = new ImageIcon("./images/Frog.png");
			JCheckBox frog = new JCheckBox("개구리",frogIcon);
			this.add(frog);
		}
		else if(monster.getName()=="Bunny") {
			ImageIcon rabbitIcon = new ImageIcon("./images/Rabbit.png");
			JCheckBox rabbit = new JCheckBox("토끼",rabbitIcon);
			this.add(rabbit);
		}
		else if(monster.getName()=="Pig") {
			ImageIcon pigIcon = new ImageIcon("./images/Pig.png");
			JCheckBox pig = new JCheckBox("돼지",pigIcon);
			this.add(pig);
		}
		else if(monster.getName()=="Beefalo") {
			ImageIcon beefaloIcon = new ImageIcon("./images/Beefalo.png");
			JCheckBox beefalo = new JCheckBox("비팔로",beefaloIcon);
			this.add(beefalo);
		}
		else if(monster.getName()=="Spider") {
			ImageIcon spiderIcon = new ImageIcon("./images/Spider.png");
			JCheckBox spider = new JCheckBox("거미",spiderIcon);
			this.add(spider);
		}
		else if(monster.getName()=="Tentacle") {
			ImageIcon tentacleIcon = new ImageIcon("./images/Tentacle.png");
			JCheckBox tentacle = new JCheckBox("촉수",tentacleIcon);
			this.add(tentacle);
		}
		else if (monster.getName()=="Tentacle") {
			ImageIcon fishmanIcon = new ImageIcon("./images/Fishman.png");
			JCheckBox fishman = new JCheckBox("어인",fishmanIcon);
			this.add(fishman);
		}
		else ;
		
		//공격 도망 버튼 생성 및 패널에 넣은거같다
		JButton huntAtk = new JButton("공격하기");
		JButton huntRun = new JButton("도망가기");
		this.add(huntAtk);this.add(huntRun);
	}

	

}

////사냥하기 이벤트 체크 클래스
class HuntingEventCheck {

/*
 * 사냥하기 이벤트 체크 생성자
 * */
	public HuntingEventCheck(JButton clickButton, Hunting hunting) {
	

		if(clickButton.getText().equals("공격하기")) {
		}
		
	
	}
}
