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
		
	//각 메뉴패널 버튼 체크 생성자
	//public ActionEventCheck(JButton clickButton) {

		//방어구 만들기 버튼인 경우
		//if(clickButton.getText().equals("활동 끝내기") ) {
			/*MakingArmors 클래스를 발생시켜서 방어구 만들기*/

			//Menu menu = new Menu();
			//System.out.println("활동 끝내기");
		//}
		//else if(clickButton.getText().equals("방어구 만들기") ) {
				/*MakingArmors 클래스를 발생시켜서 방어구 만들기*/

			//MakingArmors makingArmors = new MakingArmors();

		//}
		//무기 만들기 버튼인 경우
		//else if(clickButton.getText().equals("무기 만들기") ) {
				/*MakingWeapons 클래스를 발생시켜서 무기 만들기*/
	
			//MakingWeapons makingWeapons = new MakingWeapons(); 
		//}
		
		//else
			//;
	//}
	
	
	
	
}
