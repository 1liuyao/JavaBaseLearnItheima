package day03;

/*
	for语句【适合循环次数明确的情况】

    格式：
        for(初始化语句;条件判断语句;条件控制语句) {
			循环体语句;
		}

    执行流程：
        1:执行初始化语句：可以是一条也可以是多条
		2:执行条件判断语句，看其结果是true还是false
            如果是false，循环结束
            如果是true，继续执行
		3:执行循环体语句
		4:执行条件控制语句
		5:回到2继续

	注意变量声明的位置：是否在循环外声明
					在循环内声明的变量在循环结束后就释放内存

    死循环：for(;;){}
 */
public class ForDemo {
    public static void main(String[] args) {
        //需求：在控制台输出5次"HelloWorld"
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("--------");

        //用循环改进
        for (int i = 1; i <= 5; i++) {
            System.out.println("HelloWorld");
        }

    }
}