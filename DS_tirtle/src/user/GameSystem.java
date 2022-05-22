package user;
import javax.swing.*;

public class GameSystem {

	//플레이어 생성
	public static Player player = new Player();
	
	//인벤토리 생성
	public static Inventory inventory = new Inventory();
	
	//중앙에 배치할 플레이패널(중앙패널) 생성
	public static JPanel playPanel = new JPanel();
	
	//이벤트 처리 생성
	public static UserListener userListener = new UserListener();
	
	
	//메인 메소드
	public static void main(String[] args) {
		
		GameFrame frame = new GameFrame();
		
	}
}
