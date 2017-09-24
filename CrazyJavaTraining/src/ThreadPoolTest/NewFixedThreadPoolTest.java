package ThreadPoolTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 
 * @author wangzhenwen
 *����һ�������̳߳أ��ɿ����߳���󲢷������������̻߳��ڶ����еȴ���
 *��Ϊ�̳߳ش�СΪ3��ÿ���������index��sleep 2�룬����ÿ�����ӡ3�����֡�
 *�����̳߳صĴ�С��ø���ϵͳ��Դ�������á���Runtime.getRuntime().availableProcessors()
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
