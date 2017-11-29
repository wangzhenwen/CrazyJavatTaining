package reflect;

import java.lang.reflect.Method;

class User {
	public void sayHello() {
		System.out.println("sayHello");
	}

	public void sayHi() {
		System.out.println("sayHi");
	}

	private void sayGoodBye() {
		System.out.println("sayGoodBye");
	}
}

// 获取类中的方法
public class MethodDemo {
	public static void main(String[] args) {
		getAllMethod();
	}
    //获取所有方法
	private static void getAllMethod() {
		Class userc = User.class;
		Method[] methods = userc.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
	}
}
