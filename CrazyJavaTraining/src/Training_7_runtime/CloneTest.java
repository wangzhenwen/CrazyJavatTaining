package Training_7_runtime;

class Address {
	String detail;

	public Address(String detail) {
      this.detail = detail;
	}
}
//实现Cloneable接口
class User implements Cloneable
{
  int age;
  Address address;
  public User(int age)
  {
	  this.age= age;
	  address=new Address("广州天河");
  }
  //通过调用super.clone() 来实现clone方法
  public User clone() throws CloneNotSupportedException
  {
	  return (User)super.clone();
  }
	}
/**
 * 对象拷贝测试
 * @author nuts
 *
 */
public class CloneTest {
 public static void main(String [] args) throws CloneNotSupportedException
 {
	 User u1 = new User(29);
	 //Clone得到u1对象的副本
	 User u2 = u1.clone();
	 System.out.println(u1==u2);
	 System.out.println(u1.address == u2.address);
 }
}
