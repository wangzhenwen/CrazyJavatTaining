package Training_11_AWT;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
/**
 * FlowLayout����
 * @author wangzhenwen
 *
 */
public class FlowLayoutTest {
   public static void main(String [] args)
   {
	   Frame frame  = new Frame("���Դ���");
	   //����Frame����ʹ��FlowLayout���ֹ����� �����������У���ֱ���20 ��ˮƽ���5
	   frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));
	   //�����������10����ť
	   for (int i=0;i<10;i++)
	   {
		   frame.add(new Button("��ť"+i));
	   }
	   //���ô���Ϊ��Ѵ�С
	   frame.pack();
	   //���ô��ڿɼ���
	   frame.setVisible(true);
   }
}
