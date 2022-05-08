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
	}
}

class Forest extends Map{
	public Forest() {
		Map_Name = "Forest";
	}
}

class Birchnut extends Map{
	public Birchnut() {
		Map_Name = "Birchnut";
	}
}

class Savannah extends Map{
	public Savannah() {
		Map_Name = "Savannah";
	}
}

class Swamp extends Map{
	public Swamp() {
		Map_Name = "Swamp";
	}
}

class Rocky extends Map{
	public Rocky() {
		Map_Name = "Rocky";
	}
}