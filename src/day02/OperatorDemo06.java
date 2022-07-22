package day02;

/*
	关系运算符有6种关系，分别为小于、小于等于、大于、等于、大于等于、不等于。
	注意:关系运算符的结果都是boolean类型，要么是true，要么是false。
*/
public class OperatorDemo06 {
    public static void main(String[] args) {
        //定义变量
        int i = 10;
        int j = 20;
        int k = 10;

        //==
        System.out.println(i == j);
        System.out.println(i == k);

        //不同数值类型之间比较，只比较数值
        System.out.println("不同基本数据类型之间比较" + (10 == 10.0));
        System.out.println("--------");

        //!=
        System.out.println(i != j);
        System.out.println(i != k);
        System.out.println("--------");

        //>
        System.out.println(i > j);
        System.out.println(i > k);
        System.out.println("--------");

        //>=
        System.out.println(i >= j);
        System.out.println(i >= k);
        System.out.println("--------");

        //不小心把==写成了=,"=="是判断是否相等的关系，"="是赋值。
        //把j的值赋值给了i，然后输出i的值
        System.out.println(i = j);
    }
}