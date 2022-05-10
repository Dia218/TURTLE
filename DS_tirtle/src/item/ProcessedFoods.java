package item;

public abstract class ProcessedFoods extends Foods {
	private int healPoint;
	
	public abstract int returnHealPoint();
}

class MonsterLasagna extends Foods {
	private static String name = "�������ڳ�";
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
	private static String name = "��Ʈ��Ʃ";
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
	private static String name = "������ġ";
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
	private static String name = "�������";
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
	private static String name = "��Ʈ��";
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
	private static String name = "����Ƣ��";
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
	private static String name = "������";
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