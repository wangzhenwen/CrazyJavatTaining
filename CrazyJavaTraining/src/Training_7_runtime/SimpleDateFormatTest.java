package Training_7_runtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat对象测试
 * @author wangzhenwen
 *
 */
public class SimpleDateFormatTest {
  public static void main (String [] args)
  {
	  /**
	  SimpleDateFormat函数语法：
	  
	  G 年代标志符
	  y 年
	  M 月
	  d 日
	  h 时 在上午或下午 (1~12)
	  H 时 在一天中 (0~23)
	  m 分
	  s 秒
	  S 毫秒
	  E 星期
	  D 一年中的第几天
	  F 一月中第几个星期几
	  w 一年中第几个星期
	  W 一月中第几个星期
	  a 上午 / 下午 标记符 
	  k 时 在一天中 (1~24)
	  K 时 在上午或下午 (0~11)
	  z 时区
	 */
	  Date d = new Date();
	  //创建一个SimpleDateForamte对象
	  SimpleDateFormat sdf1 = new SimpleDateFormat("Gyyyy的第D天");
	  //将d格式化为日期，输出:公元2007中第xxx天
	  String datStr = sdf1.format(d);
	  System.out.println(datStr);
	  //一个非常特殊的日期字符串
	  String str = "07###三月##21";
	  SimpleDateFormat sdf2 = new SimpleDateFormat("y###MMM##d");
	  //将日期字符串解析成日期,
	  try {
		System.out.print(sdf2.parse(str));
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
