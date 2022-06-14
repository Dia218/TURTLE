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
		if(Map.Map_Num == 1) {//�ʿ�
			rNum = rnd.nextInt(2)+1;//2���� ���� ����
			if(rNum==1) {Frog frog = new Frog(5);Hunt(frog);}
			else {Bunny bunny = new Bunny(5);Hunt(bunny);}
		}
		
		else if(Map.Map_Num == 2) {//��
			rNum = rnd.nextInt(2)+1;
			if(rNum==1) {Spider spider = new Spider(10);Hunt(spider);}
			else {Pig pig = new Pig(10);Hunt(pig);}
		}
		
		else if(Map.Map_Num == 3) {//��ġ��
			Pig pig = new Pig(10);Hunt(pig);
		}
		
		else if(Map.Map_Num == 4) {//��ٳ�
			rNum = rnd.nextInt(2)+1;
			if(rNum==1) {Buffalo buffalo = new Buffalo(15);Hunt(buffalo);}
			else {Bunny bunny = new Bunny(15);Hunt(bunny);}
		}
		
		else if(Map.Map_Num == 5) {//��
			rNum = rnd.nextInt(3)+1;//3���� ���� ����
			if(rNum==1) {Spider spider = new Spider(20);Hunt(spider);}
			else if(rNum==2) {Fishman fishman = new Fishman(20);Hunt(fishman);}
			else {Tentacle tentacle = new Tentacle(20);Hunt(tentacle);}
		}
		
		else {//�ϼ�����
			Spider spider = new Spider(15);Hunt(spider);
		}
		
	}
	
	void Hunt(Monster monster) {
		int PH=0;//�޼ҵ� �� �ڸ�
		int PA=0;
		int PD=0;
		int PS=0;//����
		int MH=monster.Mon_HP;
		int MA=monster.Mon_ATK;
		
		//������ �ޱ� �ʵ� ���� + ���� ����
		//(-(monster.Mon_starve + map.mapStarve(map.Map_Num)))
		
		for(int i=1;MH<=0;i++) {
			PH=PH-(MA-PD);
			MH=MH-PA;
			}
		
		//���Ͱ� ����ϴ� �ڿ��� �κ��丮 ���� �޼ҵ忡 ���� 
		
		Menu menu = new Menu(); //�̷��� �ϸ� �޴��� �����°� �¾�?
		}
}

class HuntPanel extends JPanel {
	public HuntPanel(Monster monster) {
		//���� ���� �߻� �޼ҵ��� ����� �޾Ƽ� �ش� ���� �̹����� �� üũ�ڽ� ���� �� �гο� �ֱ�
		
		if(monster.Mon_name=="Frog") {
			ImageIcon frogIcon = new ImageIcon("./images/Frog.png");
			JCheckBox frog = new JCheckBox("������",frogIcon);
			this.add(frog);
		}
		else if(monster.Mon_name=="Bunny") {
			ImageIcon rabbitIcon = new ImageIcon("./images/Rabbit.png");
			JCheckBox rabbit = new JCheckBox("�䳢",rabbitIcon);
			this.add(rabbit);
		}
		else if(monster.Mon_name=="Pig") {
			ImageIcon pigIcon = new ImageIcon("./images/Pig.png");
			JCheckBox pig = new JCheckBox("����",pigIcon);
			this.add(pig);
		}
		else if(monster.Mon_name=="Beefalo") {
			ImageIcon beefaloIcon = new ImageIcon("./images/Beefalo.png");
			JCheckBox beefalo = new JCheckBox("���ȷ�",beefaloIcon);
			this.add(beefalo);
		}
		else if(monster.Mon_name=="Spider") {
			ImageIcon spiderIcon = new ImageIcon("./images/Spider.png");
			JCheckBox spider = new JCheckBox("�Ź�",spiderIcon);
			this.add(spider);
		}
		else if(monster.Mon_name=="Tentacle") {
			ImageIcon tentacleIcon = new ImageIcon("./images/Tentacle.png");
			JCheckBox tentacle = new JCheckBox("�˼�",tentacleIcon);
			this.add(tentacle);
		}
		else if (monster.Mon_name=="Tentacle") {
			ImageIcon fishmanIcon = new ImageIcon("./images/Fishman.png");
			JCheckBox fishman = new JCheckBox("����",fishmanIcon);
			this.add(fishman);
		}
		else ;
		
		//���� ���� ��ư ������ �гο� �����Ű���
		JButton huntAtk = new JButton("�����ϱ�");
		JButton huntRun = new JButton("��������");
		this.add(huntAtk);this.add(huntRun);
	}
}

