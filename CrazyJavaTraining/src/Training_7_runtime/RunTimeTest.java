package Training_7_runtime;
/**
 * ����runtime��
 * @author nuts
 *
 */
public class RunTimeTest
{
   public static void main(String [] args)
   {
	   //��ȡJava�������������ʱ����
	   Runtime runtime = Runtime.getRuntime();
	   System.out.println("����������:"+runtime.availableProcessors());
	   System.out.println("�����ڴ���:"+runtime.freeMemory());
	   System.out.println("���ڴ���:"+runtime.totalMemory());
	   System.out.println("��������ڴ���"+runtime.maxMemory());
   }
}
