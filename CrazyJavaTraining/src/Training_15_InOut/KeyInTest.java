package Training_15_InOut;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 从控制台接收输入，并打印到控制台
 * @author nuts
 *
 */
public class KeyInTest
{
	public static void main(String[] args)
	{
		//将System.in对象转换成Reader对象
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		//将普通的Reader对象包装成BufferedReader
		BufferedReader bReader = new BufferedReader(inputStreamReader);
		String buff = "";
		try
		{   //采用循环方式来逐行地读取
			System.out.print("请通过键盘输入一定内容:");
			while ((buff = bReader.readLine()) != null)
			{
				//如果输入的是exit则退出程序
				if(buff.equals("exit"))
					break;
				//打印读取的内容
                System.out.println("您输入的内容是:"+buff);
                System.out.print("请通过键盘输入一定内容:");
                
			}
			System.out.println("程序结束");
		} catch (Exception exception)
		{
			System.out.println(exception);
		}
	}
}
