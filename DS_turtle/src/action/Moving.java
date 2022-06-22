package action;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import gui.Menu;
import manage.GameSystem;
import world.Biome;
import world.map.*;

public class Moving extends Acting {
	
	MovingPanel movingPanel = new MovingPanel();
	
}

//�г�//
class MovingPanel extends JPanel{
	
	public MovingPanel() {
		
		//�޴� �г� ����
		JPanel movingPanel = new JPanel();
		
		//�޴� �г� ��ġ ������ - �÷ο췹�̾ƿ�
		movingPanel.setLayout(new FlowLayout());
		
		JButton grasslandButton = new JButton("�ʿ�");
		grasslandButton.addActionListener(GameSystem.userListener);
		JButton forestButton = new JButton("��");
		forestButton.addActionListener(GameSystem.userListener);
		JButton birchnutButton = new JButton("��ġ��");
		birchnutButton.addActionListener(GameSystem.userListener);
		JButton savannahButton = new JButton("��ٳ�");
		savannahButton.addActionListener(GameSystem.userListener);
		JButton swampButton = new JButton("������");
		swampButton.addActionListener(GameSystem.userListener);
		JButton rockySpaceButton = new JButton("�ϼ�����");
		rockySpaceButton.addActionListener(GameSystem.userListener);
		
		//�޴��гο� �޴� ��ư ��ġ�ϱ�
		movingPanel.add(grasslandButton);
		movingPanel.add(forestButton);
		movingPanel.add(birchnutButton);
		movingPanel.add(savannahButton);
		movingPanel.add(swampButton);
		movingPanel.add(rockySpaceButton);
		
		//�޴� �г� ��ġ�ϱ�
		GameSystem.playPanel.removeAll();
		GameSystem.playPanel.add(movingPanel);
		
		//�߾� �г� �ٽ� �׸���
		GameSystem.playPanel.revalidate();
		GameSystem.playPanel.repaint();
	}
}


//�̺�Ʈüũ//
class MovingEventCheck {
	public MovingEventCheck(JButton clickButton, Moving moving) {
		if(clickButton.getText().equals("�ʿ�") ) {
			Biome grassland;
			Grassland gl = new Grassland();
			grassland = gl;
			
			GameSystem.state.changeBiome(grassland);

			GameSystem.result.changeResultArea("\n" + "�ʿ����� �̵��ߴ�.");

			Menu menu = new Menu();
		}
		else if(clickButton.getText().equals("��") ) {
			Biome forest;
			Forest fr = new Forest();
			forest = fr;
			
			GameSystem.state.changeBiome(forest);

			GameSystem.result.changeResultArea("\n" + "������ �̵��ߴ�.");

			Menu menu = new Menu();
		}
		else if(clickButton.getText().equals("��ġ��") ) {
			Biome birchnut;
			Birchnut bc = new Birchnut();
			birchnut = bc;
			
			GameSystem.state.changeBiome(birchnut);

			GameSystem.result.changeResultArea("\n" + "��ġ������ �̵��ߴ�.");

			Menu menu = new Menu();
		}
		else if(clickButton.getText().equals("��ٳ�") ) {
			Biome savannah;
			Savannah sv = new Savannah();
			savannah = sv;
			
			GameSystem.state.changeBiome(savannah);

			GameSystem.result.changeResultArea("\n" + "��ٳ��� �̵��ߴ�.");

			Menu menu = new Menu();
		}
		else if(clickButton.getText().equals("������") ) {
			Biome swamp;
			Swamp sw = new Swamp();
			swamp = sw;
			
			GameSystem.state.changeBiome(swamp);

			GameSystem.result.changeResultArea("\n" + "������� �̵��ߴ�.");

			Menu menu = new Menu();
		}
		else if(clickButton.getText().equals("�ϼ�����") ) {
			Biome rockySpace;
			RockySpace rs = new RockySpace();
			rockySpace = rs;
			
			GameSystem.state.changeBiome(rockySpace);

			GameSystem.result.changeResultArea("\n" + "�ϼ������ �̵��ߴ�.");
			
			Menu menu = new Menu();
		}
	}
}