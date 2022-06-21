package world.monster;

import item.Item;
import item.unprocessedFoods.MonsterMeat;

public class Tentacle extends Monster{
		private static String monName = "Tentacle";
		int Mon_HP = 300;
		int Mon_ATK = 30;
		String Mon_Drop = "±«¹° °í±â";
		public String getName() {return monName;}
		public int getHP() {return Mon_HP;}
		public int getATK() {return Mon_ATK;}
		
		@Override
		public Item returnItem() {
			// TODO Auto-generated method stub
			return new MonsterMeat();
		}
}