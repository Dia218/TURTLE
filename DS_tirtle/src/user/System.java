package user;

import javax.swing.JPanel;

public class System {

	//�÷��̾� ����
	public static Player player = new Player();
	
	//�κ��丮 ����
	public static Inventory inventory = new Inventory();
	
	//�߾ӿ� ��ġ�� ���� �г� ����
	public static JPanel playPanel = new JPanel();
	
	//�޴� ����
	public static Menu menu = new Menu();
	
	//�κ�Ʈ ó�� ����
	public static UserListener userListener = new UserListener();

	
	
	//���� �޼ҵ�
	public static void main(String[] args) {
		
		GameFrame frame = new GameFrame();
		
		
		//������ �ֱ� �׽�Ʈ - ���� �ؾ���
		//inventory.inputItem(new Item());
		
	}
}
