package Training_11_AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * �¼���������
 * @author wangzhenwen
 *
 */
public class AWT_15_EVentQs {
	private Frame frame =new Frame("�����¼�");
	private Button button = new Button("�����¼�");
	private TextField textField = new TextField(30);
	public void init()
	{
		button.addActionListener(new OkListener());
	    frame.add(textField);
	    frame.add(button,BorderLayout.SOUTH);
	    frame.pack();
	    frame.setVisible(true);
		
	}
	//�����¼���������
	class OkListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("�û������OK��ť");
			textField.setText("Hellor world");
			
		}
		
	}
  public static void main(String [] args)
  {
	  AWT_15_EVentQs awt_15_EVentQs = new AWT_15_EVentQs();
	  awt_15_EVentQs.init();
  }
}
