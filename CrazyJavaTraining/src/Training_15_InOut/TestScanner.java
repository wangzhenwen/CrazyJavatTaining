package Training_15_InOut;

import java.util.Scanner;
/**
 * 通过new Scanner(System.in) 创建一个Scanner，控制台会一直等待输入，直到敲回车键结束，
 * 把所输入的内容传给Scanner,作为扫描对象，如果要获取输入的内容，则只需调用Scanner的nextLine()方法即可。
 * @author nuts
 *
 */
public class TestScanner
{
   public static void main(String [] args)
   {
	   Scanner scanner  = new Scanner(System.in);

	   while(true)
	   {	   System.out.print("请输入字符串:");
		   String line =scanner.nextLine();
		   if(line.equals("exit"))
			   break;
		   System.out.println(">>>"+line);
	   }
   }
}
