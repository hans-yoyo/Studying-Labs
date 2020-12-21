package io.hans.coder.basis.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class AppMain {

    public static void main(String[] args) {
        synchronized (new Object()) {

        }

        new ReentrantLock();
    }

}
