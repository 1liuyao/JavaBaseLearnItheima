package day06;

/*
    Debug：
        是供程序员使用的程序调试工具，它可以用于查看程序的执行流程，也可以用于追踪程序执行过程来调试程序。
        Debug调试，又被称为断点调试，断点其实是一个标记，告诉我们从哪里开始查看。

    Debug操作流程：
        1:如何加断点
        2:如何运行加了断点的程序
        3:看哪里
        4:点哪里
        5:如何删除断点

    debug基本用法：
    Step over（F8）：一行一行的执行，不会进入方法内部
    Step into（F7）：一行一行的执行，可进入自定义方法，不会进入官方类库
    Force Step into：强制进入，可以进入任何方法，查看底层源码时可进入官方类库
    Step out：步出，从步入的方法内退出到方法调用处，此时方法已执行完毕，只是没有完成赋值
    Run to Cursor：运行到光标处，将光标置于需要查看的那一行代码，使用此功能代码会运行到
                   光标行，无需打断点
 */
public class DebugDemo {
    public static void main(String[] args) {
        //定义两个变量
        int i = 10;
        int j = 20;

        //求和
        int sum = i + j;

        //输出结果
        System.out.println("sum:" + sum);
    }
}
