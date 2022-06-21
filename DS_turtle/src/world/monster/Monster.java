package world.monster;

import item.*;
import item.unprocessedFoods.*;

public abstract class Monster {
	private static String monName;
	int Mon_HP;
	int Mon_ATK;
	int Mon_starve;
	String Mon_Drop;
	public String getName() {return monName;}
	public int getHP() {return Mon_HP;}
	public int getATK() {return Mon_ATK;}
	
	public abstract Item returnItem();
}