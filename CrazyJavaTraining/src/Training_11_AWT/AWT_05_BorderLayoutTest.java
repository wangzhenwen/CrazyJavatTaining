package Training_11_AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class AWT_05_BorderLayoutTest {
  public static void main(String [] args)
  {
	  Frame frame = new Frame("测试窗口");
	  //设置Frame容器使用BorderLayout布局管理器
	  frame.setLayout(new BorderLayout(30, 5));
	  frame.add(new Button("东"), BorderLayout.EAST);
	  frame.add(new Button("南"),BorderLayout.SOUTH);
	  //默认添加中间区域
	  frame.add(new Button("中"));
	  frame.add(new Button("西"),BorderLayout.WEST);
	  frame.add(new Button("北"),BorderLayout.NORTH);
	  //设置窗口为最佳大小
	  frame.pack();
	  //将窗口显示出来（Frame对象默认处于隐藏状态）
	  frame.setVisible(true);
  }
}
