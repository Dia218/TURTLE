package elements;

public abstract class UnprocessedFoods extends Foods {
	private int healPoint;
	
	public abstract int returnHealPoint();
}

class MonsterMeat extends UnprocessedFoods {
	private static String name = "괴물고기";
	private static int starvePoint = 20;
	private static int healPoint = -30;
	
	
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

class Meat extends UnprocessedFoods {
	private static String name = "고기";
	private static int starvePoint = 25;
	private static int healPoint = -10;
	
	
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

class FrogLeg extends UnprocessedFoods {
	private static String name = "개구리다리";
	private static int starvePoint = 10;
	private static int healPoint = -10;
	
	
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

class Fish extends UnprocessedFoods {
	private static String name = "물고기";
	private static int starvePoint = 10;
	private static int healPoint = -5;
	
	
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

class Berry extends UnprocessedFoods {
	private static String name = "베리";
	private static int starvePoint = 10;
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

class Carrot extends UnprocessedFoods {
	private static String name = "당근";
	private static int starvePoint = 10;
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

class Mushroom extends UnprocessedFoods {
	private static String name = "버섯";
	private static int starvePoint = 10;
	private static int healPoint = -50;
	
	
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
