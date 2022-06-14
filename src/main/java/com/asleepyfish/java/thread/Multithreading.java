package com.asleepyfish.java.thread;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @Author: zhoujh42045
 * @Date: 2022/6/10 15:23
 * @Description: 多线程
 */

/**
 * 固定数量的线程池
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

/**
 * 带缓存的线程池
 */
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

/**
 * 执⾏定时任务
 */
class ScheduledThreadPool {
    /**
     * 延迟执⾏(⼀次)
     */
    public static class ScheduledThreadPool1 {
        public static void main(String[] args) {
            ScheduledExecutorService ses = Executors.newScheduledThreadPool(3);
            System.out.println("添加任务的时间：" + LocalDateTime.now());
            ses.schedule(() -> System.out.println("执行子任务：" + LocalDateTime.now()), 3, TimeUnit.SECONDS);
        }
    }

    /**
     * 固定频率执行
     */
    public static class ScheduledThreadPool2 {
        public static void main(String[] args) {
            ScheduledExecutorService ses = Executors.newScheduledThreadPool(3);
            System.out.println("添加任务的时间：" + LocalDateTime.now());
            ses.scheduleAtFixedRate(() -> System.out.println(Thread.currentThread().getName() + "执行任务：" + LocalDateTime.now()), 2, 4, TimeUnit.SECONDS);
        }
    }

    /**
     * scheduleAtFixedRate VS scheduleWithFixedDelay
     */
    public static class ScheduledThreadPool3 {
        public static void main(String[] args) {
            // 创建线程池
            ScheduledExecutorService ses = Executors.newScheduledThreadPool(3);
            System.out.println("添加任务时间：" + LocalDateTime.now());
            // 2s之后开始执行定时任务，定时任务每隔4s执行一次
            ses.scheduleWithFixedDelay(() -> {
                System.out.println(Thread.currentThread().getName() + "执行任务：" + LocalDateTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, 2, 4, TimeUnit.SECONDS);
        }
    }
}

/**
 * 定时任务单线程
 */
class SingleThreadScheduledExecutor {
    public static class SingleThreadScheduledExecutor1 {
        public static void main(String[] args) {
            ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
            System.out.println("添加任务时间：" + LocalDateTime.now());
            ses.scheduleAtFixedRate(() -> System.out.println(Thread.currentThread().getName() + "执行时间：" + LocalDateTime.now()), 2, 4, TimeUnit.SECONDS);
        }
    }
}

/**
 * 单线程线程池
 */
class SingleThreadExecutor {
    public static class SingleThreadExecutor1 {
        public static void main(String[] args) {
            ExecutorService es = Executors.newSingleThreadExecutor();
            for (int i = 0; i < 5; i++) {
                es.submit(() -> System.out.println("线程名：" + Thread.currentThread().getName()));
            }
        }
    }
}

/**
 * 根据当前CPU⽣成线程池
 */
class WorkStealingPool {
    public static class WorkStealingPool1 {
        public static void main(String[] args) {
            ExecutorService service = Executors.newWorkStealingPool();
            for (int i = 0; i < 5; i++) {
                service.submit(() -> {
                    System.out.println("线程名：" + Thread.currentThread().getName());
                });
                while (!service.isTerminated()) {
                }
            }
        }
    }
}