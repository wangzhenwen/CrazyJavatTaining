package Training_11_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class AWT_08_GridBagLayoutTest {
	private Frame frame = new Frame("测试窗口");
	private GridBagLayout gridBagLayout = new GridBagLayout();
	private GridBagConstraints gridBagConstraints = new GridBagConstraints();
	private Button[] buttons = new Button[10];

	private void addButton(Button button) {
		gridBagLayout.setConstraints(button, gridBagConstraints);
		frame.add(button);
	}

	public void init() {
		frame.setLayout(gridBagLayout);
		for (int i = 0; i < 10; i++) {
			buttons[i] = new Button("按钮" + i);
		}
		//所有组件可以在横向，纵向上扩大
		gridBagConstraints.fill=GridBagConstraints.BOTH;
		gridBagConstraints.weightx=1;
		addButton(buttons[0]);
		addButton(buttons[1]);
		addButton(buttons[2]);
		//该GridBagConstraints控制的GUI组件将会成为横向最后一个组件
		gridBagConstraints.gridwidth=GridBagConstraints.REMAINDER;
		addButton(buttons[3]);
		//该GridBagConstrains控制的GUI组件将在横向上不会扩大
		gridBagConstraints.weightx=0;
		addButton(buttons[4]);
		//该GridBagCoustraints控制的组件将在横向上跨两个网格
		gridBagConstraints.gridwidth=2;
		addButton(buttons[5]);
		//该GridBagConstrains控制的组件将横跨一个网格
		gridBagConstraints.gridwidth=1;
		//该GridBagConstrains控制的组件将纵跨两个网格
		gridBagConstraints.gridheight=2;
		//该GridBagConstrains控制的组件将成为横向最后一个组件
		gridBagConstraints.gridwidth=GridBagConstraints.REMAINDER;
		addButton(buttons[6]);
		//该GridBagConstrains控制的组件将成为横向跨越一个组件，纵向跨越两个组件
		gridBagConstraints.gridwidth=1;
		gridBagConstraints.gridheight=2;
		//该GirdBagConstrain控制的GUI组件纵向扩大权重是1
		gridBagConstraints.weighty=1;
		//设置下面的按钮在纵向上不会扩大
		gridBagConstraints.weighty=0;
		addButton(buttons[7]);
		//该GridBagConstrains控制的GUI组件将会成为横向最后一个组件
		gridBagConstraints.gridwidth=GridBagConstraints.REMAINDER;
		//该GridBagConstrains控制的GUI组件将会成为在纵向上很跨一个网格
		gridBagConstraints.gridheight=1;
		addButton(buttons[8]);
		addButton(buttons[9]);
		frame.pack();
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		AWT_08_GridBagLayoutTest awt_08_GridBagTest = new AWT_08_GridBagLayoutTest();
		awt_08_GridBagTest.init();
	}
}
