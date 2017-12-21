package Training_11_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
/**
 * Panel测试
 * @author wangzhenwen
 *
 */
public class PanelTest {
    public static void main (String [] args)
    {
    	//创建一个Panel容器
    	Panel panel  = new Panel();
    	//向panel容器添加两个组件
    	panel.add(new TextField(20));
    	panel.add(new Button("单击我"));
    	//创建一个窗口
    	Frame f = new Frame();
    	//将panel添加到panel中去
    	f.add(panel);
    	//设置窗口大小
    	f.setBounds(30, 30, 250, 120);
    	//显示窗口
    	f.setVisible(true);
    }
}
