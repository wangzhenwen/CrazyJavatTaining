package Training_7_runtime;

import java.util.Calendar;
/**
 * Calerndar  set ������Ч��ʱ����
 * @author nuts
 *
 */
public class LazyTest {
	public static void main(String[] args) {
       Calendar cal = Calendar.getInstance();
       cal.set(2003, 7,31); //2003-8-31
       //���·���Ϊ9,��9��31�ղ�����
       //��������޸ģ�ϵͳ�����cal�Զ�������10��1��
       cal.set(Calendar.MONTH, 8);
       //������뽫���10��1��
       System.out.println(cal.getTime()); //1
      cal.set(Calendar.DATE,5);   //2
      System.out.println(cal.getTime());//3
	}
}
