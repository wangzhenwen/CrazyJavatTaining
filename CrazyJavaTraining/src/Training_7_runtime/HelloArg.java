package Training_7_runtime;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 使用MessageFormat处理包含占位符的字符串
 * @author wangzhenwen
 *
 */
public class HelloArg {
  public static void main(String  []args)
  {
	  //定一个Locale变量
	  Locale currentLocale = null;
	  if(args.length ==2)
	  {
		  //使用运行程序的两个参数构造Locale实例
		  currentLocale = new Locale(args[0],args[1]);
	  }else {
		  //否则使用系统默认的Locale
		  currentLocale = Locale.getDefault();
	  }
	  //根据Locale加载语言资源
	  ResourceBundle  resourceBundle = ResourceBundle.getBundle("Training_7_runtime.myMess", currentLocale);
	  //取得已加载的语言文件中msg对应信息
	  String msg = resourceBundle.getString("msg");
	  //使用MessageFormat 为带占位符传入参数
	  System.out.println(MessageFormat.format(msg, "yeeku",new Date()));
  }
}
