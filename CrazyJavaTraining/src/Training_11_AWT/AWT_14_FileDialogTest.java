package Training_11_AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * �ļ�ѡ��Ի����ļ�����Ի���
 * @author wangzhenwen
 *
 */
public class AWT_14_FileDialogTest {
	Frame  frame = new Frame();
	//���������ļ��Ի���
	FileDialog  fileDialog1 = new FileDialog(frame, "ѡ��Ҫ�򿪵��ļ�",FileDialog.LOAD);
	FileDialog  fileDialog2 = new FileDialog(frame, "ѡ��Ҫ������ļ�·��", FileDialog.SAVE);
	Button b1 = new Button("���ļ�");
	Button b2 = new Button("�����ļ�");
	public void init() {
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fileDialog1.setVisible(true);
				//��ӡ���û�ѡ����ļ�·�����ļ���
				System.out.println(fileDialog1.getDirectory()+fileDialog1.getFile());
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fileDialog2.setVisible(true);
				//��ӡ���û�ѡ����ļ�·�����ļ���
				System.out.println(fileDialog2.getDirectory()+fileDialog2.getFile());
				
			}
		});
		frame.add(b1);
		frame.add(b2,BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}
 public static void main(String [] args)
 {
	  AWT_14_FileDialogTest awt_14_FileDialogTest  =  new AWT_14_FileDialogTest();
	  awt_14_FileDialogTest.init();
 }
}
