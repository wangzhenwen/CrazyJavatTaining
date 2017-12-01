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

// ��ȡ���еķ���
public class MethodDemo {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		getAllMethod();
		getOneMethod();
	}
	//��ȡ��������
	public static void getOneMethod() throws NoSuchMethodException, SecurityException
	{
		//public void sayHi(String name)
		Class clz = User.class;
		//ֻ��ͨ������ǩ�������ҵ�Ψһ�ķ���
		//����ǩ��=������+�����б�[�������͡���������������˳��]
		//Method method = clz.getMethod("sayHi", String.class);
		//Method method = clz.getMethod("sayHi");//��ʾuser������һ����sayHi�Ĺ�������������û�в���
	    //System.out.println(method);
		System.out.println("------------------------------------");
		 Method method = clz.getDeclaredMethod("sayAage", String.class,int.class);
		System.out.println(method);
		
	}
    //��ȡ���з���
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
