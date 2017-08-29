package Training_7_runtime;

import java.math.BigDecimal;


/**
 * ���㹤����
 * @author nuts
 *
 */
public class Arith
{
	//Ĭ�ϳ������㾫��
   private static final int DEF_DIV_SCALE=10;
   //������˽�л���������಻��ʵ����
   private Arith() {}
   /**
    * �ṩ��ȷ�ļӷ�����
    * @param v1 ������
    * @param v2 ����
    * @return   ���������ĺ�
    */
   public static double add(double v1,double v2)
   {
	   BigDecimal b1 = BigDecimal.valueOf(v1);
	   BigDecimal b2 = BigDecimal.valueOf(v2);
	   return b1.add(b2).doubleValue();
   }
   /**
    * �ṩ��ȷ�ļ�������
    * @param v1 ������
    * @param v2 ����
    * @return  ���������Ĳ�
    */
   public static double sub(double v1,double v2)
   {
	   BigDecimal b1 = BigDecimal.valueOf(v1);
	   BigDecimal b2 = BigDecimal.valueOf(v2);
	   return b1.subtract(b2).doubleValue();
   }
   /**
    * �ṩ��׼�ĳ˷�����
    * @param v1 ������
    * @param v2 ����
    * @return ���������Ļ�
    */
   public static double mul(double v1,double v2)
   {
	   BigDecimal b1 = BigDecimal.valueOf(v1);
	   BigDecimal b2 = BigDecimal.valueOf(v2);
	   return b1.multiply(b2).doubleValue();
   }
   /**
    * �ṩ(���)��ȷ�ĳ������㣬�����������������ʱ��
    * ��ȷ��С�����Ժ�10λ��������������
    * @param v1 ������
    * @param v2 ����
    * @return ����������
    */
   public static double div(double v1,double v2)
   {
	   BigDecimal b1 = BigDecimal.valueOf(v1);
	   BigDecimal b2 = BigDecimal.valueOf(v2);
	   return b1.divide(b2,DEF_DIV_SCALE,BigDecimal.ROUND_HALF_UP).doubleValue();
   }
   public static void main(String [] args)
   {
	   System.out.println("0.05+0.01="+Arith.add(0.05, 0.01));
	   System.out.println("1.0-0.42="+Arith.sub(1.0, 0.42));
	   System.out.println("4.015*100="+Arith.mul(4.015, 100));
	   System.out.println("123.3/100="+Arith.div(123.3, 100));
   }
}
