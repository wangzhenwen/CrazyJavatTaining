package Training_15_InOut;

import java.io.File;
import java.io.FileReader;

/**
 * ���ı���ȡ���ݣ�����ӡ������̨
 * @author nuts
 *
 */
public class FileReaderTest
{
	public static  void main(String [] args)
	{
		File myFile = new File("");
		try
		{
		//�����ַ�������
		FileReader fReader = new FileReader(myFile.getAbsolutePath()+"/src/Training_15_InOut/FileReaderTest.java");
		//����һ������Ϊ30��"��Ͳ��"
		char [] buf = new char [30];
		//���ڱ���ʵ�ʶ�ȡ���ַ���
		int len=0;
		//ʹ��ѭ�����ظ�"ȡˮ"����
		while((len=fReader.read(buf))>0)
		{
			//ȡ��"��Ͳ"�е�ˮ��(�ַ�)�����ַ�����ת�����ַ�������
			System.out.print(new String(buf,0,len));
		   //	Thread.sleep(2000);
		}
		}catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
