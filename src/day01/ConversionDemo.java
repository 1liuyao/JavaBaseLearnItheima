package day01;

/*
	����ת��
*/
public class ConversionDemo {
	public static void main(String[] args) {
		//�Զ�����ת��
		double d = 10;
		System.out.println("int�����Զ�ת����double"+d);
		
		//����byte���͵ı���
		byte b = 10;
		short s = b;
		int i = b;
		System.out.println("byte�����Զ�ת����short"+s);
		System.out.println("byte�����Զ�ת����int"+i);
		
		//���ǲ����Եģ����Ͳ����ݣ�����java: �����ݵ�����: ��byteת����char���ܻ�����ʧ��
		//char c = b;

		//char�����Զ�����ת�ͣ���ʾACSII��
		char c='a';
		int m=c;
		double h=c;
		System.out.println("char�����Զ�ת����int"+m);
		System.out.println("char�����Զ�ת����double"+h);

		//short��charƽ���޷��Զ�ת��������java: �����ݵ�����: ��charת����short���ܻ�����ʧ��
		//short p=c;
		//System.out.println(p);
		
		//ǿ������ת��,ֵ������ʧ�����88
		int k = (int)88.88;
		System.out.println("double����ǿ��ת����int"+k);
	}
}