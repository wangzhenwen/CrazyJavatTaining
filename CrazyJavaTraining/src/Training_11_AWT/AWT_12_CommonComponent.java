package Training_11_AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.Box;

public class AWT_12_CommonComponent {
	
	Frame  frame =new Frame("����");
	//����һ����ť
	Button ok = new Button("ȷ��");
	CheckboxGroup cbg = new CheckboxGroup();
	//����һ����ѡ�򣨴���cbgһ�飩,��ʼ���ڱ�ѡ��״̬
	Checkbox male = new Checkbox("��", cbg,true);
	//��һ����ѡ��(����cbgһ��)��û�б�ѡ��״̬
	Checkbox femal = new Checkbox("Ů",cbg,false);
	//��һ����ѡ�򣬳�ʼ����û��ѡ��״̬
	Checkbox married = new Checkbox("�Ƿ��ѻ�?", false);
	//����һ������ѡ���
	Choice colorChooser = new Choice();
	//����һ���б�ѡ���
	List colorList = new List(6,true);
	//��һ��5��20�еĶ����ı�����
	TextArea ta  = new TextArea(5,20);
	//����һ��50�е����ı���
	TextField name = new TextField(50);
	
	public void init()
	{
		colorChooser.add("��ɫ");
		colorChooser.add("��ɫ");
		colorChooser.add("��ɫ");
		colorList.add("��ɫ");
		colorList.add("��ɫ");
		colorList.add("��ɫ");
		//����һ��װ�����ı��� ��ť��panel
		Panel bottom=new Panel();
		bottom.add(name);
		bottom.add(ok);
		frame.add(bottom,BorderLayout.SOUTH);
		//����һ��װ������ѡ�������CheckBox��Panel
		Panel checkPanel = new Panel();
		checkPanel.add(colorChooser);
		checkPanel.add(male);
		checkPanel.add(femal);
		checkPanel.add(married);
		//����һ����ֱ���������Box��ʢװ�����ı���Panel
		Box topLeft = Box.createVerticalBox();
		topLeft.add(ta);
		topLeft.add(checkPanel);
		//����һ����ֱ���������Box��ʢװtopLeft  colorList
		Box  top = Box.createHorizontalBox();
		top.add(topLeft);
		top.add(colorList);
		//��top Box ������ӵ����ڵ��м�
		frame.add(top);
		frame.pack();
		frame.setVisible(true);
	}
  public static void main(String [] args)
  {
	   new AWT_12_CommonComponent().init();
  }
  
}
