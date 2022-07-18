package day02;

/*
	字符串的"+"操作
*/
public class OperatorDemo03 {
	public static void main(String[] args) {
		System.out.println("it" + "heima");
		System.out.println("itheima" + 666);
		System.out.println(666 + "itheima");

		/*在”+”操作中，如果出现了字符串，就是连接运算符,否则就是算术运算。
		  当连续进行“+”操作时，从左到右逐个执行
		 */
		System.out.println("黑马" + 6 + 66);
		System.out.println(1 + 99 + "年黑马");

		// 可以使用小括号改变运算的优先级
		System.out.println(1 + 2 + "itheima" + (3 + 4));
	}
}