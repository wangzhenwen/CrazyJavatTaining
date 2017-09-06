package Training_7_runtime;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * ɨ��һ���ı��ļ�
 * @author nuts
 *
 */
public class ScannerFileTest
{
   public static void main(String [] args)
   {
	   File myFile = new File("");
	   String myFilePath = myFile.getAbsolutePath()+File.separator+"src"+File.separator+"Training_7_runtime"+File.separator+"ScannerFileTest.java";
	 
	   try
	{
		   //��һ��File������ΪScanner�Ĺ�����������Scanner��ȡ�ļ�����
		Scanner scanner = new Scanner(new File(myFilePath));
		System.out.println("ScannerFileTest.java�ļ���������:");
		//�ж��Ƿ�����һ��
		while(scanner.hasNextLine())
		{
			System.out.println(scanner.nextLine());
		}
		
	} catch (FileNotFoundException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
