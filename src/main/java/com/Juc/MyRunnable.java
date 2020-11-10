package com.Juc;

/**
 * @ClassName MyRunnable
 * @Description //TODO
 * @Author crazy402
 * @Date 2020/9/28 16:47
 * @Version 1.0
 **/
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("这是继承Runnable接口实现的线程");
    }

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
