package com.itheima_04;

/*
    void join()：等待这个线程死亡，一个线程调用该方法，其他线程必须等这个线程执行完毕才能获得CPU执行权
    当A线程执行到了B线程的.join()方法时，A就会等待，等B线程都执行完，A才会执行
    join可以用来临时加入线程执行
 */
public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();

        tj1.setName("康熙");
        tj2.setName("四阿哥");
        tj3.setName("八阿哥");

        tj1.start();
        try {
            tj1.join();//主线程执行到此，等待tj1执行完后，才能继续执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tj2.start();
        tj3.start();
    }
}
