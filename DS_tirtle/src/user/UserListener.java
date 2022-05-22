package user;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class UserListener implements ActionListener, ItemListener {
	
	/*
	 * 유저리스너 클래스의 필드
	 * */
	
	//이벤트가 발생한 버튼의 레퍼런스
	private JButton clickButton;
	
	//버튼 체크 클래스 생성
	 CheckEvent checkevent = new CheckEvent();
	
	 
	/*
	 * 유저리스너 클래스의 메소드
	 * */
	 
	//버튼 이벤트 설정
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//이벤트가 발생한 버튼 저장하기
		clickButton = (JButton)e.getSource();
		
		//버튼을 체크하는 메소드 호출하기 -> 옵저버 패키지
		checkevent.checkbutton(clickButton);
	}
	
	
	//체크박스 이벤트 설정
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getStateChange() == ItemEvent.SELECTED) {
			//이벤트가 발생한 체크박스
			JCheckBox selectedItem = (JCheckBox)e.getItem();
		}
		else {
			return;
		}
		//e.setSelected(false);
	}
}
