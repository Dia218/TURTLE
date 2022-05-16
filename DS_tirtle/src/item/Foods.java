package item;

public abstract class Foods extends Item {
	//허기 회복량
	private int starvePoint;
	//체력 회복량
	private int healPoint;

	//허기 회복량 return
	public abstract int returnStarvePoint();
	//체력 회복량 return
	public abstract int returnHealPoint();
}