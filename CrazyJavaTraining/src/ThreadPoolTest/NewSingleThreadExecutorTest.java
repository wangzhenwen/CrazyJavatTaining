package ThreadPoolTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ����һ�����̻߳����̳߳أ���ֻ����Ψһ�Ĺ����߳���ִ�����񣬱�֤����������ָ��˳��(FIFO, LIFO, ���ȼ�)ִ��
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
