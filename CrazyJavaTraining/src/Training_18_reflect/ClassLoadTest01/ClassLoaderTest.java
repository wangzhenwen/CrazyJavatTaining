package Training_18_reflect.ClassLoadTest01;

public class ClassLoaderTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
        ClassLoader c1 = ClassLoader.getSystemClassLoader();
        c1.loadClass("Training_18_reflect.ClassLoadTest01.Tester");
        System.out.println("ϵͳ����Tester��");
	    Class.forName("Training_18_reflect.ClassLoadTest01.Tester");
	}

}
