package day02;

/*
	�ַ�����"+"����
*/
public class OperatorDemo03 {
	public static void main(String[] args) {
		System.out.println("it" + "heima");
		System.out.println("itheima" + 666);
		System.out.println(666 + "itheima");

		/*�ڡ�+�������У�����������ַ������������������,��������������㡣
		  ���������С�+������ʱ�����������ִ��
		 */
		System.out.println("����" + 6 + 66);
		System.out.println(1 + 99 + "�����");

		// ����ʹ��С���Ÿı���������ȼ�
		System.out.println(1 + 2 + "itheima" + (3 + 4));
	}
}