package Training_7_runtime;

import java.util.Arrays;
import java.util.Random;

/**
 * 伪随机数测试
 * @author nuts
 *
 */
public class RandomTest
{
	public static void main(String [] args)
	{
		Random  random =  new Random();
		System.out.println("rand.nextBoolean()："+random.nextBoolean());
		byte  [] buffer = new byte [16];
		random.nextBytes(buffer);
		System.out.println(Arrays.toString(buffer));
		//生成0.0~1.0之间的伪随机double数
		System.out.println("rand.nextDouble():"+random.nextDouble());
		//生成0.0~1.0之间的伪随机float数
		System.out.println("rand.nextFloat():"+random.nextFloat());
		//生成平均值0.0，标准差是1.0的伪高斯数
		System.out.println("rand.nextGaussian()："+random.nextGaussian());
		//生成一个处于int整数取值范围的伪随机整数
		System.out.println("rand.nextInt():"+random.nextInt());
		//生成0~26之间的伪随机整数
		System.out.println("rand.nextInt(26)："+random.nextInt(26));
		//生成一个处于long整数取值范围的伪随机整数
		System.out.println("rand.nextLong()"+random.nextLong());
	}

}
