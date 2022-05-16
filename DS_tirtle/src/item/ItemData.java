package item;

import javax.swing.ImageIcon;
import item.armors.*;
import item.processedFoods.*;
import item.unprocessedFoods.*;
import item.weapons.*;

public class ItemData {			
	
	//아이템 데이터 객체.
	//아이템 데이터를 가져와서 써야할 때, ItemData 객체를 생성 후 각 아이템 데이터에서 정보를 대입하여 쓸 것.
	//ex) ItemData a = new ItemData;
	//	  a.name = Spear.returnName;
	//    a.img = Spear.returnImg(); 
	//	  ...
	
	//이름
	public String name;
	//이미지 아이콘
	public static ImageIcon img;
	//허기 회복량
	public int starvePoint;
	//체력 회복량
	public int healPoint;
	//내구도
	public int durability;
	//방어력
	public int defence;
	//공격력
	public int attack;
	
	//수정중
	public ItemData(String name) {
		switch(name.forName()) {
		case "GrassSuit" : {
			GrassSuit grassSuit = new GrassSuit();
			this.name = grassSuit.returnName();
			this.img = grassSuit.returnImg();
			this.starvePoint = 
			this.healPoint =
			this.durability = grassSuit.returnDurability();
			this.defence = grassSuit.returnDEF();
			this.attack = 
			break;
		}
		case "GrassSuit" : {
			GrassSuit grassSuit = new GrassSuit();
			this.name = grassSuit.returnName();
			this.img = grassSuit.returnImg();
			this.starvePoint = 
			this.healPoint =
			this.durability = grassSuit.returnDurability();
			this.defence = grassSuit.returnDEF();
			this.attack = 
			break;
		}
		case "GrassSuit" : {
			GrassSuit grassSuit = new GrassSuit();
			this.name = grassSuit.returnName();
			this.img = grassSuit.returnImg();
			this.starvePoint = 
			this.healPoint =
			this.durability = grassSuit.returnDurability();
			this.defence = grassSuit.returnDEF();
			this.attack = 
			break;
		}
		case "GrassSuit" : {
			GrassSuit grassSuit = new GrassSuit();
			this.name = grassSuit.returnName();
			this.img = grassSuit.returnImg();
			this.starvePoint = 
			this.healPoint =
			this.durability = grassSuit.returnDurability();
			this.defence = grassSuit.returnDEF();
			this.attack = 
			break;
		}
		case "GrassSuit" : {
			GrassSuit grassSuit = new GrassSuit();
			this.name = grassSuit.returnName();
			this.img = grassSuit.returnImg();
			this.starvePoint = 
			this.healPoint =
			this.durability = grassSuit.returnDurability();
			this.defence = grassSuit.returnDEF();
			this.attack = 
			break;
		}
		case "GrassSuit" : {
			GrassSuit grassSuit = new GrassSuit();
			this.name = grassSuit.returnName();
			this.img = grassSuit.returnImg();
			this.starvePoint = 
			this.healPoint =
			this.durability = grassSuit.returnDurability();
			this.defence = grassSuit.returnDEF();
			this.attack = 
			break;
		}
		case "GrassSuit" : {
			GrassSuit grassSuit = new GrassSuit();
			this.name = grassSuit.returnName();
			this.img = grassSuit.returnImg();
			this.starvePoint = 
			this.healPoint =
			this.durability = grassSuit.returnDurability();
			this.defence = grassSuit.returnDEF();
			this.attack = 
			break;
		}
		case "GrassSuit" : {
			GrassSuit grassSuit = new GrassSuit();
			this.name = grassSuit.returnName();
			this.img = grassSuit.returnImg();
			this.starvePoint = 
			this.healPoint =
			this.durability = grassSuit.returnDurability();
			this.defence = grassSuit.returnDEF();
			this.attack = 
			break;
		}
		case "GrassSuit" : {
			GrassSuit grassSuit = new GrassSuit();
			this.name = grassSuit.returnName();
			this.img = grassSuit.returnImg();
			this.starvePoint = 
			this.healPoint =
			this.durability = grassSuit.returnDurability();
			this.defence = grassSuit.returnDEF();
			this.attack = 
			break;
		}
		case "GrassSuit" : {
			GrassSuit grassSuit = new GrassSuit();
			this.name = grassSuit.returnName();
			this.img = grassSuit.returnImg();
			this.starvePoint = 
			this.healPoint =
			this.durability = grassSuit.returnDurability();
			this.defence = grassSuit.returnDEF();
			this.attack = 
			break;
		}
		case "GrassSuit" : {
			GrassSuit grassSuit = new GrassSuit();
			this.name = grassSuit.returnName();
			this.img = grassSuit.returnImg();
			this.starvePoint = 
			this.healPoint =
			this.durability = grassSuit.returnDurability();
			this.defence = grassSuit.returnDEF();
			this.attack = 
			break;
		}
		case "GrassSuit" : {
			GrassSuit grassSuit = new GrassSuit();
			this.name = grassSuit.returnName();
			this.img = grassSuit.returnImg();
			this.starvePoint = 
			this.healPoint =
			this.durability = grassSuit.returnDurability();
			this.defence = grassSuit.returnDEF();
			this.attack = 
			break;
		}
		case "GrassSuit" : {
			GrassSuit grassSuit = new GrassSuit();
			this.name = grassSuit.returnName();
			this.img = grassSuit.returnImg();
			this.starvePoint = 
			this.healPoint =
			this.durability = grassSuit.returnDurability();
			this.defence = grassSuit.returnDEF();
			this.attack = 
			break;
		}
		case "GrassSuit" : {
			GrassSuit grassSuit = new GrassSuit();
			this.name = grassSuit.returnName();
			this.img = grassSuit.returnImg();
			this.starvePoint = 
			this.healPoint =
			this.durability = grassSuit.returnDurability();
			this.defence = grassSuit.returnDEF();
			this.attack = 
			break;
		}
		case "GrassSuit" : {
			GrassSuit grassSuit = new GrassSuit();
			this.name = grassSuit.returnName();
			this.img = grassSuit.returnImg();
			this.starvePoint = 
			this.healPoint =
			this.durability = grassSuit.returnDurability();
			this.defence = grassSuit.returnDEF();
			this.attack = 
			break;
		}
		case "GrassSuit" : {
			GrassSuit grassSuit = new GrassSuit();
			this.name = grassSuit.returnName();
			this.img = grassSuit.returnImg();
			this.starvePoint = 
			this.healPoint =
			this.durability = grassSuit.returnDurability();
			this.defence = grassSuit.returnDEF();
			this.attack = 
			break;
		}
		case "GrassSuit" : {
			GrassSuit grassSuit = new GrassSuit();
			this.name = grassSuit.returnName();
			this.img = grassSuit.returnImg();
			this.starvePoint = 
			this.healPoint =
			this.durability = grassSuit.returnDurability();
			this.defence = grassSuit.returnDEF();
			this.attack = 
			break;
		}
		case "GrassSuit" : {
			GrassSuit grassSuit = new GrassSuit();
			this.name = grassSuit.returnName();
			this.img = grassSuit.returnImg();
			this.starvePoint = 
			this.healPoint =
			this.durability = grassSuit.returnDurability();
			this.defence = grassSuit.returnDEF();
			this.attack = 
			break;
		}
		case "GrassSuit" : {
			GrassSuit grassSuit = new GrassSuit();
			this.name = grassSuit.returnName();
			this.img = grassSuit.returnImg();
			this.starvePoint = 
			this.healPoint =
			this.durability = grassSuit.returnDurability();
			this.defence = grassSuit.returnDEF();
			this.attack = 
			break;
		}
		
		
		}
	}
	
}
