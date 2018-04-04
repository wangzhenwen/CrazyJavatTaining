package Training_11_AWT;
/**
 * �����¼�
 * @author wangzhenwen
 *
 */

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AWT_17_WindowListenerTest {
	private Frame frame = new Frame("����");
	private TextArea textArea = new TextArea(6, 40);

	class MyListener implements WindowListener {

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			textArea.append("���ڳ��α���\n");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			textArea.append("�û��رմ���\n");
			System.exit(0);
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			textArea.append("���ڱ��ɹ��ر�\n");
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			textArea.append("���ڱ���С��\n");
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			textArea.append("���ڱ��ָ�\n");
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			textArea.append("���ڱ�����!\n");
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			textArea.append("����ʧȥ����\n");

		}
	}

	public void init() {
		// Ϊ������Ӵ����¼�������
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
