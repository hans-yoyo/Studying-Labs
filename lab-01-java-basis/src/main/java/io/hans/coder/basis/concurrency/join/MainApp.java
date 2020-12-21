package io.hans.coder.basis.concurrency.join;

import java.util.concurrent.CompletableFuture;

/**
 * @描述 测试类
 * @author Hans
 * @created 2020/12/12 18:46
 */
public class MainApp {

//        CountDownLatch cOne = new CountDownLatch(0);
//        CountDownLatch cTwo = new CountDownLatch(1);
//        CountDownLatch cThree = new CountDownLatch(1);
//
//        // 首先执行
//        Thread t1 = new WorkThread(cOne, cTwo);
//        // 然后执行
//        Thread t2 = new WorkThread(cTwo, cThree);
//        // 最后执行
//        Thread t3 = new WorkThread(cThree, cThree);
//
//        t2.start();
//        t3.start();
//        t1.start();

    public static void main(String[] args) {
        Thread t1 = new Thread(new InnerWork(), "Thread A");
        Thread t2 = new Thread(new InnerWork(), "Thread B");
        Thread t3 = new Thread(new InnerWork(), "Thread C");

        // 实际使用最好指定线程执行器，作为第二个参数转入
        CompletableFuture.runAsync(() -> t1.start())
                .thenRun(() -> t3.start())
                .thenRun(() -> t2.start());

    }

    static class InnerWork extends Thread {
        @Override
        public void run() {
            System.out.println("thread start : " + Thread.currentThread().getName());
        }
    }

}
