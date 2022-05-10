package world;

public class Monster {
	String Mon_name;
	int Mon_HP;
	int Mon_ATK;
	String Mon_Drop;
}

class Forg extends Monster{
	public Forg() {
		Mon_name = "Frog";
		Mon_HP = 100;
		Mon_ATK = 10;
		Mon_Drop = "개구리 다리";
	}
}

class Bunny extends Monster{
	public Bunny() {
		Mon_name = "Bunny";
		Mon_HP = 20;
		Mon_ATK = 2;
		Mon_Drop = "고기";
	}
}

class Pig extends Monster{
	public Pig() {
		Mon_name = "Pig";
		Mon_HP = 200;
		Mon_ATK = 15;
		Mon_Drop = "고기";
	}
}

class Buffalo extends Monster{
	public Buffalo() {
		Mon_name = "Buffalo";
		Mon_HP = 500;
		Mon_ATK = 20;
		Mon_Drop = "고기";
	}
}

class Spider extends Monster{
	public Spider() {
		Mon_name = "Spider";
		Mon_HP = 100;
		Mon_ATK = 5;
		Mon_Drop = "괴물 고기";
	}
}

class Tentacle extends Monster{
	public Tentacle() {
		Mon_name = "Tentacle";
		Mon_HP = 300;
		Mon_ATK = 30;
		Mon_Drop = "괴물 고기";
	}
}

class Fishman extends Monster{
	public Fishman() {
		Mon_name = "Fishman";
		Mon_HP = 200;
		Mon_ATK = 20;
		Mon_Drop = "괴물 고기";
	}
}