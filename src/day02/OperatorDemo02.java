package day02;

/*
	�ַ���"+"����
*/
public class OperatorDemo02 {
	public static void main(String[] args) {
		//������������
		int i = 10;
		char c = 'A'; //'A'��ֵ��65
		c = 'a'; //'a'��ֵ��97
		c = '0'; //'0'��ֵ��48
		System.out.println(i + c);
		
		//char ch = i + c;
		//char���ͻᱻ�Զ�����Ϊint����,��ʽ�ұ���int�ͣ���ʽ�����char����ǿת�ᱨ��
		int j = i + c;
		System.out.println(j);

		//byte���ͣ�short���ͺ�char���ͽ���������int���ͣ������Ƿ����������Ͳ������㡣
		System.out.println("char���ͺ�double���Ͳ���������Ϊint��"+c+10.0);

		byte b1 = 10;
		byte b2 = 20;
		// byte b3 = b1 + b2;
		// ���б�����Ϊbyte���Ͳ�������������Զ���ʾΪint��int��ֵ��byte������ʧ����

		int i3 = b1 + b2; // Ӧ��ʹ��int����
		byte b3 = (byte) (b1 + b2); // ���߽����ǿ��ת��Ϊbyte����
		System.out.println(b3);
		
		//int k = 10 + 13.14;
		//��ʽ�ұ߾������������Ϊdouble���ͣ���ʽ���Ϊint����ǿת
		double d = 10 + 13.14;
		System.out.println(d);
	}
}