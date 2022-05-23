package user;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import world.*;
import world.map.*;


public class State {

	/*
	 * 상태 클래스 필드
	 * */
	
	//현재 위치를 저장하는 필드 - 초원으로 초기화
	private Biome stateBiome = new Grassland();
	
	//현재 위치를 알려주는 상태 패널 생성
	StatePanel statePanel = new StatePanel(stateBiome);
	
	//현재 모드를 저장하는 필드 생성
	private String stateMode = "시작";
	
	
	/*
	 * 상태 클래스 메소드
	 * */
	//현재 모드를 리턴하는 메소드
	public String returnMode() {
		return this.stateMode;
	}
	
	//현재 위치에 해당하는 바이옴을 리턴하는 메소드
	public Biome returnBiome() {
		return this.stateBiome;
	}
	
	//모드를 바꾸는 메소드
	void changeMode(String changeStateMode) {
		//현재 모드 바꾸기
		this.stateMode = changeStateMode;
	}
	
	//위치를 바꾸는 메소드
	void changeBiome(Biome changeStateBiome) {
		//현재 위치 바꾸기
		this.stateBiome = changeStateBiome;
		
		//상태 라벨 갱신
		statePanel.biomeLabel.setText("현재 위치: " + this.stateBiome.returnName());
		
		//상태 패널 갱신
		statePanel.revalidate();
		statePanel.repaint();
	}
	
	
	/*
	 * 상태 클래스 생성자
	 * */
	public State() {
		
		
		
	}
}

////상태 패널 클래스////
class StatePanel extends JPanel {
	
	//상태 라벨 만들기
	JLabel biomeLabel;
	
	StatePanel(Biome firstBiome) {
		//상태 라벨 초기화
		biomeLabel = new JLabel("현재 위치: " + firstBiome.returnName());
		
		//상태 라벨 디자인 설정
		biomeLabel.setFont(new Font("Times", Font.BOLD, 50));
		
		//상태 패널에 요소 배치
		this.add(biomeLabel);
	}
}