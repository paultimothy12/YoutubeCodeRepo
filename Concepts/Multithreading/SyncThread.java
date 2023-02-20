package com.timothy.Concepts.Multithreading;

public class SyncThread implements Runnable {
    int value;

    @Override
    public synchronized void run() {
        for (int i = 0; i < 50; i++) {
            try {
                value++;
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int getVal() {
        return value;
    }

    public static void main(String[] args) throws InterruptedException {
        SyncThread syncThread = new SyncThread();

        Thread t1 = new Thread(syncThread);
        Thread t2 = new Thread(syncThread);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Main executed!!! " + syncThread.getVal());
    }
}
