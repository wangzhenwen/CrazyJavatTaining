package Training_7_runtime;

import java.util.Scanner;

/**
 * ���տͻ��������룬����ӡ������̨
 * @author nuts
 *
 */
public class ScannerKeyBoardTest
{
	public static void main(String [] args)
	{
		//System.in�����׼����,���Ǽ�������
		Scanner scanner = new Scanner(System.in);
		//��������һ�н�ֻ�ѻس���Ϊ�ָ���
		scanner.useDelimiter("\n");
		//�ж��Ƿ�����һ��������
		while(scanner.hasNext())
		{
			System.out.println("���������������:"+scanner.next());
		}

	}

}
