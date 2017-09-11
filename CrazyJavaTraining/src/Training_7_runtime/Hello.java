package Training_7_runtime;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * ���ʻ�����
 * @author nuts
 *
 */
public class Hello
{
	public static void main(String [] args)
	{
		 /* Locale ��Ӧ�ض��Ĺ��Һ�����
	         * ResourceBundle ���ڼ���һ����Դ��
	         * MessageFormat ���ڸ�ʽ����Ϣ
	         * �Է���ŷ�����ֽ��б���
	         * ��һ���½�һ��.properties �ļ� Ĭ�ϱ���Ϊiso-8859-1
	         * �ڶ�����key-value ���б�д�������棬��ʱ����ʾһ������ ��ʽ�磺username=�û���
	         * ���������½��ļ��޸ı���ΪUTF-8
	         * ���Ĳ�JDK�Դ�һ�����빤�߽�native2ascii.exe ����%JAVA_HEMO%/bin/�¿����ҵ�
	         * ��dos ������б���ɸ�ʽ�磺natice2ascii -encoding UTF-8 �ļ���ȫ��·��+�ļ��� ����ļ���ַ
	         * �������ļ��磺username=\u7528\u6237\u540d  �Ǳ�׼��UNICODE����
	         * ���岽�ѱ���*/
		//ȡ��ϵͳĬ�ϵĹ���/���Ի���
		Locale myLocale = Locale.getDefault();
		//����ָ���Ĺ���/���Ի���������Դ�ļ�
		ResourceBundle bundle = ResourceBundle.getBundle("Training_7_runtime.mess", myLocale);
		//��ӡ����Դ�ļ���ȡ�õ���Ϣ
		System.out.println(bundle.getString("hello"));
	}

}
