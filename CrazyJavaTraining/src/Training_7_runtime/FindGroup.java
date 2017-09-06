package Training_7_runtime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 通过Matcher类的find()和group()方法可以从目标字符串中依次提出特定字符串(匹配正则表达式的字串)
 * @author wangzhenwen
 *
 */
public class FindGroup {
 public static void main(String [] args)
 {
	 //创建一个Pattern对象，并用它建立一个Matcher对象
	 Matcher m = Pattern.compile("\\w+").matcher("Java is very easy!");
	 while(m.find())
	 {
		 System.out.println(m.group());
	 }
	 int i =0;
	 while (m.find(i))
	 {
		 System.out.print(m.group()+"\t");
		 i++;
	 }
 }
}
