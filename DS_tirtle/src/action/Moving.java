package action;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import user.GameSystem;

public class Moving {
	
	
	
}

class MovingPanel {
	
	public MovingPanel() {
		
		//�޴� �г� ����
		JPanel movingPanel = new JPanel();
		
		//�޴� �г� ��ġ ������ - �÷ο췹�̾ƿ�
		movingPanel.setLayout(new FlowLayout());
		
		//�޴� ��ư �����
		JButton chowonButton = new JButton("�ʿ�");
		chowonButton.addActionListener(GameSystem.userListener);
		JButton supButton = new JButton("��");
		supButton.addActionListener(GameSystem.userListener);
		JButton buchinutButton = new JButton("��ġ��");
		buchinutButton.addActionListener(GameSystem.userListener);
		JButton samakButton = new JButton("�縷");
		samakButton.addActionListener(GameSystem.userListener);
		JButton savanaButton = new JButton("��ٳ�");
		savanaButton.addActionListener(GameSystem.userListener);
		
		//�޴��гο� �޴� ��ư ��ġ�ϱ�
		movingPanel.add(chowonButton);
		movingPanel.add(supButton);
		movingPanel.add(buchinutButton);
		movingPanel.add(samakButton);
		movingPanel.add(savanaButton);
		
		//�޴� �г� ��ġ�ϱ�
		GameSystem.playPanel.removeAll();
		GameSystem.playPanel.add(movingPanel);
		
		//�߾� �г� �ٽ� �׸���
		GameSystem.playPanel.revalidate();
		GameSystem.playPanel.repaint();
	}
}
