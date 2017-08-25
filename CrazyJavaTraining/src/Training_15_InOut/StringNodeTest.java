package Training_15_InOut;

import java.io.StringReader;
import java.io.StringWriter;
/**
 * 通过StringReader已字符串为数据源，读取字符串，打印到控制台
 * 通过StringWriter写入一些字符串，并打印到控制台
 * @author nuts
 *
 */
public class StringNodeTest
{
   public static void main(String [] args)
   {
	   /*通过StringReader已字符串为数据源，读取字符串，打印到控制台*/
	   String src = "从明天起,做一个幸福的人\n"
	   		+ "喂马,劈柴,周游世界\n"
	   		+ "从明天起,关心粮食和蔬菜\n"
	   		+ "我有一所房子,面朝大海,春暖花开\n"
	   		+ "从明天起,和每一个亲人通信\n"
	   		+ "告诉他们我是多么的幸福\n";
	  char [] chars =  new char[1];
	  int leng=0;
	  StringReader stringReader = new StringReader(src);
	  try
	  {   //采用循环读取的方式读取字符串
		  while((leng=stringReader.read(chars))>0)
		  {
			System.out.print(new String(chars,0,leng));  
			Thread.sleep(50);
		  }
	  }catch (Exception e)
	  {
		  e.printStackTrace();
	  }
	 /*通过StringWriter写入一些字符串，并打印到控制台*/
	  StringWriter sWriter = new StringWriter();
	  sWriter.write("有一个美丽的新世界,\n");
	  sWriter.write("她在远方等我,\n");
	  sWriter.write("那里有天真的孩子\n");
	  sWriter.write("还有天真的酒窝\n");
	  System.out.println(sWriter.toString());
   }
}
