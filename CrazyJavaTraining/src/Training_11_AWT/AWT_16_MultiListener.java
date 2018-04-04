package Training_11_AWT;
/**
 * �������ťһ�� ʱ FirstListener  SecondListener  �����¼������� actionPerform��������
 * ��� "��ť��"  ʱ FirstListener �¼������� actionPerform������
 * @author wangzhenwen
 *
 */

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWT_16_MultiListener {
	private Frame frame = new Frame("���Դ���");
	private TextArea textArea = new TextArea(6, 40);
	private Button bt1 = new Button("��һ����ť");
	private Button bt2 = new Button("�ڶ�����ť");

	class FirstListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			textArea.append("��һ���¼����������������¼�Դ��:" + e.getActionCommand() + "\n");

		}
	}

	class SecondListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			textArea.append("������" + e.getActionCommand() + "\n");
		}
	}

	public void init() {
		bt1.addActionListener(new FirstListener());
		bt1.addActionListener(new SecondListener());
		bt2.addActionListener(new FirstListener());
		Panel panel = new Panel();
		panel.add(bt1);
		panel.add(bt2);
		frame.add(textArea);
		frame.add(panel, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String [] args)
	{
		AWT_16_MultiListener awt_16_MultiListener = new AWT_16_MultiListener();
		awt_16_MultiListener.init();
	}
}
