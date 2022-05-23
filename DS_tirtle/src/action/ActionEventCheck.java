package action;

import javax.swing.JButton;
import user.*;

public class ActionEventCheck{
	

		public void checkbutton(JButton clickButton) {
			
			//버튼을 체크하는 클래스들을 발생시킴
			new MakingEventCheck(clickButton);
			new CookingEventCheck(clickButton);
			new HuntingEventCheck(clickButton);
		}

}	

