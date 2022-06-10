package com.asleepyfish.java.thread;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @Author: zhoujh42045
 * @Date: 2022/6/10 15:23
 * @Description: 多线程
 */
class FixedThreadPool {
    public static class FixedThreadPool1 {
        public static void main(String[] args) throws ExecutionException, InterruptedException {
            ExecutorService es = Executors.newFixedThreadPool(2);
            // 方式1
            Future<String> submit = es.submit(() -> Thread.currentThread().getName());
            System.out.println(submit.get());
            // 方式2
            es.execute(() -> System.out.println(Thread.currentThread().getName()));
        }
    }

    /**
     * 定义线程池名称或优先级
     */
    public static class FixedThreadPoll2 {
        public static void main(String[] args) throws ExecutionException, InterruptedException {
            // 创建线程工厂
            ThreadFactory threadFactory = r -> {
                // ！！！！！！！一定要注意：要把任务Runnable设置给新创建的线程
                Thread thread = new Thread(r);
                // 设置线程的命名规则
                thread.setName("我的线程：" + r.hashCode());
                // 设置线程的优先级
                thread.setPriority(Thread.MAX_PRIORITY);
                return thread;
            };
            ExecutorService es = Executors.newFixedThreadPool(2, threadFactory);
            // 参数是接口类，所以lambda的()->{}在括号里面，上面的r->{}是直接一个类，并不是作为入参
            Future<Integer> result = es.submit(() -> {
                int num = new Random().nextInt(10);
                System.out.println("线程优先级" + Thread.currentThread().getPriority() + ", 随机数：" + num);
                return num;
            });
            // 打印线程池返回结果
            System.out.println("返回结果：" + result.get());
        }
    }
}

class CachedThreadPool {
    public static class CachedThreadPool1 {
        public static void main(String[] args) {
            // 创建线程池
            ExecutorService es = Executors.newCachedThreadPool();
            for (int i = 0; i < 3; i++) {
                int finalI = i;
                es.submit(() -> System.out.println("i : " + finalI + "|线程名称：" + Thread.currentThread().getName()));
            }
        }
    }
}
