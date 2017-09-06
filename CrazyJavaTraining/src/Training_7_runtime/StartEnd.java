package Training_7_runtime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  Matcher �� ��start()��end()������Ҫ����ȷ���Ӵ���Ŀ���ַ�����λ��
 * @author wangzhenwen
 *
 */
public class StartEnd {
  public static void main(String [] args)
  {
	  //����һ��Pattern���󣬲���������һ��Matcher����
	  String regStr = "Java is very easy";
	  System.out.println("Ŀ���ַ�����:"+regStr);
	  Matcher m = Pattern.compile("\\w+").matcher(regStr);
	  while(m.find())
	  {
		  //start()������һ����Patternƥ����Ӵ���Ŀ���ַ����еĿ�ʼλ��
		  //end()������һ����Patternƥ����Ӵ���Ŀ���ַ����еĽ���λ�ü�1
		  System.out.println(m.group()+"�Ӵ�����ʼλ��:"+m.start()+",�����λ��:"+m.end());
	  }
  }
}
