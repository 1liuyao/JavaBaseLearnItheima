package day02;

/*
	�����Լ������
*/
public class OperatorDemo04 {
    public static void main(String[] args) {
        //�������
        int i = 10;
        System.out.println("i:" + i);

        //����ʹ��
        //i++;
        //++i;
        //System.out.println("i:" + i);

        //�������ʹ��
        //���������ʱ��������ڱ����ĺ�ߣ����ñ���������������ñ�����++����--
        int j = i++;

        //���������ʱ��������ڱ�����ǰ�ߣ����ñ�����++����--�����ñ����������
        //int j = ++i;
        System.out.println("i:" + i);
        System.out.println("j:" + j);

        int x = 10;
        int y = x++ + x++ + x++;
        System.out.println(y);
    }
}
