package element;

public class Map {
	String Map_Name;
	String Map_Mon;
	String Map_Object;
	int Map_Down_hungry;
}

class Grassland extends Map{
	public Grassland() {
		Map_Name = "Grassland";
		Map_Down_hungry = 5;
	}
}

class Forest extends Map{
	public Forest() {
		Map_Name = "Forest";
		Map_Down_hungry = 10;
	}
}

class Birchnut extends Map{
	public Birchnut() {
		Map_Name = "Birchnut";
		Map_Down_hungry = 10;
	}
}

class Savannah extends Map{
	public Savannah() {
		Map_Name = "Savannah";
		Map_Down_hungry = 15;
	}
}

class Swamp extends Map{
	public Swamp() {
		Map_Name = "Swamp";
		Map_Down_hungry = 20;
	}
}

class Rocky extends Map{
	public Rocky() {
		Map_Name = "Rocky";
		Map_Down_hungry = 15;
	}
}