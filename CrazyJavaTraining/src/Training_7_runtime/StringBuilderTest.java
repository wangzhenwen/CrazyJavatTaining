package Training_7_runtime;
/**
 * StringBulder�����
 * @author nuts
 *
 */
public class StringBuilderTest
{
  public static void main(String [] args)
  {
	  StringBuilder sBuilder  = new StringBuilder();
	  //׷���ַ���
	  sBuilder.append("java"); //sBuilder ="java";
	  //����
	  sBuilder.insert(0, "hello  ");//sBuilder = "hello  java";
	  //�滻  ��ͷ����β
	  sBuilder.replace(5, 6, ","); //sBuilder ="hello, java";
	  System.out.println(sBuilder.toString());
	  //ɾ��  ��ͷ����β
	  sBuilder.delete(5, 7);
	  System.out.println(sBuilder.toString());
	  //��ת
	  sBuilder.reverse();
	  System.out.println(sBuilder);
	  System.out.println(sBuilder.length()); //���9 �ڲ��ַ����г���
	  System.out.println(sBuilder.capacity()); //��������
	  //�ı�StringBuilder�ĳ��ȣ�ֻ����ǰ�沿��
	  sBuilder.setLength(5);
	  System.out.println(sBuilder);
  }
}
