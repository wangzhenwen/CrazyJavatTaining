package Training_7_runtime;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 国际化测试
 * @author nuts
 *
 */
public class Hello
{
	public static void main(String [] args)
	{
		 /* Locale 对应特定的国家和语言
	         * ResourceBundle 用于加载一个资源包
	         * MessageFormat 用于格式化消息
	         * 对非西欧的文字进行编码
	         * 第一步新建一个.properties 文件 默认编码为iso-8859-1
	         * 第二步以key-value 进行编写，并保存，此时会提示一个错误 格式如：username=用户名
	         * 第三步把新建文件修改编码为UTF-8
	         * 第四步JDK自带一个编码工具叫native2ascii.exe ，在%JAVA_HEMO%/bin/下可以找到
	         * 从dos 进入进行编码可格式如：natice2ascii -encoding UTF-8 文件的全限路径+文件名 输出文件地址
	         * 编过码的文件如：username=\u7528\u6237\u540d  是标准的UNICODE编码
	         * 第五步把编码*/
		//取得系统默认的国家/语言环境
		Locale myLocale = Locale.getDefault();
		//根据指定的国家/语言环境加载资源文件
		ResourceBundle bundle = ResourceBundle.getBundle("Training_7_runtime.mess", myLocale);
		//打印从资源文件中取得的消息
		System.out.println(bundle.getString("hello"));
	}

}
