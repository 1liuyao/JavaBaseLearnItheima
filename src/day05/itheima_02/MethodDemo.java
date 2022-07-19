package day05.itheima_02;

/*
    带参数方法的定义和调用

    定义格式：
        public static void 方法名(参数1,参数2) { … … }

	调用格式：
        方法名(参数1,参数2);

    形参：方法定义中的参数，等同于变量定义格式，例如：int number
    实参：方法调用中的参数，等同于使用变量或常量，例如： 10 number


    方法定义时，参数中的数据类型与变量名都不能缺少，缺少任意一个程序将报错
    方法调用时，参数的数量与类型必须与方法定义中的设置相匹配，否则程序将报错
 */
public class MethodDemo {
    public static void main(String[] args) {
        //常量值的调用
        isEvenNumber(10);

        //变量的调用
        int number = 10;
        isEvenNumber(number);
    }

    //需求：定义一个方法，该方法接收一个参数，判断该数据是否是偶数
    public static void isEvenNumber(int number) {
        if(number%2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
