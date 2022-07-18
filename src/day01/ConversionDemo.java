package day01;

/*
	类型转换
*/
public class ConversionDemo {
	public static void main(String[] args) {
		//自动类型转换
		double d = 10;
		System.out.println("int类型自动转换成double"+d);
		
		//定义byte类型的变量
		byte b = 10;
		short s = b;
		int i = b;
		System.out.println("byte类型自动转换成short"+s);
		System.out.println("byte类型自动转换成int"+i);
		
		//这是不可以的，类型不兼容，报错【java: 不兼容的类型: 从byte转换到char可能会有损失】
		//char c = b;

		//char类型自动向上转型，显示ACSII码
		char c='a';
		int m=c;
		double h=c;
		System.out.println("char类型自动转换成int"+m);
		System.out.println("char类型自动转换成double"+h);

		//short和char平级无法自动转化，报错【java: 不兼容的类型: 从char转换到short可能会有损失】
		//short p=c;
		//System.out.println(p);
		
		//强制类型转换,值存在损失，输出88
		int k = (int)88.88;
		System.out.println("double类型强制转换成int"+k);
	}
}