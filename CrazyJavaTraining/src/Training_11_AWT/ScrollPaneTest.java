package Training_11_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.ScrollPane;
import java.awt.TextField;

/**
 * 滚动条测试
 * @author wangzhenwen
 *
 */
public class ScrollPaneTest {
  public static void main(String [] args)
  {
	  /**
	   * 创建一个滚动条面板，无论什么情况下总是显示滚动条
	   */
	  ScrollPane scrollPane = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
	  //向scrollpane容器中添加两个组件
	  scrollPane.add(new TextField(20));
	  scrollPane.add(new Button("单击我"));
	  Frame frame  = new Frame();
	  //将scrolPane添加到frame窗体中去
	  frame.add(scrollPane);
	  //设置窗体的位置与大小
	  frame.setBounds(30, 30, 250, 150);
	  frame.setVisible(true);
	  
  }
}
