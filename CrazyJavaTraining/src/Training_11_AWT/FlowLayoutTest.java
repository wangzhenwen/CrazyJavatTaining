package Training_11_AWT;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
/**
 * FlowLayout测试
 * @author wangzhenwen
 *
 */
public class FlowLayoutTest {
   public static void main(String [] args)
   {
	   Frame frame  = new Frame("测试窗口");
	   //设置Frame容器使用FlowLayout布局管理器 从左至右排列，垂直间距20 ，水平间距5
	   frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));
	   //向容器中添加10个按钮
	   for (int i=0;i<10;i++)
	   {
		   frame.add(new Button("按钮"+i));
	   }
	   //设置窗口为最佳大小
	   frame.pack();
	   //设置窗口可见性
	   frame.setVisible(true);
   }
}
