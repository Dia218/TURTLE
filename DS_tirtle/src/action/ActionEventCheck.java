package action;

import javax.swing.JButton;
import user.*;

public class ActionEventCheck{
	
	//이벤트가 발생한 버튼을 확인하는 메소드
		public void checkbutton(JButton clickButton) {
			
			new MakingEventCheck(clickButton);
			new CookingEventCheck(clickButton);
			//버튼을 체크하는 클래스들을 발생시킴
		}
}
