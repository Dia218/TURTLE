package user;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import item.Armors;
import item.Empty;
import item.Tools;
import item.Weapons;

//��� ��ü �߰� ����

public class Player {

	/*
	 * �÷��̾� Ŭ���� �ʵ�
	 * */
	private static int healPoint = 100;
	private static int starvePoint = 200;
	
	private static int offensivePower = 0;
	private static int defensivePower = 0;
	
	private Tools equipWeapon = null;
	private Tools equipArmor = null;
	
	
	//ĳ���� ��ġ ������ ��Ÿ���� Ǯ���̾� �г� ����
	PlayerPanel playerPanel = new PlayerPanel(healPoint, starvePoint, offensivePower, defensivePower);
	
	//ĳ���Ͱ� ������ ��� ������ ��Ÿ���� ��� �г� ����
	EquipPanel equipPanel = new EquipPanel();
	
	
	/*
	 * �÷��̾� Ŭ���� �޼ҵ�
	 * */
	
	/*�ʵ� ���� ��ȯ�ϴ� �޼ҵ��*/
	
	//ü�� ���� �����ϴ� �޼ҵ�
	public int returnHealPoint() {
		return Player.healPoint;
	}
	
	//��� ���� �����ϴ� �޼ҵ�
	public int returnStarvePoint() {
		return Player.starvePoint;
	}
	
	//���ݰ��� �����ϴ� �޼ҵ�
	public int returnOffensivePower() {
		return Player.offensivePower;
	}
	
	//���� �����ϴ� �޼ҵ�
	public int returnDefensivePower() {
		return Player.defensivePower;
	} 
	
	//������ ���� ��ü�� �����ϴ� �޼ҵ�
	public Tools returnEquipWeapon() {
		return this.equipWeapon;
	}
	
	//������ �� ��ü�� �����ϴ� �޼ҵ�
	public Tools returnEquipArmor() {
		return this.equipArmor;
	}
	
	
	/*�ʵ� ���� ��ȭ��Ű�� �޼ҵ��*/
	
	//ü�� ���� ��ȭ��Ű�� �޼ҵ�
	public void changeHealPoint(int addHealPoint) {
		
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
	public void changeStarvePoint(int addStarvePoint) {
		
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
	public void changeOffensivePower(int changeOffensivePower) {
			
		//���ݰ� ��ȭ
		this.offensivePower = changeOffensivePower;
			
		//���ݷ� �ؽ�Ʈ �ʵ� ����
		playerPanel.offensiveField.setText(Integer.toString(this.offensivePower));
		
		//�÷��̾� �г� ����
		playerPanel.revalidate();
		playerPanel.repaint();
	}
	
	//���� ��ȭ��Ű�� �޼ҵ�
	public void changeDefensivePower(int changeDefensivePower) {
			
		//�� ��ȭ
		this.defensivePower = changeDefensivePower;
			
		//���� �ؽ�Ʈ �ʵ� ����
		playerPanel.defensiveField.setText(Integer.toString(this.defensivePower));
		
		//�÷��̾� �г� ����
		playerPanel.revalidate();
		playerPanel.repaint();
	}
	
	//������ ���⸦ �ٲٴ� �޼ҵ�
	public void changeEquipWeapon(Weapons changeEquipWeapon) {
		//���� ���� ��ü
		this.equipWeapon = changeEquipWeapon;
		
		//���ݰ� ��ȭ ȣ��
		this.changeOffensivePower(changeEquipWeapon.returnATK());
		
		//���� üũ�ڽ� ����
		equipPanel.weaponBox.setIcon(this.equipWeapon.returnImg());
		
		//���� ��� �г� ����
		equipPanel.revalidate();
		equipPanel.repaint();
	}

	//������ ���� �ٲٴ� �޼ҵ�
	public void changeEquipArmor(Armors changeEquipArmor) {
		//���� ���� ��ü
		this.equipArmor = changeEquipArmor;

		//�� ��ȭ ȣ��
		this.changeDefensivePower(changeEquipArmor.returnDEF());
		
		//�� üũ�ڽ� ����
		equipPanel.armorBox.setIcon(this.equipArmor.returnImg());
		
		//���� ��� �г� ����
		equipPanel.revalidate();
		equipPanel.repaint();
	}
	
	
	/*
	 * �÷��̾� Ŭ���� ������
	 * */
	public Player() {

		
	}
	
}


////�÷��̾� �г� Ŭ����////
class PlayerPanel extends JPanel {
	
	/*
	 * �÷��̾� �г� �ʵ�
	 * */
	//�ؽ�Ʈ �ʵ� ����
	JTextField healField;
	JTextField starveField;
	JTextField offensiveField;
	JTextField defensiveField;
	
	
	/*
	 * �÷��̾� �г� ������
	 * */
	PlayerPanel(int firstHealPoint, int firstStarvePoint, int firstOffensivePower, int firstDefensivePower) {
		
		//�÷��̾� �г� ��ġ ������
		this.setLayout(new GridLayout(4, 2, 20, 20));
		
		//�ؽ�Ʈ �ʵ� �ʱ�ȭ
		healField = new JTextField(Integer.toString(firstHealPoint), 10);
		starveField = new JTextField(Integer.toString(firstStarvePoint), 10);
		offensiveField = new JTextField(Integer.toString(firstOffensivePower), 10);
		defensiveField = new JTextField(Integer.toString(firstDefensivePower), 10);
		
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
	JCheckBox weaponBox = new JCheckBox(noEquip);
	JCheckBox armorBox = new JCheckBox(noEquip);
	
	/*
	 * ��� �г� ������
	 * */
	EquipPanel() {
		
		//��� �г� ��ġ ������
		this.setLayout(new GridLayout(2, 2));
		
		//��� �г� ��� ��ġ
		this.add(new JLabel("����"));
		this.add(weaponBox);
		this.add(new JLabel("��"));
		this.add(armorBox);
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