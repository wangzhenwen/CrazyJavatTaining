package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Emps {
	public void sayHello() {
		System.out.println("sayHello");
	}

	public int sayHi(String name) {
		System.out.println("sayHi-------"+name);
		return 1;
	}

	private void sayGoodBye() {
		System.out.println("sayGoodBye");
	}
	
	private void sayHi(String name,int age) {
		System.out.println(name+"'s age is "+ age);
	}
}

public class InvokeMethod {
			public static void main(String [] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException
			{
				  //调用	public void sayHi(String name) 
				Class clz = Class.forName("reflect.Emps") ; //找到被调用方法所在的字节码
				Method method = clz.getMethod("sayHi", String.class); //获取需要调用的方法
				method.invoke(clz.newInstance(), "will"); //调用方法
				//调用私有方法 private void sayHi(String name,int age)
				Method method2 = clz.getDeclaredMethod("sayHi", String.class,int.class);  //获取被调用的方法 私有
				method2.setAccessible(true);  //让私有方法可以被调用
				method2.invoke(clz.newInstance(), "will",21);
				
				
				
			}
}
