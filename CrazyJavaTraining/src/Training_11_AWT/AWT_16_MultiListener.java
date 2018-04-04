package Training_11_AWT;
/**
 * 点击“按钮一” 时 FirstListener  SecondListener  两个事件监听器 actionPerform都被触发
 * 点击 "按钮二"  时 FirstListener 事件监听器 actionPerform被出发
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
	private Frame frame = new Frame("测试窗口");
	private TextArea textArea = new TextArea(6, 40);
	private Button bt1 = new Button("第一个按钮");
	private Button bt2 = new Button("第二个按钮");

	class FirstListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			textArea.append("第一个事件监听器被触发，事件源是:" + e.getActionCommand() + "\n");

		}
	}

	class SecondListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			textArea.append("单击了" + e.getActionCommand() + "\n");
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
