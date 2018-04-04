package Training_11_AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 事件监听测试
 * @author wangzhenwen
 *
 */
public class AWT_15_EVentQs {
	private Frame frame =new Frame("测试事件");
	private Button button = new Button("测试事件");
	private TextField textField = new TextField(30);
	public void init()
	{
		button.addActionListener(new OkListener());
	    frame.add(textField);
	    frame.add(button,BorderLayout.SOUTH);
	    frame.pack();
	    frame.setVisible(true);
		
	}
	//定义事件监听器类
	class OkListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("用户点击了OK按钮");
			textField.setText("Hellor world");
			
		}
		
	}
  public static void main(String [] args)
  {
	  AWT_15_EVentQs awt_15_EVentQs = new AWT_15_EVentQs();
	  awt_15_EVentQs.init();
  }
}
