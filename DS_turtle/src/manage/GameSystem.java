package manage;

import javax.swing.*;
import gui.*;

public class GameSystem {

	//이벤트 처리 생성
	public static UserListener userListener = new UserListener();
	
	//플레이어 생성
	public static Player player = new Player();
	
	//인벤토리 생성
	public static Inventory inventory = new Inventory();
	
	//중앙에 배치할 플레이패널(중앙패널) 생성
	public static JPanel playPanel = new JPanel();
	
	//상태정보 생성
	public static State state = new State();
	
	//결과정보 생성
	public static Result result = new Result();

	
	//메인 메소드
	public static void main(String[] args) {
		
		GameFrame frame = new GameFrame();
		
	}
}
