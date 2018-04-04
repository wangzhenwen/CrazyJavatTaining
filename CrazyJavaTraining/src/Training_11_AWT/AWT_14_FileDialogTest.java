package Training_11_AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 文件选择对话框，文件保存对话框
 * @author wangzhenwen
 *
 */
public class AWT_14_FileDialogTest {
	Frame  frame = new Frame();
	//创建两个文件对话框
	FileDialog  fileDialog1 = new FileDialog(frame, "选择要打开的文件",FileDialog.LOAD);
	FileDialog  fileDialog2 = new FileDialog(frame, "选择要保存的文件路径", FileDialog.SAVE);
	Button b1 = new Button("打开文件");
	Button b2 = new Button("保存文件");
	public void init() {
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fileDialog1.setVisible(true);
				//打印出用户选择的文件路径和文件名
				System.out.println(fileDialog1.getDirectory()+fileDialog1.getFile());
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fileDialog2.setVisible(true);
				//打印出用户选择的文件路径和文件名
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
