package item;

public abstract class ProcessedFoods extends Foods {
	//체력 회복량
	private int healPoint;
	
	//체력 회복량 return
	public abstract int returnHealPoint();
}