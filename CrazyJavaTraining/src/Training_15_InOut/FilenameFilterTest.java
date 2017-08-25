package Training_15_InOut;

import java.io.File;
import java.io.FilenameFilter;
/**
 * 文件过滤
 * @author wangzhenwen
 *
 */
public class FilenameFilterTest {
  public static void main(String [] args)
  {
	  File file = new File(".");
	  String [] nameList = file.list(new MyFilenameFilter());
	  for(String name:nameList)
	  {
		  System.out.println(name);
	  }
  }
  
}
//实现自己的FilenameFilter实现类
class MyFilenameFilter implements FilenameFilter
{
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		//如果文件名以.java结尾，或者文件对应一个路径，则返回ture
		return name.endsWith(".java")||new File(name).isDirectory();
	}
	}
