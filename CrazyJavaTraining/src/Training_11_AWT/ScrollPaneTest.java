package Training_11_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.ScrollPane;
import java.awt.TextField;

/**
 * ����������
 * @author wangzhenwen
 *
 */
public class ScrollPaneTest {
  public static void main(String [] args)
  {
	  /**
	   * ����һ����������壬����ʲô�����������ʾ������
	   */
	  ScrollPane scrollPane = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
	  //��scrollpane����������������
	  scrollPane.add(new TextField(20));
	  scrollPane.add(new Button("������"));
	  Frame frame  = new Frame();
	  //��scrolPane��ӵ�frame������ȥ
	  frame.add(scrollPane);
	  //���ô����λ�����С
	  frame.setBounds(30, 30, 250, 150);
	  frame.setVisible(true);
	  
  }
}
