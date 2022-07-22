package day05.itheima_04;

/*
    方法注意事项：
        方法不能嵌套定义
        void表示无返回值，可以省略return，也可以单独的书写return，后面不加数据
        return后无语句，因为执行不到，报错

    方法的通用格式：
        public static 返回值类型 方法名(参数) {
            方法体;
            return 数据 ;
        }
    （1）public static 修饰符
    （2）返回值类型：方法操作完毕之后返回的数据的数据类型
                  void类型的方法，直接调用即可
                  非void类型的方法，推荐用变量接收调用
    （3）方法名：调用方法时候使用的标识
    （4）参数：由数据类型和变量名组成，多个参数之间用逗号隔开
    （5）方法体：完成功能的代码块
    （6）return：如果方法操作完毕，有数据返回，用于把数据返回给调用者
 */
public class MethodDemo {
    public static void main(String[] args) {

    }

    public static void methodOne() {

    }

    public static void methodTwo() {
        //return 100;

        return;

        //System.out.println(100);
    }

}
