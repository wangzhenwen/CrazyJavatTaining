package Training_18_reflect;

import java.net.URL;
/**
 * 测试根类加载器
 * @author wangzhenwen
 *
 */
public class BootStrapTest {
	
	public static void main(String [] args)
	{
		//获取根类加载器所加载的所有URL数组
		URL [] url  = sun.misc.Launcher.getBootstrapClassPath().getURLs();
		for (int s = 0; s < url.length; s++) {
			//打印遍历根类加载器加载的url
			System.out.println(url[s].toExternalForm());
		}
	}

}
