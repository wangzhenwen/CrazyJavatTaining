package Training_15_InOut;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 将一个文件中内容，写到另一个文件中去
 * @author nuts
 *
 */
public class FileOutputStreamTest
{
	public static void main(String[] args)
	{
		File myFile = new File("");

		try
		{
			FileInputStream fileInputStream = new FileInputStream(myFile.getAbsolutePath() + "/src/Training_15_InOut/FileOutputStreamTest.java");
			File newFile = new File(myFile.getAbsolutePath() + "/src/Training_15_InOut/test.txt");
			    if(newFile.exists()==false)
			    {
			     
				 newFile.createNewFile();
				 }
			FileOutputStream fileOutputStream = new FileOutputStream(newFile);
			byte[] buf = new byte[32];
			int len = 0;
			while ((len = fileInputStream.read(buf)) > 0)
			{
				fileOutputStream.write(buf, 0, len);
			}
			fileInputStream.close();
			fileOutputStream.close();
		} catch (IOException ioe)
		{
			System.out.print(ioe);
		}
	}

}
