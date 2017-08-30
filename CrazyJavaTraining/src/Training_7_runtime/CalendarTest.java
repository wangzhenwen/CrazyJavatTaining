package Training_7_runtime;

import java.awt.CardLayout;
import java.util.Calendar;

public class CalendarTest
{
   public static void main(String [] args)
   {
	   Calendar calendar  = Calendar.getInstance();
	   //取出年
	   System.out.println(calendar.get(Calendar.YEAR));
	   //取出月份
	   System.out.println(calendar.get(Calendar.MONTH)+1);
	   //取出日
	   System.out.println(calendar.get(calendar.DATE));
	   //分别设置年、月、日、小时、分钟、秒
	   calendar.set(2003,10,23,12,32,23);  //2003-11-23 12:32:23
	   System.out.println(calendar.getTime());
	   //将Calendar的年前推1年
	   calendar.add(Calendar.YEAR, -1); //2002-11-23 12:32:23
	   System.out.println(calendar.getTime());
	   //将Calendar 的月前推8个月
	   calendar.roll(Calendar.MONTH, -8); //2002-03-23 12:32;23
	   System.out.println(calendar.getTime());
   }
}
