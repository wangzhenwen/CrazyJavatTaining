package Training_15_InOut;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 通过重定向标准输出流，
 * @author nuts
 *
 */
public class RedireOut
{
  public static void main(String [] args)
  {
	  try{
		  File myFile= new File("");
		  String myFilePath = myFile.getAbsolutePath()+File.separator+"src"+File.separator+"Training_15_InOut"+File.separator+"Out.txt";
		  //一次性创建PrintStream输出流
		  PrintStream pStream = new PrintStream(new FileOutputStream(myFilePath));
		  //将标准输出输出重定向到pStream输出流
		  System.setOut(pStream);
		  //向标准输出中输出一个字符串
		  System.out.println("普通字符串");
		  //向标准输出输出一个对象
		  System.out.println(new RedireOut());
	  }
	  catch(IOException ex)
	  {
		  ex.printStackTrace();
	  }
  }
}
