package Training_7_runtime;

/**
 * IdentityHashCode����
 * @author nuts
 *
 */
public class IdentityHashCodeTest
{
   public static void main (String [] args)
   {
	   String s1  = new String("Hello");
	   String s2 =  new String("Hello");
	   //String ��hashCode�Ѿ�����д�����������������HashCode����ͬ��
	   System.out.println(s1.hashCode()+"---->"+s2.hashCode());
	   //s1 ��s2 �ǲ�ͬ���ַ����������Զ��ߵ�IdentityHasCode����ͬ
	   System.out.println(System.identityHashCode(s1)+"---->"+System.identityHashCode(s2));
	   String s3 = "Java";
	   String s4 ="Java";
	   //��Ϊs3��s4ָ�����ͬһ���������Զ��ߵ�IdentityHashCode��ͬ
	   System.out.println(System.identityHashCode(s3)+"---->"+System.identityHashCode(s4));
   }
}
