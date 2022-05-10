package elements;

public abstract class UnprocessedFoods extends Foods {
	private int healPoint;
	
	public abstract int returnHealPoint();
}

class MonsterMeat extends UnprocessedFoods {
	private static String name = "�������";
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
	private static String name = "���";
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
	private static String name = "�������ٸ�";
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
	private static String name = "�����";
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
	private static String name = "����";
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
	private static String name = "���";
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
	private static String name = "����";
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
