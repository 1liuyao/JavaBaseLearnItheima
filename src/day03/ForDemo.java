package day03;

/*
	for��䡾�ʺ�ѭ��������ȷ�������

    ��ʽ��
        for(��ʼ�����;�����ж����;�����������) {
			ѭ�������;
		}

    ִ�����̣�
        1:ִ�г�ʼ����䣺������һ��Ҳ�����Ƕ���
		2:ִ�������ж���䣬��������true����false
            �����false��ѭ������
            �����true������ִ��
		3:ִ��ѭ�������
		4:ִ�������������
		5:�ص�2����

	ע�����������λ�ã��Ƿ���ѭ��������
					��ѭ���������ı�����ѭ����������ͷ��ڴ�

    ��ѭ����for(;;){}
 */
public class ForDemo {
    public static void main(String[] args) {
        //�����ڿ���̨���5��"HelloWorld"
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("--------");

        //��ѭ���Ľ�
        for (int i = 1; i <= 5; i++) {
            System.out.println("HelloWorld");
        }

    }
}