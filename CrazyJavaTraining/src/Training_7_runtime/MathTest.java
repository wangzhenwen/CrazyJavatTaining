package Training_7_runtime;

import org.omg.CORBA.SystemException;

/**
 * ��ѧ�������ʹ��
 * @author nuts
 *
 */
public class MathTest
{
    public static void main(String [] ags)
    {
    	/*--------------��������������-----------------*/
     //������ת��Ϊ�Ƕ�
    	System.out.println("Math.toDegrees(1.57)"+Math.toDegrees(1.57));
    	//���Ƕ�תΪ����
    	System.out.println("Math.toRadians(90)"+Math.toRadians(90));
    	//���㷴���ң����صĽǶȷ�Χ��0.0��pi֮��
    	System.out.println("Math.acos(0.8)"+Math.acos(0.8));
    	//���㷴���ң����صĽǶȷ�Χ��-pi/2��pi/2֮��
        System.out.println("Math.asin(0.8)"+Math.asin(0.8));
        //���㷴���У����صĽǶȷ�Χ�� -pi/2��pi/2֮��
        System.out.println("Math.atan(2.3)"+Math.atan(2.3));
        //������������
        System.out.println("Math.cos(1.57)"+Math.cos(1.57));
        //����˫������
        System.out.println("Math.cosh(1.2):"+Math.cosh(1.2));
        //��������
        System.out.println("Math.sin(1.57)"+Math.sin(1.57));
        //����˫������
        System.out.println("Math.sinh(1.2):"+Math.sinh(1.2));
        //������������
        System.out.println("Math.tan(0.8)"+Math.tan(0.8));
        //����˫������
        System.out.println("Math.tanh(2.1)"+Math.tanh(2.1));
        //����������(x,y) ת���ɼ�����(r,thet)
        System.out.println("Math.atan2(0.1,0.2)"+Math.atan2(0.1,0.2));
        /*------------------������ȡ������-----------------------*/
        //ȡ��������С��Ŀ�������������
        System.out.println("Math.floor(-1.2)"+Math.floor(-1.2));
        //ȡ�������ش���Ŀ��������С����
        System.out.println("Math.ceil(1.2)"+Math.ceil(1.2));
        //��������ȡ��
        System.out.println("Math.round(2.3)"+Math.round(2.3));
    }
}
