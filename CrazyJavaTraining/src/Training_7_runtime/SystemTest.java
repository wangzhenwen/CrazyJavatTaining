package Training_7_runtime;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class SystemTest
{
   public static void main(String [] args)
   {
	   //��ȡϵͳ���еĻ�������
	   Map<String, String> env = System.getenv();
	   for(String name:env.keySet())
	   {
		   System.out.println(name+"--->"+env.get(name));
	   }
	   //��ȡָ������������ֵ
	   System.out.println(System.getenv("JAVA_HOME"));
	   //��ȡ���е�ϵͳϵͳ����
	   Properties properties = System.getProperties();
	    File  myFile= new File("");
	    String myFilePath = myFile.getAbsolutePath()+File.separator+"src"+File.separator+"Training_7_runtime"+File.separator+"MySystemProperties.txt";
	    System.out.println(myFilePath);
	    try
		{  //�����е�ϵͳ���Ա��浽MySystemProperties.txt�ļ���
			properties.store(new FileOutputStream(myFilePath),"System Properties");
			//����ض���ϵͳ����
			System.out.println(System.getProperty("os.name"));
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
}
