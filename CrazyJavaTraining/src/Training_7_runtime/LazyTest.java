package Training_7_runtime;

import java.util.Calendar;
/**
 * Calerndar  set 方法生效延时测试
 * @author nuts
 *
 */
public class LazyTest {
	public static void main(String[] args) {
       Calendar cal = Calendar.getInstance();
       cal.set(2003, 7,31); //2003-8-31
       //将月份设为9,但9月31日不存在
       //如果立即修改，系统将会把cal自动调整到10月1日
       cal.set(Calendar.MONTH, 8);
       //下面代码将输出10月1日
       System.out.println(cal.getTime()); //1
      cal.set(Calendar.DATE,5);   //2
      System.out.println(cal.getTime());//3
	}
}
