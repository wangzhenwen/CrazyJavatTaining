package ThreadPoolTest;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/**
 * 创建一个定长线程池，支持定时及周期性任务执行
 * 表示延迟3秒执行。
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
