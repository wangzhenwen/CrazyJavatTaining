package Training_15_InOut;

import java.io.File;
import java.io.FileWriter;
/**
 * ��һ���ı�д���ļ�
 * @author nuts
 *
 */
public class FileWriterTest
{
	public static void main(String [] args)
	{
	  File myPath = new File("");
	  String myFIlePath = myPath.getAbsolutePath()+"/src/Training_15_InOut/poem.txt";
	  try
	  {
	  FileWriter fW  = new FileWriter(myFIlePath,false);  //false ��ʾÿִ��һ�ζ��������ļ���дһ��
	  fW.write("��ɪ - ������\r\n");
	  fW.write("��ɪ�޶���ʮ��,һ��һ��˼����.\r\n");
	  fW.write("ׯ�������Ժ���,���۴����жž�.\r\n");
	  fW.write("�׺�����������,������ů������.\r\n");
	  fW.write("����ɴ���׷��,ֻ�ǵ�ʱ���Ȼ.\r\n");
	  fW.flush();
	  fW.close();
	  }catch(Exception e)
	  {
		  System.out.println(e);
	  }
	  
	}

}
