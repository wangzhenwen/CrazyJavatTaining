package Training_11_AWT;

import java.awt.Button;
import java.awt.Frame;

import javax.swing.BoxLayout;

public class AWT_11_BoxLayOut_1 {
	
	private Frame frame = new Frame("����"); 
	public void init()
	{
		frame.setLayout(new BoxLayout(frame, BoxLayout.Y_AXIS));
		//����İ�ť����ֱ����
		frame.add(new Button("��һ����ť"));
		frame.add(new Button("�ڶ�����ť"));
		frame.pack();
		frame.setVisible(true);
		
	}
	public static void main(String [] args)
	{
		AWT_11_BoxLayOut_1  awt_11_BoxLayOut_1 = new AWT_11_BoxLayOut_1();
		awt_11_BoxLayOut_1.init();
	}

}
