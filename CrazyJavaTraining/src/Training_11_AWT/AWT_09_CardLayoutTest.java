package Training_11_AWT;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AWT_09_CardLayoutTest {
	
	private Frame frame = new  Frame("测试窗口");
	String [] names = {"第一张","第二张","第三张","第四张","第五张"};
	Panel p1=new Panel();
	public void init() {
       final CardLayout cardLayout= new CardLayout();
       p1.setLayout(cardLayout);
       for(int i=0;i<names.length;i++)
       {
    	   p1.add(names[i], new Button(names[i]));
       }
       Panel panel = new Panel();
       //控制显示上一张
       Button previous = new Button("上一张");
       previous.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			cardLayout.previous(p1);
		}
	});
       //控制显示下一张
       Button next = new Button("下一张");
       next.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			cardLayout.next(p1);
		}
	});
       //控制显示第一张
       Button first = new Button("第一张");
       first.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			cardLayout.first(p1);
		}
	});
     //控制显示最后一张
   	Button last = new Button("最后一张");
	last.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			cardLayout.last(p1);
		}
	});
	//控制根据Card名显示按钮
	Button thrid = new Button("第三张");
	thrid.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			cardLayout.show(p1, "第三张");
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
