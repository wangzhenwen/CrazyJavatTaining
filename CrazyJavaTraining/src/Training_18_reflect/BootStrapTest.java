package Training_18_reflect;

import java.net.URL;
/**
 * ���Ը��������
 * @author wangzhenwen
 *
 */
public class BootStrapTest {
	
	public static void main(String [] args)
	{
		//��ȡ��������������ص�����URL����
		URL [] url  = sun.misc.Launcher.getBootstrapClassPath().getURLs();
		for (int s = 0; s < url.length; s++) {
			//��ӡ����������������ص�url
			System.out.println(url[s].toExternalForm());
		}
	}

}
