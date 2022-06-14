package gui;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Result {

	/*
	 * ��� Ŭ���� �ʵ�
	 * */
	
	//�ൿ�� ����� �˷��ִ� ��� �г� ����
	ResultPanel resultPanel = new ResultPanel();
	
	
	/*
	 * ��� Ŭ���� �޼ҵ�
	 * */
	
	//��� ����� �ٲٴ� �޼ҵ�
	public void changeResultArea(String resultString) {
		//��� �ؽ�Ʈ ����
		this.resultPanel.resultArea.append(resultString);
		
		//��� �г� ����
		resultPanel.revalidate();
		resultPanel.repaint();
	}
	
}

////��� �г� Ŭ����////
class ResultPanel extends JPanel {
	
	//��� �г� ��� ����
	JTextArea resultArea = new JTextArea("�ƹ� �ϵ� �Ͼ�� �ʾҴ�", 7, 70); 
	JScrollPane scrollPane = new JScrollPane(resultArea);
	
	//��� �г� ������
	ResultPanel() {
		
		//��� �гο� ��� ��ġ
		this.add(scrollPane);
	}
	
}