package world.monster;

public class Frog extends Monster{
		private static String monName = "Frog";
		int Mon_HP = 100;
		int Mon_ATK = 10;
		String Mon_Drop = "개구리 다리";
		public String getName() {return monName;}
		public int getHP() {return Mon_HP;}
		public int getATK() {return Mon_ATK;}
}