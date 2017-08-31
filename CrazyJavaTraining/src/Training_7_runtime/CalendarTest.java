package Training_7_runtime;

import java.awt.CardLayout;
import java.util.Calendar;

import javax.management.monitor.Monitor;

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
	   /***add与roll的区别***/
	   Calendar cal1 = Calendar.getInstance();
	   cal1.set(2003, 7,23,0,0,0); //2003-8-23
	   cal1.add(cal1.MONTH, 6); //2004-2-23
	   
	   Calendar cal3 = Calendar.getInstance();
	   cal3.set(2003,7,23,0,0,0);//2003-8-23
	   //MONTH字段“进位”，但是YEAR字段不增加
	   cal3.roll(Calendar.MONTH, 6); //2003-8-23->2003-2-23
	   
	   Calendar cal4 = Calendar.getInstance();
	   cal4.set(2003, 7,31,0,0,0); //2003-8-31
	   //month字段进位后变成2,2月没有31日
	   //year字段不会改变，2003年2月只有28天
	   cal4.roll(Calendar.MONTH, 6);
	   
   }
}
