package Training_7_runtime;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * ʹ��MessageFormat�������ռλ�����ַ���
 * @author wangzhenwen
 *
 */
public class HelloArg {
  public static void main(String  []args)
  {
	  //��һ��Locale����
	  Locale currentLocale = null;
	  if(args.length ==2)
	  {
		  //ʹ�����г����������������Localeʵ��
		  currentLocale = new Locale(args[0],args[1]);
	  }else {
		  //����ʹ��ϵͳĬ�ϵ�Locale
		  currentLocale = Locale.getDefault();
	  }
	  //����Locale����������Դ
	  ResourceBundle  resourceBundle = ResourceBundle.getBundle("Training_7_runtime.myMess", currentLocale);
	  //ȡ���Ѽ��ص������ļ���msg��Ӧ��Ϣ
	  String msg = resourceBundle.getString("msg");
	  //ʹ��MessageFormat Ϊ��ռλ���������
	  System.out.println(MessageFormat.format(msg, "yeeku",new Date()));
  }
}
