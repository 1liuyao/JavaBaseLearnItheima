package day05.itheima_06;

/*
    �����������͵Ĳ�������ʽ�����ĸı䣬Ӱ��ʵ�ʲ�����ֵ
    �����������͵Ĵ��Σ�������ǵ�ֵַ���ڴ��л������������ָ��ͬһ���ڴ��Ч�������Լ�ʹ����
��ջ�����ڴ��е�����Ҳ�Ѿ��Ǹı��Ľ��
 */
public class ArgsDemo02 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println("����change����ǰ��" + arr[1]);
        change(arr);
        System.out.println("����change������" + arr[1]);
    }

    public static void change(int[] arr) {
        arr[1] = 200;
    }
}
