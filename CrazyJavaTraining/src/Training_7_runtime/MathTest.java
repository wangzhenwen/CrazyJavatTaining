package Training_7_runtime;

import org.omg.CORBA.SystemException;

/**
 * 数学工具类的使用
 * @author nuts
 *
 */
public class MathTest
{
    public static void main(String [] ags)
    {
    	/*--------------下面是三角运算-----------------*/
     //将弧度转换为角度
    	System.out.println("Math.toDegrees(1.57)"+Math.toDegrees(1.57));
    	//将角度转为弧度
    	System.out.println("Math.toRadians(90)"+Math.toRadians(90));
    	//计算反余弦，返回的角度范围在0.0到pi之间
    	System.out.println("Math.acos(0.8)"+Math.acos(0.8));
    	//计算反正弦，返回的角度范围在-pi/2到pi/2之间
        System.out.println("Math.asin(0.8)"+Math.asin(0.8));
        //计算反正切，返回的角度范围在 -pi/2到pi/2之间
        System.out.println("Math.atan(2.3)"+Math.atan(2.3));
        //计算三角余弦
        System.out.println("Math.cos(1.57)"+Math.cos(1.57));
        //计算双曲余弦
        System.out.println("Math.cosh(1.2):"+Math.cosh(1.2));
        //计算正弦
        System.out.println("Math.sin(1.57)"+Math.sin(1.57));
        //计算双曲正弦
        System.out.println("Math.sinh(1.2):"+Math.sinh(1.2));
        //计算三角正切
        System.out.println("Math.tan(0.8)"+Math.tan(0.8));
        //计算双曲正切
        System.out.println("Math.tanh(2.1)"+Math.tanh(2.1));
        //将矩形坐标(x,y) 转换成极坐标(r,thet)
        System.out.println("Math.atan2(0.1,0.2)"+Math.atan2(0.1,0.2));
        /*------------------下面是取整运算-----------------------*/
        //取整，返回小于目标数的最大整数
        System.out.println("Math.floor(-1.2)"+Math.floor(-1.2));
        //取整，返回大于目标数的最小整数
        System.out.println("Math.ceil(1.2)"+Math.ceil(1.2));
        //四舍五入取整
        System.out.println("Math.round(2.3)"+Math.round(2.3));
    }
}
