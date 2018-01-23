package Training_11_AWT;

import java.awt.Frame;
/**
 * 窗体测试
 * @author wangzhenwen
 *
 */
public class AWT_01_FrameTest {
	public static void main (String  [] args)
	{
		Frame f = new  Frame("测试窗口");
		//设置窗口的大小，位置
		f.setBounds(30,30,250,200);
		//将窗口显示出来（Frame对象默认处于隐藏状态）
		f.setVisible(true);
	}

}
