package user;

public class System {

	//인벤토리 생성
	public static Inventory inventory = new Inventory();
	
	//플레이어 생성
	public static Player player = new Player();
	
	//메인 메소드
	public static void main(String[] args) {
		
		GameFrame frame = new GameFrame();
		
		
		//아이템 넣기 테스트 - 삭제 해야함
		//inventory.inputItem(new Item());
		
	}
}
