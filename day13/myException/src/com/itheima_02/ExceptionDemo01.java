package com.itheima_02;

/*
    try {
        ���ܳ����쳣�Ĵ���;
    } catch(�쳣���� ������) {
        �쳣�Ĵ������;
    }

    ִ�����̣������try����Ĵ��뿪ʼִ��
    �����쳣�󣬻��Զ�����һ���쳣����󣬸��쳣������ύ��Java����ʱϵͳ
    ��Java����ʱϵͳ���յ��쳣����ʱ���ᵽcatch��ȥ��ƥ����쳣�࣬�ҵ�������쳣�Ĵ���
    ִ����Ϻ󣬳��򻹿��Լ�������ִ��

    ��䣺try{}
         catch{}
         finally{}
    ��䣺try{}
         finally{}

    finally���������
    ��1�����ۺ����Ƿ����쳣���Ƿ���ǰreturn��������������ִ��finally���
    ��2��ͨ��ʹ�����۳������ִ�У��Ƿ����쳣����һ��Ҫ�ر���Դ����������磬�����ݿⴴ�����ӣ����������Ƿ�����ɹ���һ��Ҫ�ر���Դ
    ��3��try{}finally{}������ֻΪ�ر��ͷ���Դ��
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        System.out.println("��ʼ");
        method();
        System.out.println("����");
    }

    //����������쳣������������ʱJVM���ӡ������Ϣ��Ȼ��ͣ������
    //���ڲ������쳣�����������
    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
            System.out.println("�����ܹ����ʵ���");
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("����ʵ��������������ڣ����ȥ�޸�Ϊ��ȷ������");
            e.printStackTrace();
        }
    }
}
