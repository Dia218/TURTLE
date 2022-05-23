package user;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import action.Acting;
import world.Biome;
import world.map.Grassland;


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
	
	//현재 활동 객체를 저장하는 레퍼런스 생성
	Acting stateActing = null;
	
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
	
	//현재 활동 객체의 레퍼런스를 리턴하는 메소드
	public Acting returnActing() {
		return this.stateActing;
	}
	
	//모드를 바꾸는 메소드
	public void changeMode(String changeStateMode) {
		//현재 모드 바꾸기
		this.stateMode = changeStateMode;
	}
	
	//위치를 바꾸는 메소드
	public void changeBiome(Biome changeStateBiome) {
		//현재 위치 바꾸기
		this.stateBiome = changeStateBiome;
		
		//상태 라벨 갱신
		statePanel.biomeLabel.setText("현재 위치: " + this.stateBiome.returnName());
		
		//상태 패널 갱신
		statePanel.revalidate();
		statePanel.repaint();
	}
	
	//활동 레퍼런스의 객체를 바꿔주는 메소드
	public void changeActing(Acting changeStateActing) {
		//활동 객체 바꾸기
		this.stateActing = changeStateActing;
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