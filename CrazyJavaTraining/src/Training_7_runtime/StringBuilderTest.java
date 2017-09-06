package Training_7_runtime;
/**
 * StringBulder类测试
 * @author nuts
 *
 */
public class StringBuilderTest
{
  public static void main(String [] args)
  {
	  StringBuilder sBuilder  = new StringBuilder();
	  //追加字符串
	  sBuilder.append("java"); //sBuilder ="java";
	  //插入
	  sBuilder.insert(0, "hello  ");//sBuilder = "hello  java";
	  //替换  含头不含尾
	  sBuilder.replace(5, 6, ","); //sBuilder ="hello, java";
	  System.out.println(sBuilder.toString());
	  //删除  含头不含尾
	  sBuilder.delete(5, 7);
	  System.out.println(sBuilder.toString());
	  //反转
	  sBuilder.reverse();
	  System.out.println(sBuilder);
	  System.out.println(sBuilder.length()); //输出9 内部字符序列长度
	  System.out.println(sBuilder.capacity()); //容器长度
	  //改变StringBuilder的长度，只保留前面部分
	  sBuilder.setLength(5);
	  System.out.println(sBuilder);
  }
}
