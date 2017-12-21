package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *  用反射调用可变参数方法
 * @author wangzhenwen
 *
 */
public class VarArgsMthodInvoke {
	public static void main(String [] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		Class clz = Class.forName("reflect.VarArgsMthodInvoke");
		Method im = clz.getMethod("imethod", int [].class);
		im.invoke(null,new  Object [] {new int [] {1,2,3}});
		Class clz2 = Class.forName("reflect.VarArgsMthodInvoke");
		Method rm = clz2.getMethod("rmethod", String [].class);
		rm.invoke(null, new Object [] {new String [] {"a","b","c"}});
	}
	/**
	 * 基本类型可变参数
	 * @param args
	 */
	public static void  imethod(int... args)
	{
		System.out.println(Arrays.toString(args));
	}
	/**
	 * 引用类型可变参数
	 * @param args
	 */
    public static void rmethod(String... args)
    {
    	System.out.println(Arrays.toString(args));
    }
}
