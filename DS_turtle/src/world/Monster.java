package world;

public class Monster {
	String Mon_name;
	int Mon_HP;
	int Mon_ATK;
	int Mon_starve;
	String Mon_Drop;
}

class Frog extends Monster{
	public Frog(int i) {
		Mon_name = "Frog";
		Mon_HP = 100;
		Mon_ATK = 10;
		Mon_starve = i;
		Mon_Drop = "개구리 다리";
	}
}

class Bunny extends Monster{
	public Bunny(int i) {
		Mon_name = "Bunny";
		Mon_HP = 20;
		Mon_ATK = 2;
		Mon_starve = i;
		Mon_Drop = "고기";
	}
}

class Pig extends Monster{
	public Pig(int i) {
		Mon_name = "Pig";
		Mon_HP = 200;
		Mon_ATK = 15;
		Mon_starve = i;
		Mon_Drop = "고기";
	}
}

class Buffalo extends Monster{
	public Buffalo(int i) {
		Mon_name = "Beefalo";
		Mon_HP = 500;
		Mon_ATK = 20;
		Mon_starve = i;
		Mon_Drop = "고기";
	}
}

class Spider extends Monster{
	public Spider(int i) {
		Mon_name = "Spider";
		Mon_HP = 100;
		Mon_ATK = 5;
		Mon_starve = i;
		Mon_Drop = "괴물 고기";
	}
}

class Tentacle extends Monster{
	public Tentacle(int i) {
		Mon_name = "Tentacle";
		Mon_HP = 300;
		Mon_ATK = 30;
		Mon_starve = i;
		Mon_Drop = "괴물 고기";
	}
}

class Fishman extends Monster{
	public Fishman(int i) {
		Mon_name = "Fishman";
		Mon_HP = 200;
		Mon_ATK = 20;
		Mon_starve = i;
		Mon_Drop = "괴물 고기";
	}
}