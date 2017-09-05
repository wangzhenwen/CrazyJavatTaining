package Training_15_InOut;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/**
 * 从文本读取数据，并打印到控制台
 * @author nuts
 *
 */
public class FileInputStreamTest
{
	 public static void main(String [] args) throws IOException
    {
		 File file = new File("");
    	//创建字节输入流
    	FileInputStream fiS  = new FileInputStream(file.getAbsolutePath()+"/src/Training_15_InOut/FileInputStreamTest.java");
    	//创建一个长度为1024的“竹筒”
    	byte [] bbuf = new byte[1024];
    	//用于保存实际读取的字节数
    	int hasRead=0;
    	//使用循环重复"取水"过程
    	while((hasRead=fiS.read(bbuf))>0)
    	{
    		//取出“竹筒”中的水滴(字节),将字节数组转换成字符串
    		System.out.println(new String(bbuf,0,bbuf.length));
    	}
    	fiS.close();
    }
}
