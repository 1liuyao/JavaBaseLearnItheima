package day03;

/*
	continue:����ѭ���У������������ƣ�����ĳ��ѭ�������ݵ�ִ�У�������һ�ε�ִ��
	break:����ѭ���У������������ƣ���ֹѭ�������ݵ�ִ�У�Ҳ����˵������ǰ������ѭ��

	ע�⣺1��break �� continue�������趨��������䣬��Ϊִ�в������ᱨ��
		 2��continueֻ����ѭ���ṹ
		 3��break����switch����ѭ���ṹ

*/
public class ControlDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                //continue;//��� 1 3 5
                break;//��� 1
            }

            System.out.println(i);
        }
    }
}