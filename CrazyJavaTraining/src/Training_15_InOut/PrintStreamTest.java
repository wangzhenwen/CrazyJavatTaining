package Training_15_InOut;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
/**
 * 使用PintStream将数据写入文件
 * @author nuts
 *
 */
public class PrintStreamTest
{
	public static void main(String [] args)
	{
		try{
			File myPath = new File("");
			//先构建一个节点
			FileOutputStream fos = new FileOutputStream(myPath.getAbsolutePath()+"/src/Training_15_InOut/"+"tests.txt",false);
			//再用该节点构建一个处理流
			PrintWriter ps = new PrintWriter(fos);
			//使用PrintStream执行输出
			ps.println("普通字符串");
			//直接使用PrintStream输出对象
			ps.println(new PrintStreamTest());
			ps.flush();
			ps.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
