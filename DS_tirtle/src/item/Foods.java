package item;

public class Foods extends Item {
	//��� ȸ����
	private int starvePoint;
	//ü�� ȸ����
	private int healPoint;

	
	//��� ȸ���� return
	public int returnStarvePoint() {
		return starvePoint;
	}
	//ü�� ȸ���� return
	public int returnHealPoint() {
		return healPoint;
	}
}