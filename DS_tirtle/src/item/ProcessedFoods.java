package item;

public abstract class ProcessedFoods extends Foods {
	private int healPoint;
	
	public abstract int returnHealPoint();
}

class MonsterLasagna extends Foods {
	private static String name = "±«¹°¶óÀÚ³Ä";
	private static int starvePoint = 60;
	private static int healPoint = -20;
	
	
	public String returnName() {
		return name;
	}
	public int returStarvePoint() {
		return starvePoint;
	}
	public int returnHealPoint() {
		return healPoint;
	}
}

class MeatStew extends Foods {
	private static String name = "¹ÌÆ®½ºÆ©";
	private static int starvePoint = 100;
	private static int healPoint = 10;
	
	
	public String returnName() {
		return name;
	}
	public int returStarvePoint() {
		return starvePoint;
	}
	public int returnHealPoint() {
		return healPoint;
	}
}

class Sandwich extends Foods {
	private static String name = "»÷µåÀ§Ä¡";
	private static int starvePoint = 35;
	private static int healPoint = 30;
	
	
	public String returnName() {
		return name;
	}
	public int returStarvePoint() {
		return starvePoint;
	}
	public int returnHealPoint() {
		return healPoint;
	}
}

class Ratatouille extends Foods {
	private static String name = "¶óµû¶ÑÀÌ";
	private static int starvePoint = 25;
	private static int healPoint = 10;
	
	
	public String returnName() {
		return name;
	}
	public int returStarvePoint() {
		return starvePoint;
	}
	public int returnHealPoint() {
		return healPoint;
	}
}

class MeatBall extends Foods {
	private static String name = "¹ÌÆ®º¼";
	private static int starvePoint = 40;
	private static int healPoint = 0;
	
	
	public String returnName() {
		return name;
	}
	public int returStarvePoint() {
		return starvePoint;
	}
	public int returnHealPoint() {
		return healPoint;
	}
}

class FriedFish extends Foods {
	private static String name = "»ý¼±Æ¢±è";
	private static int starvePoint = 35;
	private static int healPoint = 40;
	
	
	public String returnName() {
		return name;
	}
	public int returStarvePoint() {
		return starvePoint;
	}
	public int returnHealPoint() {
		return healPoint;
	}
}

class BerryJam extends Foods {
	private static String name = "º£¸®Àë";
	private static int starvePoint = 35;
	private static int healPoint = 10;
	
	
	public String returnName() {
		return name;
	}
	public int returStarvePoint() {
		return starvePoint;
	}
	public int returnHealPoint() {
		return healPoint;
	}
}