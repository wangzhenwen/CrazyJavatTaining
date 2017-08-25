package Training_7_runtime;

import java.io.IOException;

/**
 * 单独启动一个进程来运行操作系统的命令
 * @author nuts
 *
 */
public class ExecTest
{
  public static void main(String [] args)
  {
	  Runtime runtime = Runtime.getRuntime();
	  try
	{
		runtime.exec("db2cmd");
	} catch (IOException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
