package Training_7_runtime;

import java.util.Objects;

/**
 * 定义一个obj变量，它的默认值是null
 * @author wangzhenwen
 *
 */
public class ObjectsTest {
 //定义一个obj变量，它的默认值是null
	static ObjectsTest obj;
	public static void main(String [] args)
	{
		//输出一个null对象的hashCode值，输出0
		System.out.println(Objects.hashCode(obj));
		//输出一个null对象的toString，输出null
		System.out.println(Objects.toString(obj));
		//要求obj不能null，如果obj为null则引发异常
		//当传入的参数不为null时，该方法返回该参数
		System.out.println(Objects.requireNonNull(obj,"obj参数不能为null!"));
	}
}
