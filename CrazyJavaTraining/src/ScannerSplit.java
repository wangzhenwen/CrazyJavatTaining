
import java.util.Scanner;

//ʹ��Ĭ�ϵĿո�ָ���
public class ScannerSplit
{
   public static void main(String  [] args)
   {
	   Scanner scanner  = new Scanner("123 dfsad sdfjkasl dsfjklasjf dfdf,dfdf,dfdfsa,wee,sdfsa dfsdfa wang.zhen.wen");
	  // scanner.useDelimiter(" |,|\\.");
	   while(scanner.hasNext())
	   {
		   System.out.println(scanner.next());
	   }
   }
}
