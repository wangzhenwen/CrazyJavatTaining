package Training_11_AWT;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AWT_09_CardLayoutTest {
	
	private Frame frame = new  Frame("���Դ���");
	String [] names = {"��һ��","�ڶ���","������","������","������"};
	Panel p1=new Panel();
	public void init() {
       final CardLayout cardLayout= new CardLayout();
       p1.setLayout(cardLayout);
       for(int i=0;i<names.length;i++)
       {
    	   p1.add(names[i], new Button(names[i]));
       }
       Panel panel = new Panel();
       //������ʾ��һ��
       Button previous = new Button("��һ��");
       previous.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			cardLayout.previous(p1);
		}
	});
       //������ʾ��һ��
       Button next = new Button("��һ��");
       next.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			cardLayout.next(p1);
		}
	});
       //������ʾ��һ��
       Button first = new Button("��һ��");
       first.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			cardLayout.first(p1);
		}
	});
     //������ʾ���һ��
   	Button last = new Button("���һ��");
	last.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			cardLayout.last(p1);
		}
	});
	//���Ƹ���Card����ʾ��ť
	Button thrid = new Button("������");
	thrid.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			cardLayout.show(p1, "������");
		}
	});
     panel.add(previous);
     panel.add(next);
     panel.add(first);
     panel.add(last);
     panel.add(thrid);
     frame.add(p1);
     frame.add(panel,BorderLayout.SOUTH);
     frame.pack();
     frame.setVisible(true);
	}
	public static void main(String [] args)
	{
		AWT_09_CardLayoutTest awt_09_CardLayoutTest = new AWT_09_CardLayoutTest();
		awt_09_CardLayoutTest.init();
	}
}
