package item;

public class Foods extends Item {
	//허기 회복량
	private int starvePoint;
	//체력 회복량
	private int healPoint;

	
	//허기 회복량 return
	public int returnStarvePoint() {
		return starvePoint;
	}
	//체력 회복량 return
	public int returnHealPoint() {
		return healPoint;
	}
}