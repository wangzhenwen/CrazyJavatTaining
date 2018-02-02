package Training_11_AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import javax.swing.Box;

public class AWT_11_BoxLayOut_2 {
   private Frame frame = new Frame();
   //����ˮƽ�ڷŵ�Box����
   private Box horizontal = Box.createHorizontalBox();
   //���崹ֱ�ڷŵ�Box����
   private Box vertical  = Box.createVerticalBox();
   
   public void init()
   {
	   horizontal.add(new Button("��һ����ť"));
	   horizontal.add(new Button("�ڶ�����ť"));
	   vertical.add(new Button("��������ť"));
	   vertical.add(new Button("���ĸ���ť"));
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
