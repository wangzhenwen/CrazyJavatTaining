package ThreadPoolTest;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/**
 * ����һ�������̳߳أ�֧�ֶ�ʱ������������ִ��
 * ��ʾ�ӳ�3��ִ�С�
 * @author wangzhenwen
 *
 */
public class NewScheduledThreadPoolTest {
	public static void main(String [] args)
	{
	ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
		executorService.schedule(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("delay 3 seconds");
			}
		},3,TimeUnit.SECONDS);
	}

}
