package world;

import world.Map;
import world.Monster;
import user.Player;
import java.util.Random;

public class Hunting {
	
	int Map_Num = 0; //���� �� ��ġ�� ��������?
	int RNum;
	Random rnd = new Random();
	
	Hunting(){
		random_mon();
	}
	
	void random_mon(){
		if(Map_Num == 1) {//�ʿ�
			RNum = rnd.nextInt(2)+1;//2���� ���� ����
			if(RNum==1) {Frog frog = new Frog();hunt(frog);}
			else {Bunny bunny = new Bunny();hunt(bunny);}
		}
		
		else if(Map_Num == 2) {//��
			RNum = rnd.nextInt(2)+1;
			if(RNum==1) {Spider spider = new Spider();hunt(spider);}
			else {Pig pig = new Pig();hunt(pig);}
		}
		
		else if(Map_Num == 3) {//��ġ��
			Pig pig = new Pig();hunt(pig);
		}
		
		else if(Map_Num == 4) {//��ٳ�
			RNum = rnd.nextInt(2)+1;
			if(RNum==1) {Buffalo buffalo = new Buffalo();hunt(buffalo);}
			else {Bunny bunny = new Bunny();hunt(bunny);}
		}
		
		else if(Map_Num == 5) {//��
			RNum = rnd.nextInt(3)+1;//3���� ���� ����
			if(RNum==1) {Spider spider = new Spider();hunt(spider);}
			else if(RNum==2) {Fishman fishman = new Fishman();hunt(fishman);}
			else {Tentacle tentacle = new Tentacle();hunt(tentacle);}
		}
		
		else {//�ϼ�����
			Spider spider = new Spider();hunt(spider);
		}
		
	}
	
	void hunt(Monster monster) {
		Player p = new Player();
		int PH=p.healPoint;
		int PA=p.offensivePower;
		int PD=p.defensivePower;
		int MH=monster.Mon_HP;
		int MA=monster.Mon_ATK;
		for(int i=1;MH<=0;i++) {
			PH=PH-(MA-PD);
			MH=MH-PA;
			if(PH<=0) {
				//���ӿ��� ��� ��?
			}
			}
		//���� �׾ ����ؾ��ϴµ� �ڿ� ��� ������
		}
}