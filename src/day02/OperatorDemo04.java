package day02;

/*
	自增自减运算符
*/
public class OperatorDemo04 {
    public static void main(String[] args) {
        //定义变量
        int i = 10;
        System.out.println("i:" + i);

        //单独使用
        //i++;
        //++i;
        //System.out.println("i:" + i);

        //参与操作使用
        //参与操作的时候，如果放在变量的后边，先拿变量参与操作，后拿变量做++或者--
        int j = i++;

        //参与操作的时候，如果放在变量的前边，先拿变量做++或者--，后拿变量参与操作
        //int j = ++i;
        System.out.println("i:" + i);
        System.out.println("j:" + j);

        int x = 10;
        int y = x++ + x++ + x++;
        System.out.println(y);
    }
}
