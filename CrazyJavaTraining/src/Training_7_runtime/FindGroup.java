package Training_7_runtime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ͨ��Matcher���find()��group()�������Դ�Ŀ���ַ�������������ض��ַ���(ƥ��������ʽ���ִ�)
 * @author wangzhenwen
 *
 */
public class FindGroup {
 public static void main(String [] args)
 {
	 //����һ��Pattern���󣬲���������һ��Matcher����
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
