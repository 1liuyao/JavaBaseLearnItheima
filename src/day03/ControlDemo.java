package day03;

/*
	continue:用在循环中，基于条件控制，跳过某次循环体内容的执行，继续下一次的执行
	break:用在循环中，基于条件控制，终止循环体内容的执行，也就是说结束当前的整个循环

	注意：1、break 和 continue后面无需定义其他语句，因为执行不到，会报错
		 2、continue只用于循环结构
		 3、break用于switch语句和循环结构

*/
public class ControlDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                //continue;//输出 1 3 5
                break;//输出 1
            }

            System.out.println(i);
        }
    }
}