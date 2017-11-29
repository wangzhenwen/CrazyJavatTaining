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
 * 调用构造器，创建对象
 * 
 * @author nuts
 *
 */
public class ConstructorInvokeDemo {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
     //使用发射来调用
		//1.先找到被调用构造器所在的字节码
		Class clz = Class.forName("reflect.Emp");
	   //2.找到被调用的构造器
	    Constructor<Emp> c = clz.getConstructor(null);
	    //3.执行该构造函数
	    Emp e =c.newInstance(null);
	    System.out.println("/////////////////////////////////");
	     clz.newInstance();
	     System.out.println("/////////////////////////////////");
	     //调用Emp(String name)
	     Constructor<Emp> cs = clz.getConstructor(String.class);
	     Emp  es  = cs.newInstance("wangzhenwen");
	     System.out.println(es);
	     System.out.println("/////////////////////////////////");
	     //调用 private Emp(String name, int age)
	     Constructor<Emp> css = clz.getDeclaredConstructor(String.class,int.class);
	     System.out.println(css);
	     css.setAccessible(true);
	     Emp ecss=css.newInstance("wangzhenwen",33);    
	}
}
