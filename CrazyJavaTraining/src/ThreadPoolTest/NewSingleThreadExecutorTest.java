package ThreadPoolTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行
 * @author wangzhenwen
 *
 */
public class NewSingleThreadExecutorTest {
  public static void main(String [] args)
  {
     ExecutorService executorService = Executors.newSingleThreadExecutor();
     for (int i=0; i<100;i++)
     { final int index =i;
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
