package com.Juc;

/**
 * @ClassName MyThread
 * @Description //TODO
 * @Author crazy402
 * @Date 2020/9/28 16:54
 * @Version 1.0
 **/
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("继承实现线程");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
