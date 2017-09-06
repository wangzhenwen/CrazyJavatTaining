package Training_7_runtime;

import java.util.Arrays;
import java.util.TimeZone;
/**
 * 获取系统时区测试
 * @author nuts
 *
 */
public class TimeZoneTest {
	public static void main(String [] args)
	{
		//获得Java所支持的所有时区ID
		String [] ids = TimeZone.getAvailableIDs();
		System.out.println(Arrays.toString(ids));
		//获得系统默认市区的ID：Asia/Shanghai
		TimeZone my = TimeZone.getDefault();
		System.out.println(my.getID());
		//获取系统默认时区的名称:中国标准时间
		System.out.println(my.getDisplayName());
		//获取指定ID的时区名称:纽芬兰标准时间
		System.out.println(TimeZone.getTimeZone("CNT").getDisplayName());
	}

}
