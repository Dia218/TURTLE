package world.monster;

public class Beefalo extends Monster{
		private static String monName = "beefalo";
		int Mon_HP = 500;
		int Mon_ATK = 20;
		String Mon_Drop = "����";
		public String getName() {return monName;}
		public int getHP() {return Mon_HP;}
		public int getATK() {return Mon_ATK;}
}