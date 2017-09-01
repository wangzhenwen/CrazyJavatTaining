package Training_7_runtime;

import java.util.Calendar;

public class LenientTest
{
	public static void main(String [] args)
	{
		Calendar cal = Calendar.getInstance();
		//结果是Year字段加1，Month制度为1（2月）
		cal.set(Calendar.MONTH, 13);
	}

}
