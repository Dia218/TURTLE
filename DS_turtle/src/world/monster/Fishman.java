package world.monster;

import item.Item;
import item.unprocessedFoods.Fish;

public class Fishman extends Monster{
		private static String monName = "Fishman";
		int Mon_HP = 200;
		int Mon_ATK = 20;
		String Mon_Drop = "±«¹° °í±â";
		public String getName() {return monName;}
		public int getHP() {return Mon_HP;}
		public int getATK() {return Mon_ATK;}
		
		@Override
		public Item returnItem() {
			// TODO Auto-generated method stub
			return new Fish();
		}
}