package Training_7_runtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

/**
 * SimpleDateFormat�������
 * @author wangzhenwen
 *
 */
public class SimpleDateFormatTest {
  public static void main (String [] args)
  {
	  /**
	  SimpleDateFormat�����﷨��
	  
	  G �����־��
	  y ��
	  M ��
	  d ��
	  h ʱ ����������� (1~12)
	  H ʱ ��һ���� (0~23)
	  m ��
	  s ��
	  S ����
	  E ����
	  D һ���еĵڼ���
	  F һ���еڼ������ڼ�
	  w һ���еڼ�������
	  W һ���еڼ�������
	  a ���� / ���� ��Ƿ� 
	  k ʱ ��һ���� (1~24)
	  K ʱ ����������� (0~11)
	  z ʱ��
	 */
	  Date d = new Date();
	  //����һ��SimpleDateForamte����
	  SimpleDateFormat sdf1 = new SimpleDateFormat("Gyyyy�ĵ�D��");
	  //��d��ʽ��Ϊ���ڣ����:��Ԫ2007�е�xxx��
	  String datStr = sdf1.format(d);
	  System.out.println(datStr);
	  //һ���ǳ�����������ַ���
	  String str = "07###����##21";
	  SimpleDateFormat sdf2 = new SimpleDateFormat("y###MMM##d");
	  //�������ַ�������������,
	  try {
		System.out.print(sdf2.parse(str));
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMdd");
	
	  Date nowdate  = new Date();
	  String nowdates=sdf3.format(nowdate);
	  System.out.println(nowdates);
  }
}
