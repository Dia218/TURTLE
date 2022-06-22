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

//패널//
class MovingPanel extends JPanel{
	
	public MovingPanel() {
		
		//메뉴 패널 생성
		JPanel movingPanel = new JPanel();
		
		//메뉴 패널 배치 관리자 - 플로우레이아웃
		movingPanel.setLayout(new FlowLayout());
		
		JButton grasslandButton = new JButton("초원");
		grasslandButton.addActionListener(GameSystem.userListener);
		JButton forestButton = new JButton("숲");
		forestButton.addActionListener(GameSystem.userListener);
		JButton birchnutButton = new JButton("버치넛지형");
		birchnutButton.addActionListener(GameSystem.userListener);
		JButton savannahButton = new JButton("사바나");
		savannahButton.addActionListener(GameSystem.userListener);
		JButton swampButton = new JButton("늪지대");
		swampButton.addActionListener(GameSystem.userListener);
		JButton rockySpaceButton = new JButton("암석지대");
		rockySpaceButton.addActionListener(GameSystem.userListener);
		
		//메뉴패널에 메뉴 버튼 배치하기
		movingPanel.add(grasslandButton);
		movingPanel.add(forestButton);
		movingPanel.add(birchnutButton);
		movingPanel.add(savannahButton);
		movingPanel.add(swampButton);
		movingPanel.add(rockySpaceButton);
		
		//메뉴 패널 배치하기
		GameSystem.playPanel.removeAll();
		GameSystem.playPanel.add(movingPanel);
		
		//중앙 패널 다시 그리기
		GameSystem.playPanel.revalidate();
		GameSystem.playPanel.repaint();
	}
}


//이벤트체크//
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