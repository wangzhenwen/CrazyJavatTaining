package Training_11_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
/**
 * Panel����
 * @author wangzhenwen
 *
 */
public class PanelTest {
    public static void main (String [] args)
    {
    	//����һ��Panel����
    	Panel panel  = new Panel();
    	//��panel��������������
    	panel.add(new TextField(20));
    	panel.add(new Button("������"));
    	//����һ������
    	Frame f = new Frame();
    	//��panel��ӵ�panel��ȥ
    	f.add(panel);
    	//���ô��ڴ�С
    	f.setBounds(30, 30, 250, 120);
    	//��ʾ����
    	f.setVisible(true);
    }
}
