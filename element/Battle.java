package world;
import java.util.Scanner;
import world.Map;
import user.Player;
import world.Monster;
import java.util.Random;

 

public class Battle {
	void start() {
		int input = 0 ; 
		int map=1;//나중에 수정
		Scanner scan = new Scanner(System.in);
        while(true) { 
       	 System.out.println("1.싸운다 / 2.돌아간다"); 
       	 input = scan.nextInt();
       	 
       	 switch(input){ 
    	 case 1 : 
    		// hunt (); 
    		 character c = new character();
    			if (map==1) {
    				Forg m = new Forg();
    				System.out.println(m.Mon_name +"을 만났습니다. 전투를 시작합니다.");
    				//
    				battle : while(true) { 
    					System.out.println("1. 공격 / 2. 도망"); 
    					input = scan.nextInt(); 
    					switch(input){ 

    					case 1: 
    						m.Mon_HP -= c.offensivePower;
    						System.out.println(m.Mon_name + "에게 " + c.offensivePower +"만큼 데미지를 주어 "+m.Mon_HP+"만큼 체력이 남았습니다."); 
    						//몬스터 주금
    						if (m.Mon_HP <=0 ){ 
    							System.out.println(m.Mon_name + "을 처치하였습니다."); 
    							//c.getItem(m.itemDrp());//고기를 어떻게 주지
    							break battle ; //몬스터가 죽으면 전투를 종료하는것 . 
    						}//
    						
    						c.healPoint-=m.Mon_ATK;
    						System.out.println(m.Mon_name + "에게 " + m.Mon_ATK +"만큼 데미지를 받아 "+c.healPoint+"만큼 체력이 남았습니다."); 
    						if (c.healPoint <=0 ){ 
    							System.out.println("체력을 모두 소진했습니다. Game Over"); 
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
    		//메인메뉴;
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
