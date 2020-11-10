package com.Juc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName MyCallable
 * @Description //TODO
 * @Author crazy402
 * @Date 2020/9/28 16:50
 * @Version 1.0
 **/
public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        return "实现Callable接口";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable callable = new MyCallable();
        //Callable有返回值 可以通过FutureTask进行封装
        FutureTask futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());
    }
}
