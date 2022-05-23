package user;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import action.Acting;
import world.Biome;
import world.map.Grassland;


public class State {

	/*
	 * ���� Ŭ���� �ʵ�
	 * */
	
	//���� ��ġ�� �����ϴ� �ʵ� - �ʿ����� �ʱ�ȭ
	private Biome stateBiome = new Grassland();
	
	//���� ��ġ�� �˷��ִ� ���� �г� ����
	StatePanel statePanel = new StatePanel(stateBiome);
	
	//���� ��带 �����ϴ� �ʵ� ����
	private String stateMode = "����";
	
	//���� Ȱ�� ��ü�� �����ϴ� ���۷��� ����
	Acting stateActing = null;
	
	/*
	 * ���� Ŭ���� �޼ҵ�
	 * */
	//���� ��带 �����ϴ� �޼ҵ�
	public String returnMode() {
		return this.stateMode;
	}
	
	//���� ��ġ�� �ش��ϴ� ���̿��� �����ϴ� �޼ҵ�
	public Biome returnBiome() {
		return this.stateBiome;
	}
	
	//���� Ȱ�� ��ü�� ���۷����� �����ϴ� �޼ҵ�
	public Acting returnActing() {
		return this.stateActing;
	}
	
	//��带 �ٲٴ� �޼ҵ�
	public void changeMode(String changeStateMode) {
		//���� ��� �ٲٱ�
		this.stateMode = changeStateMode;
	}
	
	//��ġ�� �ٲٴ� �޼ҵ�
	public void changeBiome(Biome changeStateBiome) {
		//���� ��ġ �ٲٱ�
		this.stateBiome = changeStateBiome;
		
		//���� �� ����
		statePanel.biomeLabel.setText("���� ��ġ: " + this.stateBiome.returnName());
		
		//���� �г� ����
		statePanel.revalidate();
		statePanel.repaint();
	}
	
	//Ȱ�� ���۷����� ��ü�� �ٲ��ִ� �޼ҵ�
	public void changeActing(Acting changeStateActing) {
		//Ȱ�� ��ü �ٲٱ�
		this.stateActing = changeStateActing;
	}
	
	
	/*
	 * ���� Ŭ���� ������
	 * */
	public State() {
		
		
		
	}
}

////���� �г� Ŭ����////
class StatePanel extends JPanel {
	
	//���� �� �����
	JLabel biomeLabel;
	
	StatePanel(Biome firstBiome) {
		//���� �� �ʱ�ȭ
		biomeLabel = new JLabel("���� ��ġ: " + firstBiome.returnName());
		
		//���� �� ������ ����
		biomeLabel.setFont(new Font("Times", Font.BOLD, 50));
		
		//���� �гο� ��� ��ġ
		this.add(biomeLabel);
	}
}