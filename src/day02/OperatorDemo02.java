package day02;

/*
	字符的"+"操作
*/
public class OperatorDemo02 {
	public static void main(String[] args) {
		//定义两个变量
		int i = 10;
		char c = 'A'; //'A'的值是65
		c = 'a'; //'a'的值是97
		c = '0'; //'0'的值是48
		System.out.println(i + c);
		
		//char ch = i + c;
		//char类型会被自动提升为int类型,等式右边是int型，等式左边是char，不强转会报错
		int j = i + c;
		System.out.println(j);

		//byte类型，short类型和char类型将被提升到int类型，不管是否有其他类型参与运算。
		System.out.println("char类型和double类型参与运算仍为int型"+c+10.0);

		byte b1 = 10;
		byte b2 = 20;
		// byte b3 = b1 + b2;
		// 该行报错，因为byte类型参与算术运算会自动提示为int，int赋值给byte可能损失精度

		int i3 = b1 + b2; // 应该使用int接收
		byte b3 = (byte) (b1 + b2); // 或者将结果强制转换为byte类型
		System.out.println(b3);
		
		//int k = 10 + 13.14;
		//等式右边经过算数运算后为double类型，等式左边为int，需强转
		double d = 10 + 13.14;
		System.out.println(d);
	}
}