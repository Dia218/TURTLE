package world;

abstract public class Object {
	String Obj_Name;
	
	abstract String Drop_resource();
	
	abstract int Resource_Down_hungry();
	
}

class Wood extends Object{
	String Drop_resource() {
		return "통나무";
	}
	int Resource_Down_hungry() {
		return 10;
	}
}

class Sapling extends Object{
	String Drop_resource() {
		return "잔가지";
	}
	int Resource_Down_hungry() {
		return 5;
	}
}

class Grass extends Object{
	String Drop_resource() {
		return "자른 풀";
	}
	int Resource_Down_hungry() {
		return 5;
	}
}

class Berry_bush extends Object{
	String Drop_resource() {
		return "베리";
	}
	int Resource_Down_hungry() {
		return 5;
	}
}

class Carrot_root extends Object{
	String Drop_resource() {
		return "당근";
	}
	int Resource_Down_hungry() {
		return 5;
	}
}

class Mushrrom extends Object{
	String Drop_resource() {
		return "버섯";
	}int Resource_Down_hungry() {
		return 5;
	}
	
}

class Rock extends Object{
	
	String Drop_resource() {
		return "돌덩이";
	}
	
	int Resource_Down_hungry() {
		return 10;
	}
	
}