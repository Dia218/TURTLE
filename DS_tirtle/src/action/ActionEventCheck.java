package action;

import javax.swing.JButton;
import user.*;

public class ActionEventCheck{
	

		public void checkbutton(JButton clickButton) {
			
			//��ư�� üũ�ϴ� Ŭ�������� �߻���Ŵ
			new MakingEventCheck(clickButton);
			new CookingEventCheck(clickButton);
			new HuntingEventCheck(clickButton);
		}

}	

