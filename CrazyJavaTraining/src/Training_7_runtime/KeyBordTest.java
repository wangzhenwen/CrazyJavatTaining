package Training_7_runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �Ӽ��̽������벢��ӡ
 * @author nuts
 *
 */
public class KeyBordTest
{
   public static void main(String [] args)
   {
	   //��System.in Ϊ����������һ��BufferReader����
	   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	   String line = null;
	   try
	{
		while((line=bufferedReader.readLine())!=null)
		   {
			   System.out.println("�û������������:"+line);
		   }
	} catch (IOException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
