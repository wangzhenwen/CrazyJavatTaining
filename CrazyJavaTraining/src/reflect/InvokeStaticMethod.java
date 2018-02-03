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
    	//���þ�̬�ķ��� public static void sayHi(String name)
    	Class clz = Class.forName("reflect.StaticMethodtest");  //�ҵ���̬������������ֽ���
    	Method method = clz.getMethod("sayHi", String.class);   //��ȡ��̬����
    	method.invoke(null, "will!");  //��Ӵũ��̬����
    	
    }
}
