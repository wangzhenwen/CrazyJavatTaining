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
	   //获取系统所有的环境变量
	   Map<String, String> env = System.getenv();
	   for(String name:env.keySet())
	   {
		   System.out.println(name+"--->"+env.get(name));
	   }
	   //获取指定环境变量的值
	   System.out.println(System.getenv("JAVA_HOME"));
	   //获取所有的系统系统属性
	   Properties properties = System.getProperties();
	    File  myFile= new File("");
	    String myFilePath = myFile.getAbsolutePath()+File.separator+"src"+File.separator+"Training_7_runtime"+File.separator+"MySystemProperties.txt";
	    System.out.println(myFilePath);
	    try
		{  //将所有的系统属性保存到MySystemProperties.txt文件中
			properties.store(new FileOutputStream(myFilePath),"System Properties");
			//输出特定的系统属性
			System.out.println(System.getProperty("os.name"));
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
}
