package user;

import javax.swing.JPanel;

public class System {

	//플레이어 생성
	public static Player player = new Player();
	
	//인벤토리 생성
	public static Inventory inventory = new Inventory();
	
	//중앙에 배치할 메인 패널 생성
	public static JPanel playPanel = new JPanel();
	
	//메뉴 생성
	public static Menu menu = new Menu();
	
	//인벤트 처리 생성
	public static UserListener userListener = new UserListener();

	
	
	//메인 메소드
	public static void main(String[] args) {
		
		GameFrame frame = new GameFrame();
		
		
		//아이템 넣기 테스트 - 삭제 해야함
		//inventory.inputItem(new Item());
		
	}
}
