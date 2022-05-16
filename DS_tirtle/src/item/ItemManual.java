package item;

import javax.swing.ImageIcon;
import item.armors.*;
import item.processedFoods.*;
import item.unprocessedFoods.*;
import item.weapons.*;

public class ItemManual {			
	
	//
	//*아이템 객체 상속관계*
	//
	
	//Level 0
	//Item 클래스 = 모든 아이템 하위 클래스들의 수퍼클래스
	
	//Level 1
	//Item 클래스를 상속받는 자식 클래스 = Foods, Tools
	
	//Level 2
	//Foods 클래스를 상속받는 자식 클래스 = ProcessedFoods, UnprocessedFoods
	
	//Tools 클래스를 상속받는 자식 클래스 = Armors, Weapons
	
	//Level 3
	//ProcessedFoods 클래스를 상속받는 자식 클래스 = prcessedFoods 패키지 안의 모든 클래스들
	
	//UnprocessedFoods 클래스를 상속받는 자식 클래스 = unprcessedFoods 패키지 안의 모든 클래스들

	//Armors 클래스를 상속받는 자식 클래스 = armors 패키지 안의 모든 클래스들

	//Weapons 클래스를 상속받는 자식 클래스 = weapons 패키지 안의 모든 클래스들

	//ex) GrassSuit의 상속관계 : Item > Tools > Armors > GrassSuit
	
	
	//
	//*아이템 클래스의 구성*
	//
	
	//아이템 클래스 안에는 private 필드와 public 메소드가 들어있다.
	
	//아이템 마다 들어있는 데이터는 클래스의 상속에 따라 다르다.
	
	//ex1) BerryJam 클래스 : (필드)name, img, starvePoint, healPoint (메소드)returnName, returnImg, returnStarvePoint, returnHealPoint
	
	//ex2) GrassSuit 클래스 : (필드)name, img, durability, defecne (메소드)returnName, returnImg, returnDurability, returnDEF
	
	
	//
	//*아이템 클래스의 사용*
	//
	
	//아이템 클래스를 뽑아 올 때는 아이템 패키지를 import 해야 한다.
	
	//각 아이템 클래스들은 이중 패키지로 분류되어 있다.
	
	//import 할 때는 item.*;만 작성한다면 item패키지 안의 다른 패키지는 접근할 수 없다.
	
	//ex1) GrassSuit 클래스를 import 받고 싶을 때 : import.item.armor.*;
	
	//ex2) BerryJam 클래스를 import 받고 싶을 때 : import.item.processedFoods.*;
	
	//아이템 데이터를 뽑아 쓸 때는
	
	//뽑아쓸 아이템 클래스 객체를 생성하고
	
	//그 객체를 아이템 객체에다 집어넣어야 한다.
	
	//단, 아이템 데이터를 뽑아 쓸 떄는 무조건 필드값이 아닌 메소드값을 대입해야 한다.
	
	//ex)	GrassSuit 클래스의 이름을 뽑아 쓸 때
	//GrassSuit grassSuit = new GrassSuit();
	//Item item = grassSuit.returnName();
	
	//결과값 item.name = "풀 갑옷"
	
	
	//
	//*아이템 필드와 메소드 정보*
	//
	
	//내가 친절히 어떤 아이템 정보가 있는지 적어 둠
	
	//아이템 필드들
	
	//이름
	//private static String name;
	
	//이미지 아이콘
	//static private ImageIcon img;
	
	//허기 회복량
	//private static int starvePoint;
	
	//체력 회복량
	//private static int healPoint;
	
	//내구도
	//private int durability;
		
	//방어력
	//private static int defence;
		
	//공격력
	//private static int attack;
		
	//아이템 메소드들
	
	//이름 return
	//public String returnName();
	
	//이미지 아이콘 return
	//public ImageIcon returnImg();
	
	//허기 회복량 return
	//public int returnStarvePoint();
	
	//체력 회복량 return
	//public int returnHealPoint();
	
	//내구도 return
	//public int returnDurability();
	
	//방어력 return
	//public int returnDEF();
	
	//공격력 return
	//public int returnATK();
	
	//나 넘모 힘들어~~~
	//2022.05.16
	//똠치가

}
