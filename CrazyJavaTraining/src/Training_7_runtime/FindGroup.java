package Training_7_runtime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ͨ��Matcher���Find()��group()�������Դ�Ŀ���ַ�����������ȡ�ض��ִ�
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
