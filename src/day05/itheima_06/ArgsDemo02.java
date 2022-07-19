package day05.itheima_06;

/*
    对于引用类型的参数，形式参数的改变，影响实际参数的值
    引用数据类型的传参，传入的是地址值，内存中会造成两个引用指向同一个内存的效果，所以即使方法
弹栈，堆内存中的数据也已经是改变后的结果
 */
public class ArgsDemo02 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println("调用change方法前：" + arr[1]);
        change(arr);
        System.out.println("调用change方法后：" + arr[1]);
    }

    public static void change(int[] arr) {
        arr[1] = 200;
    }
}
