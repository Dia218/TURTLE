package gui;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Result {

	/*
	 * 결과 클래스 필드
	 * */
	
	//행동의 결과를 알려주는 결과 패널 생성
	ResultPanel resultPanel = new ResultPanel();
	
	
	/*
	 * 결과 클래스 메소드
	 * */
	
	//결과 출력을 바꾸는 메소드
	public void changeResultArea(String resultString) {
		//결과 텍스트 갱신
		this.resultPanel.resultArea.append(resultString);
		
		//결과 패널 갱신
		resultPanel.revalidate();
		resultPanel.repaint();
	}
	
}

////결과 패널 클래스////
class ResultPanel extends JPanel {
	
	//결과 패널 요소 생성
	JTextArea resultArea = new JTextArea("아무 일도 일어나지 않았다", 7, 70); 
	JScrollPane scrollPane = new JScrollPane(resultArea);
	
	//결과 패널 생성자
	ResultPanel() {
		
		//결과 패널에 요소 배치
		this.add(scrollPane);
	}
	
}