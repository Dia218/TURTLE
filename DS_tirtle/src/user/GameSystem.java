package user;
import javax.swing.*;

public class GameSystem {

	//�÷��̾� ����
	public static Player player = new Player();
	
	//�κ��丮 ����
	public static Inventory inventory = new Inventory();
	
	//�߾ӿ� ��ġ�� �÷����г�(�߾��г�) ����
	public static JPanel playPanel = new JPanel();
	
	//�̺�Ʈ ó�� ����
	public static UserListener userListener = new UserListener();
	
	
	//���� �޼ҵ�
	public static void main(String[] args) {
		
		GameFrame frame = new GameFrame();
		
	}
}
