package Training_7_runtime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * ������ʽƥ�����
 * @author nuts
 */
public class MatcheTest {
  public static void main(String [] args) {
	  String  [] mails={"wangzhenwen@163.com",
			  "dfsdf.wew",
			  "sfhsdf@sohu.com",
			  "sfdsfs@163.com",
			  "www.sohu.com"};
	  Pattern pattern = Pattern.compile("\\w{3,20}@\\w+\\.(com|org|net|gov)");
	  Matcher matcher = null;
	  for(String mail:mails)
	  {
		  if(matcher == null)
		  {
			  matcher = pattern.matcher(mail);
		  }else
		  {
			  matcher.reset(mail);
		  }
		  String result = mail+(matcher.matches()?"��":"����")+"һ�������ʼ���ַ";
		  System.out.println(result);
	  }
	  
	  String result2 = "wangzhenwen1984@163.com"+("wangzhenwen1984@163.com".matches("\\w{3,20}@\\w+\\.(com|org|net|gov)")?"��":"����")+"һ���ʼ���ַ";
	  System.out.println(result2);
  }
}
