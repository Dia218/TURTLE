package user;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UserListener implements ActionListener, ItemListener {
		
	@Override
	public void actionPerformed(ActionEvent e) {
		//�̺�Ʈ�� �߻��� ��ư
		JButton chooseItem = (JButton)e.getSource();
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getStateChange() == ItemEvent.SELECTED) {
			//�̺�Ʈ�� �߻��� üũ�ڽ�
			JCheckBox selectedItem = (JCheckBox)e.getItem();
		}
		else {
			return;
		}
		//e.setSelected(false);
	}

}
