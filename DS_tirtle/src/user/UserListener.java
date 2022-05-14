package user;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UserListener implements ActionListener, ItemListener {
		
	@Override
	public void actionPerformed(ActionEvent e) {
		//이벤트가 발생한 버튼
		JButton chooseItem = (JButton)e.getSource();
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
