package world;
import user.Player;

public class Map {
	int Map_Num;
	String Map_Mon;
	String Map_Object;
	int Map_Down_hungry;
}

class Grassland extends Map{
	public Grassland() {
		Map_Num = 1;
		Map_Down_hungry = 5;
		Map_Mon = "°³±¸¸®";
	}
}

class Forest extends Map{
	public Forest() {
		Map_Num = 2;
		Map_Down_hungry = 10;
	}
}

class Birchnut extends Map{
	public Birchnut() {
		Map_Num = 3;
		Map_Down_hungry = 10;
	}
}

class Savannah extends Map{
	public Savannah() {
		Map_Num = 4;
		Map_Down_hungry = 15;
	}
}

class Swamp extends Map{
	public Swamp() {
		Map_Num = 5;
		Map_Down_hungry = 20;
	}
}

class Rocky extends Map{
	public Rocky() {
		Map_Num = 6;
		Map_Down_hungry = 15;
	}
}