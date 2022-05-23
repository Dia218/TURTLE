package user;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import world.*;
import world.map.*;


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
	
	//��带 �ٲٴ� �޼ҵ�
	void changeMode(String changeStateMode) {
		//���� ��� �ٲٱ�
		this.stateMode = changeStateMode;
	}
	
	//��ġ�� �ٲٴ� �޼ҵ�
	void changeBiome(Biome changeStateBiome) {
		//���� ��ġ �ٲٱ�
		this.stateBiome = changeStateBiome;
		
		//���� �� ����
		statePanel.biomeLabel.setText("���� ��ġ: " + this.stateBiome.returnName());
		
		//���� �г� ����
		statePanel.revalidate();
		statePanel.repaint();
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