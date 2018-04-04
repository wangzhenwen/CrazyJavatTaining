package Training_11_AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWT_13_DialogTest {
	Frame  frame = new Frame("测试");
	Dialog d1 = new Dialog(frame,"模式对话框",true); //打开模式对话框后鼠标无法激活原来的“测试窗口”
	Dialog d2 = new Dialog(frame,"非模式对话框",false);//贷款非模式对话框后鼠标可以激活原来的“测试”
	Button b1 = new Button("打开模式对话框");
	Button b2 = new Button("打开非模式对话框");
	public void init()
	{
		d1.setBounds(20, 30, 300, 400);
		d2.setBounds(20, 30, 300, 400);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				d1.setVisible(true);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				d2.setVisible(true);
				
			}
		});
		frame.add(b1);
		frame.add(b2,BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String [] args)
	{
		AWT_13_DialogTest awt_13_DialogTest = new AWT_13_DialogTest();
		awt_13_DialogTest.init();
	}

}
