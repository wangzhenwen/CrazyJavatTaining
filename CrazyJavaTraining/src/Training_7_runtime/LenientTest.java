package Training_7_runtime;

import java.util.Calendar;

public class LenientTest
{
	public static void main(String [] args)
	{
		Calendar cal = Calendar.getInstance();
		//�����Year�ֶμ�1��Month�ƶ�Ϊ1��2�£�
		cal.set(Calendar.MONTH, 13);
	}

}