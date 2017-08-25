package Training_15_InOut;

import java.io.File;
import java.io.FileReader;

/**
 * 从文本读取数据，并打印到控制台
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
		//创建字符输入流
		FileReader fReader = new FileReader(myFile.getAbsolutePath()+"/src/Training_15_InOut/FileReaderTest.java");
		//创建一个长度为30的"竹筒子"
		char [] buf = new char [30];
		//用于保存实际读取的字符数
		int len=0;
		//使用循环来重复"取水"过程
		while((len=fReader.read(buf))>0)
		{
			//取出"竹筒"中的水滴(字符)，将字符数组转换成字符串输入
			System.out.print(new String(buf,0,len));
		   //	Thread.sleep(2000);
		}
		}catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
