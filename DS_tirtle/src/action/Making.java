package action;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import item.*;
import user.*;

public class Making {

	/*
	 * 제작하고 싶은 아이템 버튼 클릭(자동 아이템 소모) - 제작 결과 출력 - 인벤토리에 수납
	 */
	
	//제작 패널 생성
	JPanel makingPanel = new JPanel();
		
	//제작 종류, 아이템 버튼 객체 배열 생성
	JButton[][] makingButton = new JButton[2][2];
	
	//제작 패널에 아이템을 집어넣기
		void inputItem() {
			
			//제작하기 패널 생성
			makingPanel.add(makingButton[0][0]);
			makingPanel.add(makingButton[0][1]);
			makingPanel.add(makingButton[1][0]);
			makingPanel.add(makingButton[1][1]);
			
			makingButton[0].setIcon(item.Armors.imageIcon);
			makingButton[0].setText(item.Armors.name);
			
			makingButton[1].setIcon(item.Weapons.imageIcon);
			makingButton[1].setText(item.Weapons.name);
			
			makingButton[0][0].setIcon(item.armors.GrassSuit.imageIcon);
			makingButton[0][0].setText(item.armors.GrassSuit.name);
			
			//버튼 이벤트 리스너
			if (makingButton[0][0].addActionListener(ActionEvent)) {
				//인벤토리 공간
				int vectorSize = vector.size();
				
				String result;
				
				//제료가 부족할 떄
				if (consumeItem(Grass, Twigs) == 0) {
					 result = "재료가 부족합니다..";
					 break;
				}
				//제작 할 떄
				else {
					consumeItem(Grass, Twigs);
					inputItem(GrassSuit);
				}
			}
			makingButton[0][1].setIcon(item.armors.LogSuit.imageIcon);
			makingButton[0][1].setText(item.armors.LogSuit.name);
			if (makingButton[0][0].addActionListener(ActionEvent)) {
				int vectorSize = vector.size();
				String result;
				if (consumeItem(Grass, Log) == 0) {
					 result = "재료가 부족합니다.";
					 break;
				}
				else {
					consumeItem(Grass, Log);
					inputItem(LogSuit);
				}
			}
			
			makingButton[1][0].setIcon(item.weapons.Spear.imageIcon);
			makingButton[1][0].setText(item.weapons.Spear.name); {
				int vectorSize = vector.size();
				String result;
				if (consumeItem(Twigs, Stone) == 0) {
					 result = "재료가 부족합니다..";
					 break;
				}
				else {
					consumeItem(Twigs, Stone);
					inputItem(Spear);
				}
			}
			makingButton[1][1].setIcon(item.weapons.TentacleSpike.imageIcon);
			makingButton[1][1].setText(item.weapons.TentacleSpike.name);
			}
		
		
>>>>>>> af339bbd79ee4ee31bfc6d09a42a0afed7854e69
}

}