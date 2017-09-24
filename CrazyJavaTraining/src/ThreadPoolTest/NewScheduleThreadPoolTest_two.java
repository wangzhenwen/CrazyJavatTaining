package ThreadPoolTest;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 创建一个定长线程池，支持定时及周期性任务执行
 * 表示延迟1秒后每3秒执行一次。
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
