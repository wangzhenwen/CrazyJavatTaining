package Training_15_InOut;

import java.util.Scanner;
/**
 * ͨ��new Scanner(System.in) ����һ��Scanner������̨��һֱ�ȴ����룬ֱ���ûس���������
 * ������������ݴ���Scanner,��Ϊɨ��������Ҫ��ȡ��������ݣ���ֻ�����Scanner��nextLine()�������ɡ�
 * @author nuts
 *
 */
public class TestScanner
{
   public static void main(String [] args)
   {
	   Scanner scanner  = new Scanner(System.in);

	   while(true)
	   {	   System.out.print("�������ַ���:");
		   String line =scanner.nextLine();
		   if(line.equals("exit"))
			   break;
		   System.out.println(">>>"+line);
	   }
   }
}
