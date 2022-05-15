package world;
import user.Player;

abstract public class Object {
	int Obj_Num;
	int Resource_Down_hungry;
	abstract String Drop_resource();
}

class Wood extends Object{
	int Obj_Num = 1;
	String Drop_resource() {
		return "통나무";
	}
	int Resource_Down_hungry = 10;
}

class Sapling extends Object{
	int Obj_Num = 2;
	String Drop_resource() {
		return "잔가지";
	}
	int Resource_Down_hungry() {
		return 5;
	}
}

class Grass extends Object{
	int Obj_Num = 3;
	String Drop_resource() {
		return "자른 풀";
	}
	int Resource_Down_hungry() {
		return 5;
	}
}

class Berry_bush extends Object{
	int Obj_Num = 4;
	String Drop_resource() {
		return "베리";
	}
	int Resource_Down_hungry() {
		return 5;
	}
}

class Carrot_root extends Object{
	int Obj_Num = 5;
	String Drop_resource() {
		return "당근";
	}
	int Resource_Down_hungry() {
		return 5;
	}
}

class Mushrrom extends Object{
	int Obj_Num = 6;
	String Drop_resource() {
		return "버섯";
	}int Resource_Down_hungry() {
		return 5;
	}
	
}

class Rock extends Object{
	int Obj_Num = 7;
	String Drop_resource() {
		return "돌덩이";
	}
	
	int Resource_Down_hungry() {
		return 10;
	}
	
}