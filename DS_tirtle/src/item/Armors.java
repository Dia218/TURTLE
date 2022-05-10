package elements;

public abstract class Armors extends Tools {
	private int defence;
	
	public abstract int returnDEF();
}

class GrassArmor extends Armors {
	private static String name = "Ç®°©¿Ê";
	private int durability = 100;
	private int defence = 60;
	
	public String returnName() {
		return name;
	}
	public int returnDurability() {
		return durability;
	}
	public int returnDEF() {
		return defence;
	}
}

class WoodArmor extends Armors {
	private static String name = "³ª¹«°©¿Ê";
	private int durability = 100;
	private int defence = 80;
	
	public String returnName() {
		return name;
	}
	public int returnDurability() {
		return durability;
	}
	public int returnDEF() {
		return defence;
	}
}