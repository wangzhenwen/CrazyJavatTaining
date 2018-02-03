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
	
	Frame  frame =new Frame("测试");
	//定义一个按钮
	Button ok = new Button("确认");
	CheckboxGroup cbg = new CheckboxGroup();
	//定义一个单选框（处于cbg一组）,初始处于被选中状态
	Checkbox male = new Checkbox("男", cbg,true);
	//定一个单选框(处于cbg一组)，没有被选择状态
	Checkbox femal = new Checkbox("女",cbg,false);
	//定一个复选框，初始处于没有选中状态
	Checkbox married = new Checkbox("是否已婚?", false);
	//定义一个下拉选择框
	Choice colorChooser = new Choice();
	//定义一个列表选择框
	List colorList = new List(6,true);
	//定一个5行20列的多行文本区域
	TextArea ta  = new TextArea(5,20);
	//定义一个50列单行文本框
	TextField name = new TextField(50);
	
	public void init()
	{
		colorChooser.add("红色");
		colorChooser.add("绿色");
		colorChooser.add("蓝色");
		colorList.add("红色");
		colorList.add("绿色");
		colorList.add("蓝色");
		//创建一个装载了文本框 按钮的panel
		Panel bottom=new Panel();
		bottom.add(name);
		bottom.add(ok);
		frame.add(bottom,BorderLayout.SOUTH);
		//创建一个装载下拉选择框，三个CheckBox的Panel
		Panel checkPanel = new Panel();
		checkPanel.add(colorChooser);
		checkPanel.add(male);
		checkPanel.add(femal);
		checkPanel.add(married);
		//创建一个垂直排列组件的Box，盛装多行文本域、Panel
		Box topLeft = Box.createVerticalBox();
		topLeft.add(ta);
		topLeft.add(checkPanel);
		//创建一个垂直排列组件的Box，盛装topLeft  colorList
		Box  top = Box.createHorizontalBox();
		top.add(topLeft);
		top.add(colorList);
		//将top Box 容器添加到窗口的中间
		frame.add(top);
		frame.pack();
		frame.setVisible(true);
	}
  public static void main(String [] args)
  {
	   new AWT_12_CommonComponent().init();
  }
  
}
