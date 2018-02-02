package Training_11_AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import javax.swing.Box;

public class AWT_11_BoxLayOut_2 {
   private Frame frame = new Frame();
   //定义水平摆放的Box对象
   private Box horizontal = Box.createHorizontalBox();
   //定义垂直摆放的Box对象
   private Box vertical  = Box.createVerticalBox();
   
   public void init()
   {
	   horizontal.add(new Button("第一个按钮"));
	   horizontal.add(new Button("第二个按钮"));
	   vertical.add(new Button("第三个按钮"));
	   vertical.add(new Button("第四个按钮"));
	   frame.add(vertical);
	   frame.add(horizontal,BorderLayout.NORTH);
	   frame.pack();
	   frame.setVisible(true);
   }
   public static void main(String [] args)
   {
	   AWT_11_BoxLayOut_2 awt_11_BoxLayOut_2  = new AWT_11_BoxLayOut_2();
	   awt_11_BoxLayOut_2.init();
   }
   
}
