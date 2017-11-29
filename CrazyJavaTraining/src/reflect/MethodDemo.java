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

// ��ȡ���еķ���
public class MethodDemo {
	public static void main(String[] args) {
		getAllMethod();
	}
    //��ȡ���з���
	private static void getAllMethod() {
		Class userc = User.class;
		Method[] methods = userc.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
	}
}
