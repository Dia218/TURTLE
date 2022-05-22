package action;

import javax.swing.JButton;
import user.*;

public class ActionEventCheck {
	//각 메뉴패널 버튼 체크 생성자
	public ActionEventCheck(JButton clickButton) {

		//방어구 만들기 버튼인 경우
		if(clickButton.getText().equals("활동 끝내기") ) {
			/*MakingArmors 클래스를 발생시켜서 방어구 만들기*/

			Menu menu = new Menu();

		}
		else if(clickButton.getText().equals("방어구 만들기") ) {
				/*MakingArmors 클래스를 발생시켜서 방어구 만들기*/

			MakingArmors makingArmors = new MakingArmors();

		}
		//무기 만들기 버튼인 경우
		else if(clickButton.getText().equals("무기 만들기") ) {
				/*MakingWeapons 클래스를 발생시켜서 무기 만들기*/
	
			MakingWeapons makingWeapons = new MakingWeapons(); 
		}
		
		else
			;
	}
}
