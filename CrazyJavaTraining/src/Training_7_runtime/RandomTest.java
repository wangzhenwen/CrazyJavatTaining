package Training_7_runtime;

import java.util.Arrays;
import java.util.Random;

/**
 * α���������
 * @author nuts
 *
 */
public class RandomTest
{
	public static void main(String [] args)
	{
		Random  random =  new Random();
		System.out.println("rand.nextBoolean()��"+random.nextBoolean());
		byte  [] buffer = new byte [16];
		random.nextBytes(buffer);
		System.out.println(Arrays.toString(buffer));
		//����0.0~1.0֮���α���double��
		System.out.println("rand.nextDouble():"+random.nextDouble());
		//����0.0~1.0֮���α���float��
		System.out.println("rand.nextFloat():"+random.nextFloat());
		//����ƽ��ֵ0.0����׼����1.0��α��˹��
		System.out.println("rand.nextGaussian()��"+random.nextGaussian());
		//����һ������int����ȡֵ��Χ��α�������
		System.out.println("rand.nextInt():"+random.nextInt());
		//����0~26֮���α�������
		System.out.println("rand.nextInt(26)��"+random.nextInt(26));
		//����һ������long����ȡֵ��Χ��α�������
		System.out.println("rand.nextLong()"+random.nextLong());
	}

}
