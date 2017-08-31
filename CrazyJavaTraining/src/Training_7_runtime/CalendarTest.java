package Training_7_runtime;

import java.awt.CardLayout;
import java.util.Calendar;

import javax.management.monitor.Monitor;

public class CalendarTest
{
   public static void main(String [] args)
   {
	   Calendar calendar  = Calendar.getInstance();
	   //ȡ����
	   System.out.println(calendar.get(Calendar.YEAR));
	   //ȡ���·�
	   System.out.println(calendar.get(Calendar.MONTH)+1);
	   //ȡ����
	   System.out.println(calendar.get(calendar.DATE));
	   //�ֱ������ꡢ�¡��ա�Сʱ�����ӡ���
	   calendar.set(2003,10,23,12,32,23);  //2003-11-23 12:32:23
	   System.out.println(calendar.getTime());
	   //��Calendar����ǰ��1��
	   calendar.add(Calendar.YEAR, -1); //2002-11-23 12:32:23
	   System.out.println(calendar.getTime());
	   //��Calendar ����ǰ��8����
	   calendar.roll(Calendar.MONTH, -8); //2002-03-23 12:32;23
	   System.out.println(calendar.getTime());
	   /***add��roll������***/
	   Calendar cal1 = Calendar.getInstance();
	   cal1.set(2003, 7,23,0,0,0); //2003-8-23
	   cal1.add(cal1.MONTH, 6); //2004-2-23
	   
	   Calendar cal3 = Calendar.getInstance();
	   cal3.set(2003,7,23,0,0,0);//2003-8-23
	   //MONTH�ֶΡ���λ��������YEAR�ֶβ�����
	   cal3.roll(Calendar.MONTH, 6); //2003-8-23->2003-2-23
	   
	   Calendar cal4 = Calendar.getInstance();
	   cal4.set(2003, 7,31,0,0,0); //2003-8-31
	   //month�ֶν�λ����2,2��û��31��
	   //year�ֶβ���ı䣬2003��2��ֻ��28��
	   cal4.roll(Calendar.MONTH, 6);
	   
   }
}
