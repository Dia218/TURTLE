package user;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UserListener implements ActionListener, ItemListener {
	
	public UserListener userListener = new UserListener();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton chooseItem = (JButton)e.getSource();
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getStateChange() == ItemEvent.SELECTED) {
			e.setSelected(false);
		}
		
	}

}
