package Training_7_runtime;
/**
 * 测试runtime类
 * @author nuts
 *
 */
public class RunTimeTest
{
   public static void main(String [] args)
   {
	   //获取Java程序关联的运行时对象
	   Runtime runtime = Runtime.getRuntime();
	   System.out.println("处理器数量:"+runtime.availableProcessors());
	   System.out.println("空闲内存数:"+runtime.freeMemory());
	   System.out.println("总内存数:"+runtime.totalMemory());
	   System.out.println("可用最大内存数"+runtime.maxMemory());
   }
}
