package world;
import java.util.Scanner;
import world.Map;
import user.Player;
import world.Monster;
import java.util.Random;

 

public class Battle {
	void start() {
		int input = 0 ; 
		int map=1;//���߿� ����
		Scanner scan = new Scanner(System.in);
        while(true) { 
       	 System.out.println("1.�ο�� / 2.���ư���"); 
       	 input = scan.nextInt();
       	 
       	 switch(input){ 
    	 case 1 : 
    		// hunt (); 
    		 character c = new character();
    			if (map==1) {
    				Forg m = new Forg();
    				System.out.println(m.Mon_name +"�� �������ϴ�. ������ �����մϴ�.");
    				//
    				battle : while(true) { 
    					System.out.println("1. ���� / 2. ����"); 
    					input = scan.nextInt(); 
    					switch(input){ 

    					case 1: 
    						m.Mon_HP -= c.offensivePower;
    						System.out.println(m.Mon_name + "���� " + c.offensivePower +"��ŭ �������� �־� "+m.Mon_HP+"��ŭ ü���� ���ҽ��ϴ�."); 
    						//���� �ֱ�
    						if (m.Mon_HP <=0 ){ 
    							System.out.println(m.Mon_name + "�� óġ�Ͽ����ϴ�."); 
    							//c.getItem(m.itemDrp());//��⸦ ��� ����
    							break battle ; //���Ͱ� ������ ������ �����ϴ°� . 
    						}//
    						
    						c.healPoint-=m.Mon_ATK;
    						System.out.println(m.Mon_name + "���� " + m.Mon_ATK +"��ŭ �������� �޾� "+c.healPoint+"��ŭ ü���� ���ҽ��ϴ�."); 
    						if (c.healPoint <=0 ){ 
    							System.out.println("ü���� ��� �����߽��ϴ�. Game Over"); 
    						break; }
    						
    					case 2 : 
    						break battle; 
    						
    					}
    					//
    				}
    			}
    		 break; 
    		 
    	 case 2 : 
    		 //run (); 
    		//���θ޴�;
    		 break ;
    		 }
       	scan.close();
        }
	}

	
class character{
	public int healPoint = 100;
	public int starvePoint = 200;
	
	public int offensivePower = 10;
	public int defensivePower = 5;
	}
}
