package io.hans.coder.basis.concurrency.join;

import java.util.concurrent.CountDownLatch;

/**
 * @描述 工作线程
 * @author Hans
 * @created 2020/12/12 21:42
 */
public class WorkThread extends Thread {

    private CountDownLatch cOne;
    private CountDownLatch cTwo;

    public WorkThread(CountDownLatch cOne, CountDownLatch cTwo) {
        this.cOne = cOne;
        this.cTwo = cTwo;
    }

    @Override
    public void run() {
        try {
            // cOne为0时才执行
            cOne.await();
            System.out.println("thread start : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // 将下一个要执行的减1
            cTwo.countDown();
        }
        System.out.println("thread end : " + Thread.currentThread().getName());
    }
}
