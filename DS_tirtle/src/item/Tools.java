package item;

public class Tools extends Item {
	//내구도
	private int durability;
	
	//내구도 return
	public int returnDurability() {
		return durability;
	}
	//내구도 손상
	public void returnDurDec(int i) {
		durability -= i;
	}
}