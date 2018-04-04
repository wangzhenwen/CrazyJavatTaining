package Training_11_AWT;
/**
 * 窗体事件
 * @author wangzhenwen
 *
 */

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AWT_17_WindowListenerTest {
	private Frame frame = new Frame("测试");
	private TextArea textArea = new TextArea(6, 40);

	class MyListener implements WindowListener {

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			textArea.append("窗口初次被打开\n");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			textArea.append("用户关闭窗口\n");
			System.exit(0);
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			textArea.append("窗口被成功关闭\n");
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			textArea.append("窗口被最小化\n");
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			textArea.append("窗口被恢复\n");
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			textArea.append("窗口被激活!\n");
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			textArea.append("窗口失去焦点\n");

		}
	}

	public void init() {
		// 为窗口添加窗口事件监听器
		frame.addWindowListener(new MyListener());
		frame.add(textArea);
		frame.pack();
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
       AWT_17_WindowListenerTest awt_17_WindowListenerTest = new AWT_17_WindowListenerTest();
       awt_17_WindowListenerTest.init();
	}
}
