package day02;

/*
	��·�߼������[��Ч�浥�뵥��]

	�߼���&�����������٣��ұ߶�Ҫִ�С�
	��·��&&��������Ϊ�棬�ұ�ִ�У�������Ϊ�٣��ұ߲�ִ�С�

	�߼���|�����������٣��ұ߶�Ҫִ�С�
	��·��||��������Ϊ�٣��ұ�ִ�У�������Ϊ�棬�ұ߲�ִ�С�

	��õ��������&& || ��
*/
class OperatorDemo08 {
	public static void main(String[] args) {
		//�������
		int i = 10;
		int j = 20;
		int k = 30;
		
		//&& ��false��false
		System.out.println((i > j) && (i > k)); //false && false
		System.out.println((i < j) && (i > k)); //true && false
		System.out.println((i > j) && (i < k)); //false && true
		System.out.println((i < j) && (i < k)); //true && true
		System.out.println("--------");
		
		//|| ��true��true
		System.out.println((i > j) || (i > k)); //false || false
		System.out.println((i < j) || (i > k)); //true || false
		System.out.println((i > j) || (i < k)); //false || true
		System.out.println((i < j) || (i < k)); //true || true
		System.out.println("--------");
		
		//&&��&
		//System.out.println((i++ > 100) & (j++ > 100)); //false & false
		System.out.println((i++ > 100) && (j++ > 100)); //false && false
		System.out.println("i:" + i);//11
		System.out.println("j:" + j);//20,&&����ʽδ�������㣬δ++

		int x = 3;
		int y = 4;
		System.out.println((x++ > 4) & (y++ > 5)); // ������ﶼ������
		System.out.println(x); // 4
		System.out.println(y); // 5
		System.out.println((x++ > 4) && (y++ > 5)); // ����Ѿ�����ȷ�����Ϊfalse���ұ߲���������
		System.out.println(x); // 5
		System.out.println(y); // 5
	}
}