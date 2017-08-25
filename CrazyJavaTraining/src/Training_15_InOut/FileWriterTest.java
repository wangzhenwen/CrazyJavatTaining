package Training_15_InOut;

import java.io.File;
import java.io.FileWriter;
/**
 * 将一段文本写入文件
 * @author nuts
 *
 */
public class FileWriterTest
{
	public static void main(String [] args)
	{
	  File myPath = new File("");
	  String myFIlePath = myPath.getAbsolutePath()+"/src/Training_15_InOut/poem.txt";
	  try
	  {
	  FileWriter fW  = new FileWriter(myFIlePath,false);  //false 表示每执行一次都重新向文件中写一次
	  fW.write("锦瑟 - 李商隐\r\n");
	  fW.write("锦瑟无端五十弦,一弦一柱思华年.\r\n");
	  fW.write("庄生晓梦迷蝴蝶,望帝春心托杜鹃.\r\n");
	  fW.write("沧海月明珠有泪,蓝田日暖玉生烟.\r\n");
	  fW.write("此情可待成追忆,只是当时已惘然.\r\n");
	  fW.flush();
	  fW.close();
	  }catch(Exception e)
	  {
		  System.out.println(e);
	  }
	  
	}

}
