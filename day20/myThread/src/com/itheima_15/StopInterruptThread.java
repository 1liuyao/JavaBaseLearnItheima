package com.itheima_15;
/*
    stop方法已经过时，那么如何停止线程呢？
    只有一种方法，就是run方法执行结束

    开启多线程运行，运行代码通常是循环结构
    只要控制住循环，就可以让run方法结束，也就是线程结束

    以下代码中run只包含while循环，不包含对线程的wait操作

 */

public class StopInterruptThread {
    public static void main(String[] args) {
        StopThread st=new StopThread();

        Thread t1=new Thread(st);
        Thread t2=new Thread(st);

        t1.start();
        t2.start();

        int num=0;

        while(true){
            if (num++==60){
                st.setFlag();//更改flag后，run中的while循环条件为假，则run方法结束执行，线程结束
                break;
            }
            System.out.println(Thread.currentThread().getName()+"...main");
        }
    }
}
class StopThread implements Runnable{
    private boolean flag=true;//通过定义循环标记控制run中while的执行
    @Override
    public void run() {
        while (flag){
            System.out.println(Thread.currentThread().getName()+"...run");
        }
    }
    public void setFlag(){
        flag=false;
    }
}