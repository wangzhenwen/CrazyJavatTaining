package Training_11_AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class AWT_06_BorderLayoutTest2 {
	
	public static void main(String [] args)
	{
		Frame frame = new Frame();
		//设置Frame容器使用BorderLayout布局管理器
		frame.setLayout(new BorderLayout(30,5));
		//创建一个Panel对象
		Panel panel  = new Panel();
		//像Panel中添加两个组件
		panel.add(new TextField(20));
		panel.add(new Button("点击我"));
		//默认添加到中间区域中，向中间区域添加一个panel容器
		frame.add(panel, BorderLayout.CENTER);
		frame.add(new Button("北"),BorderLayout.NORTH);
		frame.add(new Button("南"),BorderLayout.SOUTH);
		frame.add(new Button("东"),BorderLayout.EAST);
		//调整为最佳窗口
		frame.pack();
		//将窗口显示出来（Frame对象默认处于隐藏状态）
		frame.setVisible(true);
	}

}
