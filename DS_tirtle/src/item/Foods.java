package item;

public abstract class Foods extends Item {
	//��� ȸ����
	private int starvePoint;
	//ü�� ȸ����
	private int healPoint;

	//��� ȸ���� return
	public abstract int returnStarvePoint();
	//ü�� ȸ���� return
	public abstract int returnHealPoint();
}