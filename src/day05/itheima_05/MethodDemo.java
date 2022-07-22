package day05.itheima_05;

/*
    方法重载：
        多个方法在【同一个类】中
        多个方法具有相同的方法名
        多个方法的参数不相同，类型不同或者数量不同

        注意：重载仅对应方法的定义，与方法的调用无关，调用方式参照标准格式
             重载仅针对同一个类中方法的名称与参数进行识别，与返回值无关，
             换句话说不能通过返回值来判定两个方法是否相互构成重载
 */
public class MethodDemo {
    public static void main(String[] args) {
        //调用方法
        int result = sum(10, 20);
        System.out.println(result);

        double result2 = sum(10.0, 20.0);
        System.out.println(result2);

        int result3 = sum(10, 20, 30);
        System.out.println(result3);
    }

    //需求1：求两个int类型数据和的方法
    public static int sum(int a, int b) {
        return a + b;
    }

    //需求2：求两个double类型数据和的方法
    public static double sum(double a, double b) {
        return a + b;
    }

    //需求3：求三个int类型数据和的方法
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

}
