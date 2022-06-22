package action;

import javax.swing.JButton;
import manage.GameSystem;

public class ActionEventCheck{
	

		public void checkbutton(JButton clickButton) {
			//작동확인
			System.out.println("엑션 이벤트 발생");
			
			if(GameSystem.state.returnActing() instanceof Hunting) {
				new HuntingEventCheck(clickButton, (Hunting)GameSystem.state.returnActing());
			}
			else if (GameSystem.state.returnActing() instanceof Collecting) {
				;//new CollectingEventCheck(clickButton, (Collecting) GameSystem.state.returnActing());
			}
			else if (GameSystem.state.returnActing() instanceof Moving) {
				;//new MovingEventCheck(clickButton, (Moving) GameSystem.state.returnActing());
			}
			else if (GameSystem.state.returnActing() instanceof Making) {
				new MakingEventCheck(clickButton);
			}
			else if (GameSystem.state.returnActing() instanceof Cooking) {
				new CookingEventCheck(clickButton);
			}
			else
				;
			
		}

}	

