package Training_15_InOut;

import java.io.File;
import java.io.FileReader;
import java.io.PushbackReader;

public class PushbackTest
{
  public static void main(String [] args)
  {
	  try
	  {
	  File myFile = new File("");
	  String myFilePath = myFile.getAbsolutePath()+File.separator+"src/Training_15_InOut"+File.separator+"PushbackTest.java";
	//  System.out.println(myFilePath);
	  FileReader fileReader = new FileReader(myFilePath);
	  //创建一个PushbackReader对象，指定推回缓冲区的长度为64
	  PushbackReader pr = new PushbackReader(fileReader,64);
	  char [] buf = new char [32];
	  //用以保存上次读取的字符串内容
	  String lastContent = "";
	  int hasRead=0;
	  //循环读取文件内容
	  while((hasRead=pr.read(buf))>0)
	  {
		  //将读取的内容转换成字符串
		  String content = new String(buf,0,hasRead);
		  int targetIndex =0;
		  //将上次读取的字符串和本次读取的字符串拼接起来
		  //查看是否包含目标字符串，如果包含目标字符串
		  if((targetIndex=(lastContent+content).indexOf("new PushbackReader"))>0)
		  { 
			  //将本次内容与上次内容一起推回缓冲区
			  pr.unread((lastContent+content).toCharArray());
			 int len = targetIndex>32 ? 32:targetIndex;
		     pr.read(buf,0,len);
			  System.out.print(new String(buf,0,len));
			  System.exit(0);
		  }else
		  {
			  System.out.print(lastContent);
			
			  lastContent=content;
		  }
	  }
	  }catch(Exception exception)
	  {
		  System.out.println(exception);
	  }
  }

}
