package Training_11_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class AWT_08_GridBagLayoutTest {
	private Frame frame = new Frame("���Դ���");
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
			buttons[i] = new Button("��ť" + i);
		}
		//������������ں�������������
		gridBagConstraints.fill=GridBagConstraints.BOTH;
		gridBagConstraints.weightx=1;
		addButton(buttons[0]);
		addButton(buttons[1]);
		addButton(buttons[2]);
		//��GridBagConstraints���Ƶ�GUI��������Ϊ�������һ�����
		gridBagConstraints.gridwidth=GridBagConstraints.REMAINDER;
		addButton(buttons[3]);
		//��GridBagConstrains���Ƶ�GUI������ں����ϲ�������
		gridBagConstraints.weightx=0;
		addButton(buttons[4]);
		//��GridBagCoustraints���Ƶ�������ں����Ͽ���������
		gridBagConstraints.gridwidth=2;
		addButton(buttons[5]);
		//��GridBagConstrains���Ƶ���������һ������
		gridBagConstraints.gridwidth=1;
		//��GridBagConstrains���Ƶ�������ݿ���������
		gridBagConstraints.gridheight=2;
		//��GridBagConstrains���Ƶ��������Ϊ�������һ�����
		gridBagConstraints.gridwidth=GridBagConstraints.REMAINDER;
		addButton(buttons[6]);
		//��GridBagConstrains���Ƶ��������Ϊ�����Խһ������������Խ�������
		gridBagConstraints.gridwidth=1;
		gridBagConstraints.gridheight=2;
		//��GirdBagConstrain���Ƶ�GUI�����������Ȩ����1
		gridBagConstraints.weighty=1;
		//��������İ�ť�������ϲ�������
		gridBagConstraints.weighty=0;
		addButton(buttons[7]);
		//��GridBagConstrains���Ƶ�GUI��������Ϊ�������һ�����
		gridBagConstraints.gridwidth=GridBagConstraints.REMAINDER;
		//��GridBagConstrains���Ƶ�GUI��������Ϊ�������Ϻܿ�һ������
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
