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

////����ϱ� Ŭ����////
public class Hunting extends Acting{
	
	int rNum;
	Random rnd = new Random();
	Monster randomMonster;

	
	/*
	 * ����ϱ� Ŭ���� ������
	 * */
	public Hunting() {
		this.randomMonster = Random_mon();
		HuntPanel huntPanel = new HuntPanel(randomMonster);
	}
	
	
	/*
	 * ����ϱ� Ŭ���� �޼ҵ�
	 * */
	
	//���� �����߻� �޼ҵ�
	Monster Random_mon() {
		Biome biome = new Biome();
		if(biome.returnName()=="�ʿ�") {//�ʿ�
			rNum = rnd.nextInt(2)+1;//2���� ���� ����
			if(rNum==1) {Frog frog = new Frog(); return frog;}
			else {Bunny bunny = new Bunny(); return bunny;}
		}
		
		else if(biome.returnName()=="��") {//��
			rNum = rnd.nextInt(2)+1;
			if(rNum==1) {Spider spider = new Spider(); return spider;}
			else {Pig pig = new Pig(); return pig;}
		}
		
		else if(biome.returnName()=="��ġ��") {//��ġ��
			Pig pig = new Pig(); return pig;
		}
		
		else if(biome.returnName()=="��ٳ�") {//��ٳ�
			rNum = rnd.nextInt(2)+1;
			if(rNum==1) {Beefalo beefalo = new Beefalo(); return beefalo;}
			else {Bunny bunny = new Bunny(); return bunny;}
		}
		
		else if(biome.returnName()=="��") {//��
			rNum = rnd.nextInt(3)+1;//3���� ���� ����
			if(rNum==1) {Spider spider = new Spider(); return spider;}
			else if(rNum==2) {Fishman fishman = new Fishman(); return fishman;}
			else {Tentacle tentacle = new Tentacle(); return tentacle;}
		}
		
		else if(biome.returnName()=="�ϼ�����") {//�ϼ�����
			Spider spider = new Spider(); return spider;
		}
		else
			return null;
		
	}
	
	//���� ��� ��� �޼ҵ�
	void Hunt(Monster monster) {
		int PH=0;//�޼ҵ� �� �ڸ�
		int PA=0;
		int PD=0;
		int PS=0;//����
		int MH=monster.getHP();
		int MA=monster.getATK();
		
		//������ �ޱ� �ʵ� ���� + ���� ����
		//(-(monster.Mon_starve + map.mapStarve(map.Map_Num)))
		
		for(int i=1;MH<=0;i++) {
			PH=PH-(MA-PD);
			MH=MH-PA;
			}
		
		//���Ͱ� ����ϴ� �ڿ��� �κ��丮 ���� �޼ҵ忡 ���� 
		
		//�޴��� �̵�
		Menu menu = new Menu();
	}
}

////����ϱ� �г� Ŭ����////
class HuntPanel extends JPanel {
	public HuntPanel(Monster monster) {
		//���� ���� �߻� �޼ҵ��� ����� �޾Ƽ� �ش� ���� �̹����� �� üũ�ڽ� ���� �� �гο� �ֱ�
		
		if(monster.getName()=="Frog") {
			ImageIcon frogIcon = new ImageIcon("./images/Frog.png");
			JCheckBox frog = new JCheckBox("������",frogIcon);
			this.add(frog);
		}
		else if(monster.getName()=="Bunny") {
			ImageIcon rabbitIcon = new ImageIcon("./images/Rabbit.png");
			JCheckBox rabbit = new JCheckBox("�䳢",rabbitIcon);
			this.add(rabbit);
		}
		else if(monster.getName()=="Pig") {
			ImageIcon pigIcon = new ImageIcon("./images/Pig.png");
			JCheckBox pig = new JCheckBox("����",pigIcon);
			this.add(pig);
		}
		else if(monster.getName()=="Beefalo") {
			ImageIcon beefaloIcon = new ImageIcon("./images/Beefalo.png");
			JCheckBox beefalo = new JCheckBox("���ȷ�",beefaloIcon);
			this.add(beefalo);
		}
		else if(monster.getName()=="Spider") {
			ImageIcon spiderIcon = new ImageIcon("./images/Spider.png");
			JCheckBox spider = new JCheckBox("�Ź�",spiderIcon);
			this.add(spider);
		}
		else if(monster.getName()=="Tentacle") {
			ImageIcon tentacleIcon = new ImageIcon("./images/Tentacle.png");
			JCheckBox tentacle = new JCheckBox("�˼�",tentacleIcon);
			this.add(tentacle);
		}
		else if (monster.getName()=="Tentacle") {
			ImageIcon fishmanIcon = new ImageIcon("./images/Fishman.png");
			JCheckBox fishman = new JCheckBox("����",fishmanIcon);
			this.add(fishman);
		}
		else ;
		
		//���� ���� ��ư ���� �� �гο� �����Ű���
		JButton huntAtk = new JButton("�����ϱ�");
		JButton huntRun = new JButton("��������");
		this.add(huntAtk);this.add(huntRun);
	}

	

}

////����ϱ� �̺�Ʈ üũ Ŭ����
class HuntingEventCheck {

/*
 * ����ϱ� �̺�Ʈ üũ ������
 * */
	public HuntingEventCheck(JButton clickButton, Hunting hunting) {
	

		if(clickButton.getText().equals("�����ϱ�")) {
		}
		
	
	}
}
