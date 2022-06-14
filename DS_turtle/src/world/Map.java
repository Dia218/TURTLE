package world;

public class Map {
	public static int Map_Num=1;
	static int Map_Down_hungry;
	
	
	
	public int checkMap() { //현재 맵 확인
		return Map_Num;
	}
	public void moveMap(int i) { //맵 넘버 입력값대로 이동
		Map.Map_Num=i;
	}
	public int mapStarve() {//mapStarve() 맵 번호에 따라 공복값 리턴
		if(Map.Map_Num==1) {return 5;}
		else if(Map.Map_Num==2) {return 10;}
		else if(Map.Map_Num==3) {return 10;}
		else if(Map.Map_Num==4) {return 15;}
		else if(Map.Map_Num==5) {return 20;}
		else if(Map.Map_Num==6) {return 15;}
		else return 0;
	}
}

class Grassland extends Map{
	public Grassland() {
		Map_Num = 1;
		Map_Down_hungry = 5;
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

class RockySpace extends Map{
	public RockySpace() {
		Map_Num = 6;
		Map_Down_hungry = 15;
	}
}