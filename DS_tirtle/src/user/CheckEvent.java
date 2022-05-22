package user;

import javax.swing.*;
import action.*;

public class CheckEvent {

	//이벤트가 발생한 버튼을 확인하는 메소드
	public void checkbutton(JButton clickButton) {
		
		//버튼을 체크하는 클래스들을 발생시킴
		new StartEventCheck(clickButton);
		new MenuEventCheck(clickButton);
		new InventoryEventCheck(clickButton);
		new ActionEventCheck(clickButton);
	}
	
}
