package Training_11_AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class AWT_06_BorderLayoutTest2 {
	
	public static void main(String [] args)
	{
		Frame frame = new Frame();
		//����Frame����ʹ��BorderLayout���ֹ�����
		frame.setLayout(new BorderLayout(30,5));
		//����һ��Panel����
		Panel panel  = new Panel();
		//��Panel������������
		panel.add(new TextField(20));
		panel.add(new Button("�����"));
		//Ĭ����ӵ��м������У����м��������һ��panel����
		frame.add(panel, BorderLayout.CENTER);
		frame.add(new Button("��"),BorderLayout.NORTH);
		frame.add(new Button("��"),BorderLayout.SOUTH);
		frame.add(new Button("��"),BorderLayout.EAST);
		//����Ϊ��Ѵ���
		frame.pack();
		//��������ʾ������Frame����Ĭ�ϴ�������״̬��
		frame.setVisible(true);
	}

}
