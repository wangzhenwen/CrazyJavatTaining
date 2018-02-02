package Training_11_AWT;

import java.awt.Button;
import java.awt.Frame;

import javax.swing.BoxLayout;

public class AWT_11_BoxLayOut_1 {
	
	private Frame frame = new Frame("测试"); 
	public void init()
	{
		frame.setLayout(new BoxLayout(frame, BoxLayout.Y_AXIS));
		//下面的按钮将垂直排列
		frame.add(new Button("第一个按钮"));
		frame.add(new Button("第二个按钮"));
		frame.pack();
		frame.setVisible(true);
		
	}
	public static void main(String [] args)
	{
		AWT_11_BoxLayOut_1  awt_11_BoxLayOut_1 = new AWT_11_BoxLayOut_1();
		awt_11_BoxLayOut_1.init();
	}

}
