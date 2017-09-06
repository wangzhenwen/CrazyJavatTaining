package Training_7_runtime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  Matcher 类 的start()和end()方法主要用于确定子串在目标字符串的位置
 * @author wangzhenwen
 *
 */
public class StartEnd {
  public static void main(String [] args)
  {
	  //创建一个Pattern对象，并用它建立一个Matcher对象
	  String regStr = "Java is very easy";
	  System.out.println("目标字符串是:"+regStr);
	  Matcher m = Pattern.compile("\\w+").matcher(regStr);
	  while(m.find())
	  {
		  //start()返回上一次与Pattern匹配的子串在目标字符串中的开始位置
		  //end()返回上一次与Pattern匹配的子串在目标字符串中的结束位置加1
		  System.out.println(m.group()+"子串的起始位置:"+m.start()+",其结束位置:"+m.end());
	  }
  }
}
