package Training_7_runtime;

import java.util.Arrays;

/**
 * 测试String 的replaceFirst() 与 split() 方法
 * @author nuts
 *
 */
public class StringReg
{
   public static void main(String [] args)
   {
	   String [] mStrings={
			   "Java has regular  expressions in 1.4",
			   "regular epressions now expressiong in Java",
			   "Java represses oracular expressions"
	   };
	   for (String msg:mStrings)
	   {
		   System.out.println(msg.replaceFirst("re\\w+", "哈哈:"));
		   System.out.println(Arrays.toString(  msg.split(" ")));
	   }
   }
}
