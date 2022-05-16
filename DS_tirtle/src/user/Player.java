package user;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import item.Item;
import item.armors.GrassSuit;

//��� ��ü �߰� ����

public class Player {

	/*
	 * �÷��̾� Ŭ���� �ʵ�
	 * */
	public static int healPoint = 100;
	public static int starvePoint = 200;
	
	public static int offensivePower = 0;
	public static int defensivePower = 0;
	
	//ĳ���� ��ġ ������ ��Ÿ���� Ǯ���̾� �г� ����
	PlayerPanel playerPanel = new PlayerPanel();
	
	//ĳ���Ͱ� ������ ��� ������ ��Ÿ���� ��� �г� ����
	EquipPanel equipPanel = new EquipPanel();
	
	
	/*
	 * �÷��̾� Ŭ���� �޼ҵ�
	 * */
	//ü�� ���� ��ȭ��Ű�� �޼ҵ�
	void changeHealPoint(int addHealPoint) {
		
		//ü�� �� ��ȭ
		this.healPoint += addHealPoint;
		
		//ü�� �ؽ�Ʈ �ʵ� ����
		playerPanel.healField.setText(Integer.toString(this.healPoint));
		
		//�÷��̾� �г� ����
		playerPanel.revalidate();
		playerPanel.repaint();
		
		//ü���� 0�� ��
		if (this.healPoint <= 0) {
			//���ӿ��� �߻�
			Gameover gameover = new Gameover();
		}	
	}
	
	//��� ���� ��ȭ��Ű�� �޼ҵ�
	void changeStarvePoint(int addStarvePoint) {
		
		//��� �� ��ȭ
		this.starvePoint += addStarvePoint;
		
		//��� �ؽ�Ʈ �ʵ� ����
		playerPanel.starveField.setText(Integer.toString(this.starvePoint));
		
		//�÷��̾� �г� ����
		playerPanel.revalidate();
		playerPanel.repaint();
		
		//��Ⱑ 0�� ��
		if (this.starvePoint <= 0) {
			//���ӿ��� �߻�
			Gameover gameover = new Gameover();
		}
	}
	
	//���ݰ��� ��ȭ��Ű�� �޼ҵ�
	void changeOffensivePower(int OffensivePower) {
			
		//���ݰ� ��ȭ
		this.offensivePower = OffensivePower;
			
		//���ݷ� �ؽ�Ʈ �ʵ� ����
		playerPanel.offensiveField.setText(Integer.toString(this.offensivePower));
		
		//�÷��̾� �г� ����
		playerPanel.revalidate();
		playerPanel.repaint();	
		
		//�� üũ �ڽ� ����
		
		//��� �г� ����
		equipPanel.revalidate();
		equipPanel.repaint();
	}
	
	//���� ��ȭ��Ű�� �޼ҵ�
	void changeDefensivePower(int DefensivePower) {
			
		//�� ��ȭ
		this.defensivePower = DefensivePower;
			
		//���� �ؽ�Ʈ �ʵ� ����
		playerPanel.defensiveField.setText(Integer.toString(this.defensivePower));
		
		//�÷��̾� �г� ����
		playerPanel.revalidate();
		playerPanel.repaint();
		
		//�� üũ �ڽ� ����
		
		//��� �г� ����
		equipPanel.revalidate();
		equipPanel.repaint();
	}
}


////�÷��̾� �г� Ŭ����////
class PlayerPanel extends JPanel {
	
	/*
	 * �÷��̾� �г� �ʵ�
	 * */
	//�ؽ�Ʈ �ʵ� ����
	JTextField healField = new JTextField(Integer.toString(Player.healPoint), 10);
	JTextField starveField = new JTextField(Integer.toString(Player.starvePoint), 10);
	JTextField offensiveField = new JTextField(Integer.toString(Player.offensivePower), 10);
	JTextField defensiveField = new JTextField(Integer.toString(Player.defensivePower), 10);
	
	
	/*
	 * �÷��̾� �г� ������
	 * */
	PlayerPanel() {
		
		//�÷��̾� �г� ��ġ ������
		this.setLayout(new GridLayout(4, 2, 20, 20));
		
		//�ؽ�Ʈ �ʵ� ����� �Է� �Ұ�
		healField.setEditable(false);
		starveField.setEditable(false);
		offensiveField.setEditable(false);
		defensiveField.setEditable(false);
		
		//�÷��̾� �гο� ��� ��ġ
		this.add(new JLabel("ü��"));
		this.add(healField);
		
		this.add(new JLabel("���"));
		this.add(starveField);
		
		this.add(new JLabel("���ݷ�"));
		this.add(offensiveField);
		
		this.add(new JLabel("����"));
		this.add(defensiveField);
	}
}


////���� ��� �г� Ŭ����////
class EquipPanel extends JPanel {
	//��� üũ �ڽ� �����
	ImageIcon noEquip = new ImageIcon("./images/NoEquip.jpg");
	JCheckBox equipWeapon = new JCheckBox(noEquip);
	JCheckBox equipArmor = new JCheckBox(noEquip);
	
	/*
	 * ��� �г� ������
	 * */
	EquipPanel() {
		
		//��� �г� ��ġ ������
		this.setLayout(new GridLayout(2, 2));
		
		//��� �г� ��� ��ġ
		this.add(new JLabel("��"));
		this.add(equipArmor);
		this.add(new JLabel("����"));
		this.add(equipWeapon);
	}	
}


////���� ���� Ŭ����////
class Gameover {
	
	Gameover() {
		//���ӿ��� �г�
		JPanel gameoverPanel = new JPanel();
		
		//���ӿ����� ���� ��
		JLabel gameoverLabel = new JLabel("Game Over");
		gameoverLabel.setBackground(Color.BLACK);
		gameoverLabel.setForeground(Color.RED);
		gameoverLabel.setFont(new Font("Arial", Font.ITALIC, 40));
		gameoverPanel.add(gameoverLabel);
		
		//���ӿ��� �г��� �߾� �г� �ȿ� ��ġ�ϱ�
		GameSystem.playPanel.removeAll();
		GameSystem.playPanel.add(gameoverPanel);
		
		//�߾��г� �ٽ� �׸���
		GameSystem.playPanel.revalidate();
		GameSystem.playPanel.repaint();
	}
}