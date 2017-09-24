package ThreadPoolTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * ����һ���ɻ����̳߳أ�����̳߳س��ȳ���������Ҫ���������տ����̣߳����޿ɻ��գ����½��̡߳�ʾ����
 * �̳߳�Ϊ���޴󣬵�ִ�еڶ�������ʱ��һ�������Ѿ���ɣ��Ḵ��ִ�е�һ��������̣߳�������ÿ���½��̡߳�
 * @author wangzhenwen
 *
 */
public class NewCatchedThreadPoolTest {
 
	public static void main(String [] args)
	{
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i =0;i<10;i++)
		{  final int index=i;
			try {
				Thread.sleep(i*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			executorService.execute(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(index);
				}
			});
		}
	}
}
