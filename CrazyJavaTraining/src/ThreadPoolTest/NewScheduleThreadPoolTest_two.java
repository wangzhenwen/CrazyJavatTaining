package ThreadPoolTest;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ����һ�������̳߳أ�֧�ֶ�ʱ������������ִ��
 * ��ʾ�ӳ�1���ÿ3��ִ��һ�Ρ�
 * @author wangzhenwen
 *
 */
public class NewScheduleThreadPoolTest_two {
  public static void main (String [] args)
  {
	  ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
	  scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("delay 1 seconds,and excute every 3 seconds");
		}
	}, 1, 3, TimeUnit.SECONDS);
  }
}
