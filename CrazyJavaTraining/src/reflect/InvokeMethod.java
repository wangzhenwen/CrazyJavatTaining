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
				  //����	public void sayHi(String name) 
				Class clz = Class.forName("reflect.Emps") ; //�ҵ������÷������ڵ��ֽ���
				Method method = clz.getMethod("sayHi", String.class); //��ȡ��Ҫ���õķ���
				method.invoke(clz.newInstance(), "will"); //���÷���
				//����˽�з��� private void sayHi(String name,int age)
				Method method2 = clz.getDeclaredMethod("sayHi", String.class,int.class);  //��ȡ�����õķ��� ˽��
				method2.setAccessible(true);  //��˽�з������Ա�����
				method2.invoke(clz.newInstance(), "will",21);
				
				
				
			}
}
