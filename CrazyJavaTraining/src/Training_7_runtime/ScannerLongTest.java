package Training_7_runtime;

import java.util.Scanner;
/**
 * 只接收Long 型的屏幕输入并打印在屏幕上
 * @author nuts
 *
 */
public class ScannerLongTest
{
   public static void main (String [] args)
   {
	   //System.in 代表标准输入，就是键盘输入
	   Scanner scanner  = new Scanner(System.in);
	   //判断是否还有下一个long整数
	   while(scanner.hasNextLong())
	   {
		   //输出输入项
		   System.out.println("键盘输入的内容是:"+scanner.nextLong());
	   }
   }
}
