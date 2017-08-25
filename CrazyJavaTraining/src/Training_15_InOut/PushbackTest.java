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
	  //����һ��PushbackReader����ָ���ƻػ������ĳ���Ϊ64
	  PushbackReader pr = new PushbackReader(fileReader,64);
	  char [] buf = new char [32];
	  //���Ա����ϴζ�ȡ���ַ�������
	  String lastContent = "";
	  int hasRead=0;
	  //ѭ����ȡ�ļ�����
	  while((hasRead=pr.read(buf))>0)
	  {
		  //����ȡ������ת�����ַ���
		  String content = new String(buf,0,hasRead);
		  int targetIndex =0;
		  //���ϴζ�ȡ���ַ����ͱ��ζ�ȡ���ַ���ƴ������
		  //�鿴�Ƿ����Ŀ���ַ������������Ŀ���ַ���
		  if((targetIndex=(lastContent+content).indexOf("new PushbackReader"))>0)
		  { 
			  //�������������ϴ�����һ���ƻػ�����
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
