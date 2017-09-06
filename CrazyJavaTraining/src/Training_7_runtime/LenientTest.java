package Training_7_runtime;

import java.util.Calendar;

public class LenientTest
{
	public static void main(String [] args)
	{
		Calendar cal = Calendar.getInstance();
		//结果是Year字段加1，Month制度为1（2月）
		cal.set(Calendar.MONTH, 13);
		System.out.println(cal.getTime());
		
		//关闭容错性
		cal.setLenient(false);
		//导致运行时异常
		cal.set(Calendar.MONTH,13);
		System.out.println(cal.getTime());
	}

}
