package Training_11_AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class AWT_05_BorderLayoutTest {
  public static void main(String [] args)
  {
	  Frame frame = new Frame("���Դ���");
	  //����Frame����ʹ��BorderLayout���ֹ�����
	  frame.setLayout(new BorderLayout(30, 5));
	  frame.add(new Button("��"), BorderLayout.EAST);
	  frame.add(new Button("��"),BorderLayout.SOUTH);
	  //Ĭ������м�����
	  frame.add(new Button("��"));
	  frame.add(new Button("��"),BorderLayout.WEST);
	  frame.add(new Button("��"),BorderLayout.NORTH);
	  //���ô���Ϊ��Ѵ�С
	  frame.pack();
	  //��������ʾ������Frame����Ĭ�ϴ�������״̬��
	  frame.setVisible(true);
  }
}
