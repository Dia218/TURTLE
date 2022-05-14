package user;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UserListener implements ActionListener, ItemListener {
		
	@Override
	public void actionPerformed(ActionEvent e) {
		//이벤트가 발생한 버튼
		JButton clickButton = (JButton)e.getSource();
		
		
		//시작 선택//
		if(clickButton.getText().equals("게임하기") ) {
			Menu menu = new Menu();
		}
		else if(clickButton.getText().equals("종료하기") ) {
			System.exit(0);
		}
		else
			;
		
		
		//메뉴 선택//
		if(clickButton.getText().equals("이동하기") ) {
			/*Moving 클래스의 메소드를 호출하여 지역이동*/
			/*
			 * Moving moving = new Moving();
			 * moving.moveEx();
			 * */
		}
		else if(clickButton.getText().equals("사냥하기") ) {
			/*Hunting 클래스의 메소드를 호출하여 몬스터 사냥*/
			/*
			 * Hunting hunting = new Hunting(); 
			 * hunting.huntEx();
			 * */
		}
		else if(clickButton.getText().equals("채집하기") ) {
			/*Collecting 클래스의 메소드를 호출하여 오브젝트에서 자원 채집*/
			/*
			 * Collecting collecting = new Collecting();
			 * collecting.collectEx();
			 * */
		}
		else if(clickButton.getText().equals("제작하기") ) {
			/*Making 클래스의 메소드를 호출하여 도구 제작*/
			/*
			 * Making making = new Making();
			 * making.makeEx();
			 * */
		}
		else if(clickButton.getText().equals("요리하기") ) {
			/*Cooking 클래스의 메소드를 호출하여 요리하기*/
			/*
			 * Cooking cooking = new Cooking();
			 * cooking.cookEx();
			 * */
		}
		else
			;
		
		//
		
	}
	
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
