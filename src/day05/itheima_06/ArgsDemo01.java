package day05.itheima_06;

/*
    ���ڻ����������͵Ĳ�������ʽ�����ĸı䣬��Ӱ��ʵ�ʲ�����ֵ
    ÿ��������ջ�ڴ��У������ж�����ջ�ռ䣬�������н�����ͻᵯջ��ʧ
 */
public class ArgsDemo01 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("����change����ǰ��" + number);
        change(number);
        System.out.println("����change������" + number);
    }

    public static void change(int number) {
        number = 200;
    }
}
