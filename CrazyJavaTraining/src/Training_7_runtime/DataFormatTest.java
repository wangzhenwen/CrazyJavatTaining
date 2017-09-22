package Training_7_runtime;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
/**
 * 日期格式化测试
 * @author nuts
 *
 */
public class DataFormatTest
{
   public static void main (String [] args)
   {
	   Date date = new Date();
	   Locale [] locals = {Locale.CHINA,Locale.US};
	   DateFormat []  dateFormats = new DateFormat [16];
	   int i =0;
	    while (i<locals.length)
	    {
	    	dateFormats [i*8]= DateFormat.getDateInstance(DateFormat.SHORT,locals[i]);
	    	dateFormats [i*8+1]=DateFormat.getDateInstance(DateFormat.MEDIUM,locals[i]);
	    	dateFormats [i*8+2]=DateFormat.getDateInstance(DateFormat.LONG,locals[i]);
	    	dateFormats [i*8+3]=DateFormat.getDateInstance(DateFormat.FULL,locals[i]);
	    	dateFormats [i*8+4]=DateFormat.getTimeInstance(DateFormat.SHORT,locals[i]);
	    	dateFormats [i*8+5]=DateFormat.getTimeInstance(DateFormat.MEDIUM,locals[i]);
	    	dateFormats [i*8+6]=DateFormat.getTimeInstance(DateFormat.LONG,locals[i]);
	    	dateFormats [i*8+7]=DateFormat.getTimeInstance(DateFormat.FULL,locals[i]);	    	
	    	i++;
	    }
	    int j=0;
	    while (j<locals.length)
	    {
	    	switch (j)
			{
			case 0:
				  System.out.println("---------中国时间格式--------");
				break;
			case 1:
				System.out.println("--------美国时间格式--------");
				break;
			}
	    	System.out.println("SHORT日期格式:"+dateFormats[j*8].format(date));
	    	System.out.println("MEDIUM日期格式:"+dateFormats[j*8+1].format(date));
	    	System.out.println("LONG日期格式:"+dateFormats[j*8+2].format(date));
	    	System.out.println("FULL日期格式:"+dateFormats[j*8+3].format(date));
	    	System.out.println("SHORT时间格式:"+dateFormats[j*8+4].format(date));
	    	System.out.println("MEDIUM时间格式："+dateFormats[j*8+5].format(date));
	    	System.out.println("Long时间格式:"+dateFormats[j*8+6].format(date));
	    	System.out.println("FULL时间格式:"+dateFormats[j*8+7].format(date));
	    	j++;
	    }
   }
}
