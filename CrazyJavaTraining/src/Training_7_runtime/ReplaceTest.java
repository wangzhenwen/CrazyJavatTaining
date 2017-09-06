package Training_7_runtime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ʹ��������ʽ�滻�ַ����е���
 * @author nuts
 *
 */
public class ReplaceTest
{
    public static void main(String [] args)
    {
    	String [] mags = {
    			"Java has regular expression in 1.4",
    			"regular expression now expressing in Java",
    			"Java regresses oracular expressions"
    	};
    	Pattern pattern = Pattern.compile("re\\w+");
    	Matcher matcher= null;
    	for (String mag : mags)
    	{
    		if(matcher == null)
    		{
    			matcher = pattern.matcher(mag);
    		} else{
    			matcher.reset(mag);
    		}
    		System.out.println(matcher.replaceAll("����:)"));
    	}
    }
}
