package elements;

public abstract class Weapons extends Tools {
	private int attack;
	
	public abstract int returnATK();
}

class Spear extends Weapons {
	private static String name = "Ã¢";
	private int durability = 100;
	private int attack = 30;
	
	public String returnName() {
		return name;
	}
	public int returnDurability() {
		return durability;
	}
	public int returnATK() {
		return attack;
	}
}

class Tentacles extends Weapons {
	private static String name = "ÃË¼ö°¡½Ã";
	private int durability = 100;
	private int attack = 50;
	
	public String returnName() {
		return name;
	}
	public int returnDurability() {
		return durability;
	}
	public int returnATK() {
		return attack;
	}
}