package day03;

/*
	三种循环的区别
	1、for循环和while循环先判断条件是否成立，然后决定是否执行循环体（先判断后执行）
	2、do...while循环先执行一次循环体，然后判断条件是否成立，是否继续执行循环体
	（先执行后判断）
	3、for循环和while的区别
	条件控制语句所控制的自增变量，因为归属for循环的语法结构中，在for循环结束后，就不能再次被访
	问到了
	条件控制语句所控制的自增变量，对于while循环来说不归属其语法结构中，在while循环结束后，该变
	量还可以继续使用

	死循环（无限循环）的三种格式
	1. for(;;){}
	2. while(true){}
	3. do {} while(true);
 */
public class LoopTest {
    public static void main(String[] args) {
		/*
		//for循环【无输出】
		for(int i = 3; i<3; i++) {
			System.out.println("我爱Java");
		}
		System.out.println("--------");
		
		//while循环【无输出】
		int j = 3;
		while(j<3) {
			System.out.println("我爱Java");
			j++;
		}
		System.out.println("--------");
		
		//do...while循环【输出一次，先执行后判断】
		int k = 3;
		do {
			System.out.println("我爱Java");
			k++;
		}while(k<3);
		*/
		
		/*
		//for循环
		for(int i = 1; i<3; i++) {
			System.out.println("我爱Java");
		}
		//System.out.println(i);//报错，i在循环结束后释放内存空间
		System.out.println("--------");
		
		//while循环
		int j = 1;
		while(j<3) {
			System.out.println("我爱Java");
			j++;
		}
		System.out.println(j);//j在循环外声明，循环结束后仍有效
		System.out.println("--------");
		*/
		
		//死循环
		/*
		for(;;) {
			System.out.println("for");
		}
		*/
		
		/*
		while(true) {
			System.out.println("while");
		}
		*/
		
		do {
			System.out.println("do...while");
		}while(true);
		
		
    }
}