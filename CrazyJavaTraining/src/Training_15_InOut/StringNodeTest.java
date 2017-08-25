package Training_15_InOut;

import java.io.StringReader;
import java.io.StringWriter;
/**
 * ͨ��StringReader���ַ���Ϊ����Դ����ȡ�ַ�������ӡ������̨
 * ͨ��StringWriterд��һЩ�ַ���������ӡ������̨
 * @author nuts
 *
 */
public class StringNodeTest
{
   public static void main(String [] args)
   {
	   /*ͨ��StringReader���ַ���Ϊ����Դ����ȡ�ַ�������ӡ������̨*/
	   String src = "��������,��һ���Ҹ�����\n"
	   		+ "ι��,����,��������\n"
	   		+ "��������,������ʳ���߲�\n"
	   		+ "����һ������,�泯��,��ů����\n"
	   		+ "��������,��ÿһ������ͨ��\n"
	   		+ "�����������Ƕ�ô���Ҹ�\n";
	  char [] chars =  new char[1];
	  int leng=0;
	  StringReader stringReader = new StringReader(src);
	  try
	  {   //����ѭ����ȡ�ķ�ʽ��ȡ�ַ���
		  while((leng=stringReader.read(chars))>0)
		  {
			System.out.print(new String(chars,0,leng));  
			Thread.sleep(50);
		  }
	  }catch (Exception e)
	  {
		  e.printStackTrace();
	  }
	 /*ͨ��StringWriterд��һЩ�ַ���������ӡ������̨*/
	  StringWriter sWriter = new StringWriter();
	  sWriter.write("��һ��������������,\n");
	  sWriter.write("����Զ������,\n");
	  sWriter.write("����������ĺ���\n");
	  sWriter.write("��������ľ���\n");
	  System.out.println(sWriter.toString());
   }
}
