package Training_15_InOut;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * ͨ���ض����׼�������
 * @author nuts
 *
 */
public class RedireOut
{
  public static void main(String [] args)
  {
	  try{
		  File myFile= new File("");
		  String myFilePath = myFile.getAbsolutePath()+File.separator+"src"+File.separator+"Training_15_InOut"+File.separator+"Out.txt";
		  //һ���Դ���PrintStream�����
		  PrintStream pStream = new PrintStream(new FileOutputStream(myFilePath));
		  //����׼�������ض���pStream�����
		  System.setOut(pStream);
		  //���׼��������һ���ַ���
		  System.out.println("��ͨ�ַ���");
		  //���׼������һ������
		  System.out.println(new RedireOut());
	  }
	  catch(IOException ex)
	  {
		  ex.printStackTrace();
	  }
  }
}
