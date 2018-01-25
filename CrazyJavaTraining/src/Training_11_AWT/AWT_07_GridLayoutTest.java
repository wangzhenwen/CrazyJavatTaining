package Training_11_AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class AWT_07_GridLayoutTest {
	
	public static void main(String [] args) {
		Frame  frame  = new Frame("������");
		frame.setLayout(new BorderLayout());
		//��ʾ�����panel
		Panel p1 = new Panel();
		p1.add(new TextField(30));
		frame.add(p1, BorderLayout.NORTH);
		//����Panel ʹ��GridLayout���в���
		Panel p2 = new Panel();
		//3��5�ݵ�����ˮƽ�봹ֱ���Ϊ4
		p2.setLayout(new GridLayout(3, 5, 4, 4));
		String [] name = {"1","2","3","4","5"
				         ,"6","7","8","9","0"
				         ,"+","-","*","/","."};
          int  i=0;
          //��Panel �����15����ť
          while (i<name.length) {
        	  p2.add(new Button(name[i]));
        	  i++;
          }  
          //�����ְ�ťpanel��ӵ�Frame�����м�
          frame.add(p2,BorderLayout.CENTER);
          //���ô���Ϊ��Ѵ�С
          frame.pack();
          //���ô��ڿɼ���
          frame.setVisible(true);
	}

}
