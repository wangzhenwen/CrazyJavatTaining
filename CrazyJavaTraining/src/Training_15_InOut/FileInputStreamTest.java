package Training_15_InOut;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/**
 * ���ı���ȡ���ݣ�����ӡ������̨
 * @author nuts
 *
 */
public class FileInputStreamTest
{
	 public static void main(String [] args) throws IOException
    {
		 File file = new File("");
    	//�����ֽ�������
    	FileInputStream fiS  = new FileInputStream(file.getAbsolutePath()+"/src/Training_15_InOut/FileInputStreamTest.java");
    	//����һ������Ϊ1024�ġ���Ͳ��
    	byte [] bbuf = new byte[1024];
    	//���ڱ���ʵ�ʶ�ȡ���ֽ���
    	int hasRead=0;
    	//ʹ��ѭ���ظ�"ȡˮ"����
    	while((hasRead=fiS.read(bbuf))>0)
    	{
    		//ȡ������Ͳ���е�ˮ��(�ֽ�),���ֽ�����ת�����ַ���
    		System.out.println(new String(bbuf,0,bbuf.length));
    	}
    	fiS.close();
    }
}
