package Training_15_InOut;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
/**
 * ʹ��PintStream������д���ļ�
 * @author nuts
 *
 */
public class PrintStreamTest
{
	public static void main(String [] args)
	{
		try{
			File myPath = new File("");
			//�ȹ���һ���ڵ�
			FileOutputStream fos = new FileOutputStream(myPath.getAbsolutePath()+"/src/Training_15_InOut/"+"tests.txt",false);
			//���øýڵ㹹��һ��������
			PrintWriter ps = new PrintWriter(fos);
			//ʹ��PrintStreamִ�����
			ps.println("��ͨ�ַ���");
			//ֱ��ʹ��PrintStream�������
			ps.println(new PrintStreamTest());
			ps.flush();
			ps.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
