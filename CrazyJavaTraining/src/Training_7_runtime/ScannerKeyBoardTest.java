package Training_7_runtime;

import java.util.Scanner;

/**
 * 接收客户键盘输入，并打印到控制台
 * @author nuts
 *
 */
public class ScannerKeyBoardTest
{
	public static void main(String [] args)
	{
		//System.in代表标准输入,就是键盘输入
		Scanner scanner = new Scanner(System.in);
		//增加下面一行将只把回车作为分隔符
		scanner.useDelimiter("\n");
		//判断是否还有下一个输入项
		while(scanner.hasNext())
		{
			System.out.println("键盘输入的内容是:"+scanner.next());
		}

	}

}
