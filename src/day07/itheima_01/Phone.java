package day07.itheima_01;

/*
    ��Ķ���

    ��Ķ��岽�裺
        ������
        ��д��ĳ�Ա����
        ��д��ĳ�Ա����

    ����⣺���Ƕ������һ��������������Ϊ������ڵ�����
            ���Ƕ���ĳ��󣬶��������ʵ��

    �ֻ��ࣺ
        ������
        �ֻ�(Phone)

        ��Ա������[���з�����ı���]
        Ʒ��(brand)
        �۸�(price)

        ��Ա������
        ��绰(call)
        ������(sendMessage)
 */
public class Phone {
    //��Ա����
    String brand;
    int price;

    //��Ա����
    public void call() {
        System.out.println("��绰");
    }

    public void sendMessage() {
        System.out.println("������");
    }
}
