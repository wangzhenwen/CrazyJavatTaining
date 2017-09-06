package Training_7_runtime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 通过Matcher类的Find()和group()方法可以从目标字符串中依次提取特定字串
 * @author nuts
 *
 */
public class FindGroup
{
	public static  void main(String [] args)
	{
		Matcher matcher = Pattern.compile("\\w+").matcher("Java is very easy!");
		while(matcher.find())
		{
			System.out.println(matcher.group());
		}
		int i=0;
		while (matcher.find(i))
		{
			System.out.print(matcher.group()+"\t");
			i++;
		}
	}

}
