package manage;

import javax.swing.*;
import gui.*;

public class GameSystem {

	//�̺�Ʈ ó�� ����
	public static UserListener userListener = new UserListener();
	
	//�÷��̾� ����
	public static Player player = new Player();
	
	//�κ��丮 ����
	public static Inventory inventory = new Inventory();
	
	//�߾ӿ� ��ġ�� �÷����г�(�߾��г�) ����
	public static JPanel playPanel = new JPanel();
	
	//�������� ����
	public static State state = new State();
	
	//������� ����
	public static Result result = new Result();

	
	//���� �޼ҵ�
	public static void main(String[] args) {
		
		GameFrame frame = new GameFrame();
		
	}
}
