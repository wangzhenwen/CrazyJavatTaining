package reflect;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
class Emp {
	public Emp() {
		System.out.println("..emp()...");
	}
	public Emp(String name) {
		System.out.println("..emp(String name)..." + name);
	}
	private Emp(String name, int age) {
		System.out.println("..emp(String name ,int age)..." + name + "," + age);
	}
}
/**
 * ���ù���������������
 * 
 * @author nuts
 *
 */
public class ConstructorInvokeDemo {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
     //ʹ�÷���������
		//1.���ҵ������ù��������ڵ��ֽ���
		Class clz = Class.forName("reflect.Emp");
	   //2.�ҵ������õĹ�����
	    Constructor<Emp> c = clz.getConstructor(null);
	    //3.ִ�иù��캯��
	    Emp e =c.newInstance(null);
	    System.out.println("/////////////////////////////////");
	     clz.newInstance();
	     System.out.println("/////////////////////////////////");
	     //����Emp(String name)
	     Constructor<Emp> cs = clz.getConstructor(String.class);
	     Emp  es  = cs.newInstance("wangzhenwen");
	     System.out.println(es);
	     System.out.println("/////////////////////////////////");
	     //���� private Emp(String name, int age)
	     Constructor<Emp> css = clz.getDeclaredConstructor(String.class,int.class);
	     System.out.println(css);
	     css.setAccessible(true);
	     Emp ecss=css.newInstance("wangzhenwen",33);    
	}
}
