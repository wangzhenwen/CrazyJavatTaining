package Training_7_runtime;

import java.util.Date;
/**
 * Data�����
 * @author nuts
 *
 */

public class DataTest
{
   public static void main(String [] args)
   {
	   Date d1 = new Date();
	   //��ȡ��ǰʱ��֮��100ms��ʱ��
	   Date d2 = new Date(System.currentTimeMillis()+100);
	   System.out.println(d2);
	   System.out.println(d1.compareTo(d2));
	   System.out.println(d1.before(d2));
   }
}
