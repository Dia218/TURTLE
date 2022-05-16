package item;

public abstract class UnprocessedFoods extends Foods {
	//체력 회복량
	private int healPoint;
	
	//체력 회복량 return
	public abstract int returnHealPoint();
}