package world.monster;

import item.Item;
import item.unprocessedFoods.Meat;

public class Pig extends Monster{
		private static String monName = "Pig";
		int Mon_HP = 200;
		int Mon_ATK = 15;
		String Mon_Drop = "°í±â";
		public String getName() {return monName;}
		public int getHP() {return Mon_HP;}
		public int getATK() {return Mon_ATK;}
		
		@Override
		public Item returnItem() {
			// TODO Auto-generated method stub
			return new Meat();
		}
}