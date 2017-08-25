package Training_7_runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 从键盘接收输入并打印
 * @author nuts
 *
 */
public class KeyBordTest
{
   public static void main(String [] args)
   {
	   //以System.in 为基础，创建一个BufferReader对象
	   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	   String line = null;
	   try
	{
		while((line=bufferedReader.readLine())!=null)
		   {
			   System.out.println("用户键盘输入的是:"+line);
		   }
	} catch (IOException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
