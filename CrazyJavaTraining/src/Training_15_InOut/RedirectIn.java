package Training_15_InOut;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 * �ض����׼���룬�Ӷ����Խ�System.in�ض���ָ���ļ��������Ǽ�������
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
				System.out.println("���������������:"+scanner.next());
			}
		} catch (Exception exception)
		{
			exception.printStackTrace();
		}
	}
}
