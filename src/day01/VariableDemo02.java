package day01;

/*
	变量使用的注意事项：
		名字不能重复
		变量未赋值，不能使用
		long类型的变量定义的时候，为了防止整数过大，后面要加L
		float类型的变量定义的时候，为了防止类型不兼容，后面要加F
*/
/*
	标识符常见命名规定：
	【变量、方法】小驼峰：name，myName
	【类】大驼峰：Name,MyName
 */
public class VariableDemo02 {
	public static void main(String[] args) {
		//定义byte类型的变量
		byte b = 10;
		System.out.println(b);
		
		//定义short类型的变量
		short s = 100;
		System.out.println(s);
		
		//定义int类型的变量
		int i = 10000;
		System.out.println(i);
		
		//定义double类型的变量
		double d = 13.14;
		System.out.println(d);
		
		//定义char类型的变量
		char c = 'a';
		System.out.println(c+"jj");
		
		//定义boolean类型的变量
		//boolean b = true;
		//System.out.println(b);
		boolean bb = true;
		System.out.println(bb);
		System.out.println("--------");
		
		//定义long类型的变量
		/*若未加L，java默认整数为int型，在未超出int范围时，可实现向上强转
		  若超出int范围，会报错[java: 过大的整数: 10000000000]
		  若未超出int范围，则不会报错，自动实现向上转型
		*/
		long l = 10000000000L;
		System.out.println(l);
		System.out.println("--------");
		
		//定义float类型的变量
		/*若不加F，java默认小数为double类型，向下转型，未进行强转，直接赋值
		  报错java: 不兼容的类型: 从double转换到float可能会有损失
		  float f = (float) 13.14，向下强转可解决问题
		 */
		float f = 13.14F;
		System.out.println(f);
	}	
}









