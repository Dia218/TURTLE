package manage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import action.*;
import action.Cooking;
import gui.CheckEvent;

public class UserListener extends MouseAdapter implements ActionListener, ItemListener {
	
	/*
	 * 유저리스너 클래스의 필드
	 * */
	
	//이벤트가 발생한 버튼의 레퍼런스
	private JButton clickButton;
	//이벤트가 발생한 체크박스의 레퍼런스
	private JCheckBox clickBox;
	
	//이벤트 체크 클래스 생성
	 CheckEvent checkevent = new CheckEvent();
	 ActionEventCheck actioncheckevent = new ActionEventCheck();
	 
	 
	 
	/*
	 * 유저리스너 클래스의 메소드
	 * */
	 
	//버튼 이벤트 설정
	@Override
	public void actionPerformed(ActionEvent e) {
		//동작 확인
		System.out.println("버튼 이벤트 발생");
		
		//이벤트가 발생한 버튼 저장하기
		clickButton = (JButton)e.getSource();
		
		//버튼을 체크하는 메소드 호출하기
		checkevent.checkbutton(clickButton);
		actioncheckevent.checkbutton(clickButton);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		//이벤트가 발생한 버튼 저장하기
		clickButton = (JButton)e.getSource();
		
		//버튼을 체크하는 메소드 호출하기
		checkevent.checkbutton(clickButton);
		actioncheckevent.checkbutton(clickButton);
	}
	
	
	//체크박스 이벤트 설정
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		//이벤트가 발생한 체크박스 저장하기
		clickBox = (JCheckBox)e.getSource();

	}
}
