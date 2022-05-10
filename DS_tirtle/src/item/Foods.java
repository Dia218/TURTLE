package elements;

public abstract class Foods {
	private String name;
	private int starvePoint;
	private int healPoint;
	
	public abstract String returnName();
	public abstract int returStarvePoint();
	public abstract int returnHealPoint();
}