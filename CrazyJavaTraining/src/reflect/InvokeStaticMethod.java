package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class StaticMethodtest{
	public static void sayHi(String name)
	{
		System.out.println("Hi "+name);
	}
}
public class InvokeStaticMethod {
    public static void main (String [] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    	//调用静态的方法 public static void sayHi(String name)
    	Class clz = Class.forName("reflect.StaticMethodtest");  //找到静态方法所在类的字节码
    	Method method = clz.getMethod("sayHi", String.class);   //获取静态方法
    	method.invoke(null, "will!");  //掉哟农静态方法
    	
    }
}
