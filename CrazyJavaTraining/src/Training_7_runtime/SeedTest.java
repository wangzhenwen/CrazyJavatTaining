package Training_7_runtime;

import java.util.Random;

/**
 * ���������ͬ����������������ͬ��α�������
 * 
 * @author nuts
 *
 */
public class SeedTest
{
	public static void main(String[] args)
	{

		Random r1 = new Random(50);
		System.out.println("��һ������Ϊ50��Random����");
		System.out.println("r1.nextBoolean():\t" + r1.nextBoolean());
		System.out.println("r1.nextInt():\t" + r1.nextInt());
		System.out.println("r1.nextDouble()��\t" + r1.nextDouble());
		System.out.println("r1.nextGaussian():\t" + r1.nextGaussian());
		System.out.println("--------------------------------------");
		Random r2 = new Random(50);
		System.out.println("�ڶ�������Ϊ50��Random����");
		System.out.println("r2.nextBoolean():\t" + r2.nextBoolean());
		System.out.println("r2.nextInt():\t" + r2.nextInt());
		System.out.println("r2.nextDouble()��\t" + r2.nextDouble());
		System.out.println("r2.nextGaussian():\t" + r2.nextGaussian());
		System.out.println("--------------------------------------");
		Random r3 = new Random(100);
		System.out.println("����������Ϊ50��Random����");
		System.out.println("r3.nextBoolean():\t" + r3.nextBoolean());
		System.out.println("r3.nextInt():\t" + r3.nextInt());
		System.out.println("r3.nextDouble()��\t" + r3.nextDouble());
		System.out.println("r3.nextGaussian():\t" + r3.nextGaussian());
		System.out.println("--------------------------------------");
		Random r4 = new Random(100);
		System.out.println("���ĸ�����Ϊ100��Random����");
		System.out.println("r4.nextBoolean():\t" + r4.nextBoolean());
		System.out.println("r4.nextInt():\t" + r4.nextInt());
		System.out.println("r4.nextDouble()��\t" + r4.nextDouble());
		System.out.println("r4.nextGaussian():\t" + r4.nextGaussian());
		System.out.println("--------------------------------------");
		Random r5 = new Random(System.currentTimeMillis());
		System.out.println("���������ΪSystem.currentTimeMillis()��Random����");
		System.out.println("r5.nextBoolean():\t" + r5.nextBoolean());
		System.out.println("r5.nextInt():\t" + r5.nextInt());
		System.out.println("r5.nextDouble()��\t" + r5.nextDouble());
		System.out.println("r5.nextGaussian():\t" + r5.nextGaussian());
	}

}
