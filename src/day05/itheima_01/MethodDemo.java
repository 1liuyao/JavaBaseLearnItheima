package day05.itheima_01;

/*
    方法：是将具有独立功能的代码块组织成为一个整体，使其具有特殊功能的代码集

    定义格式：
        public static void 方法名 ( ) {
	        //方法体
	    }

	调用格式：
	    方法名();

	注意：方法需要先定义，后调用，被调用的方法需要保证先存在
	总结：每个方法在被调用执行的时候，都会进入栈内存，并且拥有自己独立的内存空间，方法内部代码调用
完毕之后，会从栈内存中弹栈消失。
 */
public class MethodDemo {
    public static void main(String[] args) {
        //调用方法
        isEvenNumber();
    }

    //需求：定义一个方法，在方法中定义一个变量，判断该数据是否是偶数
    public static  void isEvenNumber() {
        //定义变量
        int number = 10;
        number = 9;

        //判断该数据是否是偶数
        if(number%2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
