
import java.util.Scanner;

//使用默认的空格分隔符
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
