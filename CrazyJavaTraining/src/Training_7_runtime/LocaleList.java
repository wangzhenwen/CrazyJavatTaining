package Training_7_runtime;

import java.util.Locale;

public class LocaleList
{
   public static  void main(String  [] args)
   {
	   //����Java��֧�ֵ�ȫ�����Һ����Ե�����
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
