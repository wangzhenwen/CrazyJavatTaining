package Training_7_runtime;

/**
 * IdentityHashCode测试
 * @author nuts
 *
 */
public class IdentityHashCodeTest
{
   public static void main (String [] args)
   {
	   String s1  = new String("Hello");
	   String s2 =  new String("Hello");
	   //String 的hashCode已经被改写了所以这两个对象的HashCode是相同的
	   System.out.println(s1.hashCode()+"---->"+s2.hashCode());
	   //s1 和s2 是不同的字符串对象所以二者的IdentityHasCode不相同
	   System.out.println(System.identityHashCode(s1)+"---->"+System.identityHashCode(s2));
	   String s3 = "Java";
	   String s4 ="Java";
	   //因为s3与s4指向的是同一个对象，所以二者的IdentityHashCode相同
	   System.out.println(System.identityHashCode(s3)+"---->"+System.identityHashCode(s4));
   }
}
