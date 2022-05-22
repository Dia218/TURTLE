package world.monster;

public class Bunny extends Monster{
		private static String monName = "Bunny";
		int Mon_HP = 20;
		int Mon_ATK = 2;
		String Mon_Drop = "°í±â";
		public String getName() {return monName;}
		public int getHP() {return Mon_HP;}
		public int getATK() {return Mon_ATK;}
}