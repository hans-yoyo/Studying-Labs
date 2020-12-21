package io.hans.coder.basis.concurrency.reentrantlock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @描述 【可重入锁 通过condition 精确唤醒线程】 测试类
 * @author Hans
 * @created 2020/12/12 22:48
 */
public class ReentrantLockMain {

    private ReentrantLock lock = new ReentrantLock();

    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();

    int count = 1;

    public void printA() {
        lock.lock();
        try {
            if (count != 1) {
                c1.await();
            }
            //2 do sth
            for (int i = 1; i < 2; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + count);
            }
            count = 2;

            c2.signal();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void printB() {
        lock.lock();
        try {
            if (count != 2) {
                c2.await();
            }
            //2 do sth
            for (int i = 1; i < 2; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + count);
            }
            count = 3;

            c3.signal();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void printC() {
        lock.lock();
        try {
            if (count != 3) {
                c3.await();
            }
            //2 do sth
            for (int i = 1; i < 2; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + count);
            }
            count = 1;
            c1.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) {
        ReentrantLockMain lockMain = new ReentrantLockMain();

        new Thread(()->{
            for (int i = 1; i <= 2; i++) {
                lockMain.printB();
            }
        },"B").start();

        new Thread(()->{
            for (int i = 1; i <= 2; i++) {
                lockMain.printA();
            }
        },"A").start();

        new Thread(()->{
            for (int i = 1; i <= 2; i++) {
                lockMain.printC();
            }
        },"C").start();
    }


}
