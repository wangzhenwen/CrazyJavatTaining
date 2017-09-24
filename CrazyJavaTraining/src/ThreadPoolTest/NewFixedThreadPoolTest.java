package ThreadPoolTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 
 * @author wangzhenwen
 *创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
 *因为线程池大小为3，每个任务输出index后sleep 2秒，所以每两秒打印3个数字。
 *定长线程池的大小最好根据系统资源进行设置。如Runtime.getRuntime().availableProcessors()
 */
public class NewFixedThreadPoolTest {
	public static void main(String [] args)
	{
		//System.out.println(Runtime.getRuntime().availableProcessors());
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for(int i=0;i<10;i++)
		{
			final int index =i;
		    executorService.execute(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(index);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		}
	}
}
