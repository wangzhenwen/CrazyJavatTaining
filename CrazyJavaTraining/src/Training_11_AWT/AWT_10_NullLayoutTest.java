package Training_11_AWT;

import java.awt.Button;
import java.awt.Frame;
/**
 * ����ľ��Զ�λ
 * @author wangzhenwen
 *
 */
public class AWT_10_NullLayoutTest {
	Frame frame = new Frame("���Դ���");
	Button button1 = new Button("��һ����ť");
	Button button2 = new Button("�ڶ�����ť");

	public void init() {
		//����ʹ��null���ֹ�����
		frame.setLayout(null);
		//����ǿ������ÿ����ť��λ�����С
		button1.setBounds(20,50, 90, 28);
		button2.setBounds(50,45,120,25);
		frame.add(button1);
		frame.add(button2);
		frame.setBounds(50,50, 200, 100);
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String [] aregs)
	{
		new AWT_10_NullLayoutTest().init();
	}
}
