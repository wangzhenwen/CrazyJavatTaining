package Training_7_runtime;

import java.util.Objects;

/**
 * ����һ��obj����������Ĭ��ֵ��null
 * @author wangzhenwen
 *
 */
public class ObjectsTest {
 //����һ��obj����������Ĭ��ֵ��null
	static ObjectsTest obj;
	public static void main(String [] args)
	{
		//���һ��null�����hashCodeֵ�����0
		System.out.println(Objects.hashCode(obj));
		//���һ��null�����toString�����null
		System.out.println(Objects.toString(obj));
		//Ҫ��obj����null�����objΪnull�������쳣
		//������Ĳ�����Ϊnullʱ���÷������ظò���
		System.out.println(Objects.requireNonNull(obj,"obj��������Ϊnull!"));
	}
}
