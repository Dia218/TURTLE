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
		
		//�޴� ��ư �����
		JButton grasslandButton = new JButton("Grassland");
		grasslandButton.addActionListener(GameSystem.userListener);
		JButton forestButton = new JButton("Forest");
		forestButton.addActionListener(GameSystem.userListener);
		JButton birchnutButton = new JButton("Birchnut");
		birchnutButton.addActionListener(GameSystem.userListener);
		JButton savannahButton = new JButton("Savannah");
		savannahButton.addActionListener(GameSystem.userListener);
		JButton swampButton = new JButton("Swamp");
		swampButton.addActionListener(GameSystem.userListener);
		JButton rockySpaceButton = new JButton("RockySpace");
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
		if(clickButton.getText().equals("Grassland") ) {
			Biome grassland;
			Grassland gl = new Grassland();
			grassland = gl;
			
			GameSystem.state.changeBiome(grassland);

			Menu menu = new Menu();
		}
		else if(clickButton.getText().equals("Forest") ) {
			Biome forest;
			Forest fr = new Forest();
			forest = fr;
			
			GameSystem.state.changeBiome(forest);

			Menu menu = new Menu();
		}
		else if(clickButton.getText().equals("Birchnut") ) {
			Biome birchnut;
			Birchnut bc = new Birchnut();
			birchnut = bc;
			
			GameSystem.state.changeBiome(birchnut);

			Menu menu = new Menu();
		}
		else if(clickButton.getText().equals("Savannah") ) {
			Biome savannah;
			Savannah sv = new Savannah();
			savannah = sv;
			
			GameSystem.state.changeBiome(savannah);

			Menu menu = new Menu();
		}
		else if(clickButton.getText().equals("Swamp") ) {
			Biome swamp;
			Swamp sw = new Swamp();
			swamp = sw;
			
			GameSystem.state.changeBiome(swamp);

			Menu menu = new Menu();
		}
		else if(clickButton.getText().equals("RockySpace") ) {
			Biome rockySpace;
			RockySpace rs = new RockySpace();
			rockySpace = rs;
			
			GameSystem.state.changeBiome(rockySpace);

			Menu menu = new Menu();
		}
	}
}