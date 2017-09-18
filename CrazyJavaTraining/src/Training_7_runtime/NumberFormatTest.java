package Training_7_runtime;

import java.text.NumberFormat;
import java.util.Locale;



public class NumberFormatTest
{
   public static void main(String  [] args)
   {
	   double db = 12340000.567;
	   
	   Locale []  locale = {Locale.CHINA,Locale.JAPAN,Locale.GERMAN,Locale.US};
	   NumberFormat [] numberformat = new NumberFormat [12];
	   int i =0;
	   while (i<locale.length)
	   {
		   numberformat[i*3] = NumberFormat.getNumberInstance(locale[i]);
		   numberformat[i*3+1] = NumberFormat.getPercentInstance(locale[i]);
		   numberformat[i*3+2] =NumberFormat.getCurrencyInstance(locale[i]);
		   i++;
	   }
	  int j=0;
	  while (j<locale.length)
	  {
		  switch (j)
		{
		 case 0:
			System.out.println("---------中国的格式-----------");
			break;
		 case 1:
			 System.out.println("---------日本的格式-----------");
            break;
		 case 2:
			 System.out.println("---------德国的格式-----------");
			 break;
		 case 3:
			 System.out.println("---------美国的格式-----------");
			 break;
		}
		  System.out.println(numberformat[j*3].format(db));
		  System.out.println(numberformat[j*3+1].format(db));
		  System.out.println(numberformat[j*3+2].format(db));
		  j++;
	  }
   }
}
 