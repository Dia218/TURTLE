package item;

public class Tools extends Item {
	//������
	private int durability;
	
	//������ return
	public int returnDurability() {
		return durability;
	}
	//������ �ջ�
	public void returnDurDec(int i) {
		durability -= i;
	}
}