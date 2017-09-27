package Training_15_InOut;

import java.io.File;
import java.io.FilenameFilter;
/**
 * �ļ�����
 * @author wangzhenwen
 *
 */
public class FilenameFilterTest {
  public static void main(String [] args)
  {
	  File file = new File(".");
	  file = new File(file.getAbsolutePath()+File.separator+"src"+File.separator+"Training_15_InOut");
	  String [] nameList = file.list(new MyFilenameFilter());
	  for(String name:nameList)
	  {
		  System.out.println(name);
	  }
  }
  
}
//ʵ���Լ���FilenameFilterʵ����
class MyFilenameFilter implements FilenameFilter
{
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		//����ļ�����.java��β
		return name.endsWith(".java");
	}
	}
