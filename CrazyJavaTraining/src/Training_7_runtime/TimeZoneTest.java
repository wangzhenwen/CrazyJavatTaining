package Training_7_runtime;

import java.util.Arrays;
import java.util.TimeZone;
/**
 * ��ȡϵͳʱ������
 * @author nuts
 *
 */
public class TimeZoneTest {
	public static void main(String [] args)
	{
		//���Java��֧�ֵ�����ʱ��ID
		String [] ids = TimeZone.getAvailableIDs();
		System.out.println(Arrays.toString(ids));
		//���ϵͳĬ��������ID��Asia/Shanghai
		TimeZone my = TimeZone.getDefault();
		System.out.println(my.getID());
		//��ȡϵͳĬ��ʱ��������:�й���׼ʱ��
		System.out.println(my.getDisplayName());
		//��ȡָ��ID��ʱ������:Ŧ������׼ʱ��
		System.out.println(TimeZone.getTimeZone("CNT").getDisplayName());
	}

}
