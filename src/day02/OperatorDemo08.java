package day02;

/*
	短路逻辑运算符[高效版单与单或]

	逻辑与&，无论左边真假，右边都要执行。
	短路与&&，如果左边为真，右边执行；如果左边为假，右边不执行。

	逻辑或|，无论左边真假，右边都要执行。
	短路或||，如果左边为假，右边执行；如果左边为真，右边不执行。

	最常用的运算符：&& || ！
*/
class OperatorDemo08 {
	public static void main(String[] args) {
		//定义变量
		int i = 10;
		int j = 20;
		int k = 30;
		
		//&& 有false则false
		System.out.println((i > j) && (i > k)); //false && false
		System.out.println((i < j) && (i > k)); //true && false
		System.out.println((i > j) && (i < k)); //false && true
		System.out.println((i < j) && (i < k)); //true && true
		System.out.println("--------");
		
		//|| 有true则true
		System.out.println((i > j) || (i > k)); //false || false
		System.out.println((i < j) || (i > k)); //true || false
		System.out.println((i > j) || (i < k)); //false || true
		System.out.println((i < j) || (i < k)); //true || true
		System.out.println("--------");
		
		//&&和&
		//System.out.println((i++ > 100) & (j++ > 100)); //false & false
		System.out.println((i++ > 100) && (j++ > 100)); //false && false
		System.out.println("i:" + i);//11
		System.out.println("j:" + j);//20,&&后表达式未参与运算，未++

		int x = 3;
		int y = 4;
		System.out.println((x++ > 4) & (y++ > 5)); // 两个表达都会运算
		System.out.println(x); // 4
		System.out.println(y); // 5
		System.out.println((x++ > 4) && (y++ > 5)); // 左边已经可以确定结果为false，右边不参与运算
		System.out.println(x); // 5
		System.out.println(y); // 5
	}
}