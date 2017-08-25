package Training_15_InOut;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 * 重定向标准输入，从而可以将System.in重定向到指定文件，而不是键盘输入
 * 
 * @author nuts
 *
 */
public class RedirectIn
{
	public static void main(String[] args)
	{
		try
		{
			File myFile = new File("");
			String myFilePath = myFile.getAbsolutePath() + File.separator + "src" + File.separator +"Training_15_InOut"+File.separator+ "RedirectIn.java";
			FileInputStream fis = new FileInputStream(myFilePath);
			System.setIn(fis);
			Scanner scanner = new Scanner(System.in);
			scanner.useDelimiter("\n");
			while(scanner.hasNext())
			{
				System.out.println("键盘输入的内容是:"+scanner.next());
			}
		} catch (Exception exception)
		{
			exception.printStackTrace();
		}
	}
}
