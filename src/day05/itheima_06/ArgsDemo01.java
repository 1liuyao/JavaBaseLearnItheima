package day05.itheima_06;

/*
    对于基本数据类型的参数，形式参数的改变，不影响实际参数的值
    每个方法在栈内存中，都会有独立的栈空间，方法运行结束后就会弹栈消失
 */
public class ArgsDemo01 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前：" + number);
        change(number);
        System.out.println("调用change方法后：" + number);
    }

    public static void change(int number) {
        number = 200;
    }
}
