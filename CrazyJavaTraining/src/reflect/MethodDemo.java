package reflect;

import java.lang.reflect.Method;

class User {
	public void sayHello() {
		System.out.println("sayHello");
	}

	public void sayHi(String name) {
		System.out.println("sayHi");
	}

	private void sayGoodBye() {
		System.out.println("sayGoodBye");
	}
	
	private void sayAage(String name,int age) {
		System.out.println(name+"'s age is"+ age);
	}
}

// 获取类中的方法
public class MethodDemo {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		getAllMethod();
		getOneMethod();
	}
	//获取单个方法
	public static void getOneMethod() throws NoSuchMethodException, SecurityException
	{
		//public void sayHi(String name)
		Class clz = User.class;
		//只有通过方法签名才能找到唯一的方法
		//方法签名=方法名+参数列表[参数类型、参数个数、参数顺序]
		//Method method = clz.getMethod("sayHi", String.class);
		//Method method = clz.getMethod("sayHi");//表示user类中找一个叫sayHi的公共方法，而且没有参数
	    //System.out.println(method);
		System.out.println("------------------------------------");
		 Method method = clz.getDeclaredMethod("sayAage", String.class,int.class);
		System.out.println(method);
		
	}
    //获取所有方法
	private static void getAllMethod() {
		Class userc = User.class;
		Method[] methods = userc.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("----------------------------");
		methods = userc.getDeclaredMethods();
		for(Method method:methods)
		{
			System.out.println(method);
		}
	}
}
