package Training_7_runtime;

import java.util.Scanner;

public class ScannerLongTest
{
   public static void main (String [] args)
   {
	   //System.in �����׼���룬���Ǽ�������
	   Scanner scanner  = new Scanner(System.in);
	   //�ж��Ƿ�����һ��long����
	   while(scanner.hasNextLong())
	   {
		   //���������
		   System.out.println("���������������:"+scanner.nextLong());
	   }
   }
}
