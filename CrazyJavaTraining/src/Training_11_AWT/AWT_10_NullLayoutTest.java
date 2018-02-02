package Training_11_AWT;

import java.awt.Button;
import java.awt.Frame;
/**
 * 组件的绝对定位
 * @author wangzhenwen
 *
 */
public class AWT_10_NullLayoutTest {
	Frame frame = new Frame("测试窗口");
	Button button1 = new Button("第一个按钮");
	Button button2 = new Button("第二个按钮");

	public void init() {
		//设置使用null布局管理器
		frame.setLayout(null);
		//下面强制设置每个按钮的位置与大小
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
