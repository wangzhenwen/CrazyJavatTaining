package Training_15_InOut;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * �ӿ���̨�������룬����ӡ������̨
 * @author nuts
 *
 */
public class KeyInTest
{
	public static void main(String[] args)
	{
		//��System.in����ת����Reader����
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		//����ͨ��Reader�����װ��BufferedReader
		BufferedReader bReader = new BufferedReader(inputStreamReader);
		String buff = "";
		try
		{   //����ѭ����ʽ�����еض�ȡ
			System.out.print("��ͨ����������һ������:");
			while ((buff = bReader.readLine()) != null)
			{
				//����������exit���˳�����
				if(buff.equals("exit"))
					break;
				//��ӡ��ȡ������
                System.out.println("�������������:"+buff);
                System.out.print("��ͨ����������һ������:");
                
			}
			System.out.println("�������");
		} catch (Exception exception)
		{
			System.out.println(exception);
		}
	}
}
