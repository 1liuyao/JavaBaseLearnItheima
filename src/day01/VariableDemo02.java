package day01;

/*
	����ʹ�õ�ע�����
		���ֲ����ظ�
		����δ��ֵ������ʹ��
		long���͵ı��������ʱ��Ϊ�˷�ֹ�������󣬺���Ҫ��L
		float���͵ı��������ʱ��Ϊ�˷�ֹ���Ͳ����ݣ�����Ҫ��F
*/
/*
	��ʶ�����������涨��
	��������������С�շ壺name��myName
	���ࡿ���շ壺Name,MyName
 */
public class VariableDemo02 {
	public static void main(String[] args) {
		//����byte���͵ı���
		byte b = 10;
		System.out.println(b);
		
		//����short���͵ı���
		short s = 100;
		System.out.println(s);
		
		//����int���͵ı���
		int i = 10000;
		System.out.println(i);
		
		//����double���͵ı���
		double d = 13.14;
		System.out.println(d);
		
		//����char���͵ı���
		char c = 'a';
		System.out.println(c+"jj");
		
		//����boolean���͵ı���
		//boolean b = true;
		//System.out.println(b);
		boolean bb = true;
		System.out.println(bb);
		System.out.println("--------");
		
		//����long���͵ı���
		/*��δ��L��javaĬ������Ϊint�ͣ���δ����int��Χʱ����ʵ������ǿת
		  ������int��Χ���ᱨ��[java: ���������: 10000000000]
		  ��δ����int��Χ���򲻻ᱨ���Զ�ʵ������ת��
		*/
		long l = 10000000000L;
		System.out.println(l);
		System.out.println("--------");
		
		//����float���͵ı���
		/*������F��javaĬ��С��Ϊdouble���ͣ�����ת�ͣ�δ����ǿת��ֱ�Ӹ�ֵ
		  ����java: �����ݵ�����: ��doubleת����float���ܻ�����ʧ
		  float f = (float) 13.14������ǿת�ɽ������
		 */
		float f = 13.14F;
		System.out.println(f);
	}	
}









