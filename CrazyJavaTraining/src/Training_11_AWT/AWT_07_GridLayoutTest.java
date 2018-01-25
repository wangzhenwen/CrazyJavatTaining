package Training_11_AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class AWT_07_GridLayoutTest {
	
	public static void main(String [] args) {
		Frame  frame  = new Frame("计算器");
		frame.setLayout(new BorderLayout());
		//显示区域的panel
		Panel p1 = new Panel();
		p1.add(new TextField(30));
		frame.add(p1, BorderLayout.NORTH);
		//设置Panel 使用GridLayout进行布局
		Panel p2 = new Panel();
		//3行5纵的网格，水平与垂直间距为4
		p2.setLayout(new GridLayout(3, 5, 4, 4));
		String [] name = {"1","2","3","4","5"
				         ,"6","7","8","9","0"
				         ,"+","-","*","/","."};
          int  i=0;
          //向Panel 中添加15个按钮
          while (i<name.length) {
        	  p2.add(new Button(name[i]));
        	  i++;
          }  
          //将数字按钮panel添加到Frame窗口中间
          frame.add(p2,BorderLayout.CENTER);
          //设置窗口为最佳大小
          frame.pack();
          //设置窗口可见性
          frame.setVisible(true);
	}

}
