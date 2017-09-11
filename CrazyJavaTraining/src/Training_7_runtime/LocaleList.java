package Training_7_runtime;

import java.util.Locale;

public class LocaleList
{
   public static  void main(String  [] args)
   {
	   //返回Java所支持的全部国家和语言的数组
	   Locale []  locales = Locale.getAvailableLocales(); 
	   for(Locale locale :locales )
	   {
		   System.out.println(locale.getDisplayCountry()
				     +"="+locale.getCountry()+" "
				   + locale.getDisplayLanguage()
				   +"=" +locale.getLanguage());
	   }
   }
}
