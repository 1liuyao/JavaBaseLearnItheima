package day02;

/*
	��Ԫ�����
	
	��ʽ��
		��ϵ���ʽ ? ���ʽ1 : ���ʽ2;

	������
		a > b ? a : b;
	
	ִ�����̣�
		���ȼ����ϵ���ʽ��ֵ
		���ֵΪtrue�����ʽ1��ֵ����������
		���ֵΪfalse�����ʽ2��ֵ����������

    ע�⣺������Ԫ������Ľ�����뱻ʹ��
*/
public class OperatorDemo05 {
    public static void main(String[] args) {
        //������������
        int a = 10;
        int b = 20;

        //��ȡ���������еĽϴ�ֵ
        int max = a > b ? a : b;

        // a > b ? a : b;�������ʽ�Ľ�����뱻ʹ��

        //������
        System.out.println("max:" + max);
    }
}