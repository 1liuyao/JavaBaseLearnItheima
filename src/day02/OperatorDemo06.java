package day02;

/*
	��ϵ�������6�ֹ�ϵ���ֱ�ΪС�ڡ�С�ڵ��ڡ����ڡ����ڡ����ڵ��ڡ������ڡ�
	ע��:��ϵ������Ľ������boolean���ͣ�Ҫô��true��Ҫô��false��
*/
public class OperatorDemo06 {
    public static void main(String[] args) {
        //�������
        int i = 10;
        int j = 20;
        int k = 10;

        //==
        System.out.println(i == j);
        System.out.println(i == k);

        //��ͬ��ֵ����֮��Ƚϣ�ֻ�Ƚ���ֵ
        System.out.println("��ͬ������������֮��Ƚ�" + (10 == 10.0));
        System.out.println("--------");

        //!=
        System.out.println(i != j);
        System.out.println(i != k);
        System.out.println("--------");

        //>
        System.out.println(i > j);
        System.out.println(i > k);
        System.out.println("--------");

        //>=
        System.out.println(i >= j);
        System.out.println(i >= k);
        System.out.println("--------");

        //��С�İ�==д����=,"=="���ж��Ƿ���ȵĹ�ϵ��"="�Ǹ�ֵ��
        //��j��ֵ��ֵ����i��Ȼ�����i��ֵ
        System.out.println(i = j);
    }
}