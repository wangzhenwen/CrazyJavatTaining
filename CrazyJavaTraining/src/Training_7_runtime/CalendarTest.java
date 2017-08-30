package Training_7_runtime;

import java.awt.CardLayout;
import java.util.Calendar;

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
   }
}
