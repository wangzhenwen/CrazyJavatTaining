package Training_7_runtime;

import java.util.Arrays;

/**
 * ����String ��replaceFirst() �� split() ����
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
		   System.out.println(msg.replaceFirst("re\\w+", "����:"));
		   System.out.println(Arrays.toString(  msg.split(" ")));
	   }
   }
}
