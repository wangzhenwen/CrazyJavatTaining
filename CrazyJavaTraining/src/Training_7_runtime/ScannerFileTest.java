package Training_7_runtime;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * 扫描一个文本文件
 * @author nuts
 *
 */
public class ScannerFileTest
{
   public static void main(String [] args)
   {
	   File myFile = new File("");
	   String myFilePath = myFile.getAbsolutePath()+File.separator+"src"+File.separator+"Training_7_runtime"+File.separator+"ScannerFileTest.java";
	 
	   try
	{
		   //将一个File对象作为Scanner的构造器参数，Scanner读取文件内容
		Scanner scanner = new Scanner(new File(myFilePath));
		System.out.println("ScannerFileTest.java文件内容如下:");
		//判断是否还有下一行
		while(scanner.hasNextLine())
		{
			System.out.println(scanner.nextLine());
		}
		
	} catch (FileNotFoundException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
