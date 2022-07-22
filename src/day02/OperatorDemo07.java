package day02;

/*
	逻辑运算符:把各个运算的[关系表达式]连接起来组成一个复杂的逻辑表达式，以判断程序中的表达式是否成立，判断
的结果是 true 或 false。
*/
class OperatorDemo07 {
    public static void main(String[] args) {
        //定义变量
        int i = 10;
        int j = 20;
        int k = 30;

        //& 有false则false
        System.out.println((i > j) & (i > k)); //false & false
        System.out.println((i < j) & (i > k)); //true & false
        System.out.println((i > j) & (i < k)); //false & true
        System.out.println((i < j) & (i < k)); //true & true
        System.out.println("--------");

        //| 有true则true
        System.out.println((i > j) | (i > k)); //false | false
        System.out.println((i < j) | (i > k)); //true | false
        System.out.println((i > j) | (i < k)); //false | true
        System.out.println((i < j) | (i < k)); //true | true
        System.out.println("--------");

        //^ 相同为false，不同为true
        System.out.println((i > j) ^ (i > k)); //false ^ false
        System.out.println((i < j) ^ (i > k)); //true ^ false
        System.out.println((i > j) ^ (i < k)); //false ^ true
        System.out.println((i < j) ^ (i < k)); //true ^ true
        System.out.println("--------");

        //!
        System.out.println((i > j)); //false
        System.out.println(!(i > j)); //!false
        System.out.println(!!(i > j)); //!!false
        System.out.println(!!!(i > j)); //!!!false
    }
}