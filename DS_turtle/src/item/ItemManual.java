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
	
	//ex1) BerryJam 클래스 : (필드)name, img, starvePoint, healPoint (메소드)returnName(), returnImg(), returnStarvePoint(), returnHealPoint()
	
	//ex2) GrassSuit 클래스 : (필드)name, img, durability, defecne (메소드)returnName(), returnImg(), returnDurability(), returnDEF(), returnDurDec(int i)
	
	
	
	//
	//*아이템 클래스의 사용*
	//
	
	//아이템 클래스를 뽑아 쓰는 방식은 Item객체를 선언하고
	
	//각 아이템 클래스 객체를 생성하여
	
	//Item 객체에 업캐스팅하여 생성한다.
	
	//그러면 생성된 Item 객체에
	
	//각 아이템 클래스의 정보가 들어간다.
	
	
	//아이템 클래스를 뽑아 올 때는 먼저 아이템 패키지를 import 해야 한다.
	
	//각 아이템 클래스들은 이중 패키지로 분류되어 있다.
	
	//import 할 때는 item.*;만 작성한다면 item패키지 안의 다른 이중 패키지는 접근할 수 없다.
	
	//ex1) GrassSuit 클래스를 import 받고 싶을 때 : import.item.armor.GrassSuit;
	
	//ex2) BerryJam 클래스를 import 받고 싶을 때 : import.item.processedFoods.BerryJam;
	
	
	//ex)	GrassSuit 클래스의 이름을 뽑아 쓸 때
	
	//import item.Item;
	//import.item.armor.GrassSuit;
	
	//...
	
	//Item item;
	//GrassSuit grassSuit = new GrassSuit();
	//item = grassSuit;
	
	//item객체에 GrassSuit객체가 업캐스팅되어 정보가 입력됨.
   
	//JButton test = new JButton(item.returnImg());
    //test.addActionListener(GameSystem.userListener);
    //test.add(test);
	
	//결과 test 버튼에 풀 갑옷 이미지가 적용됨.
	
	
	
	//
	//*아이템 데이터를 불러오는 명령어들*
	//
	
	//이름 return
	//item.returnName();
	
	//이미지 아이콘 return
	//item.returnImg();
	
	//허기 회복량 return
	//item.returnStarvePoint();
	
	//체력 회복량 return
	//item.returnHealPoint();
	
	//내구도 return
	//item.returnDurability();
	
	//방어력 return
	//item.returnDEF();
	
	//공격력 return
	//item.returnATK();

	//내구도가 i만큼 감소하는 메소드
	//item.returnDurDec(int i);
	
	//나 넘모 힘들어~~~
	//2022.05.16
	//똠치가

}
