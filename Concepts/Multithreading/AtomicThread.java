package com.timothy.Concepts.Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicThread implements Runnable{
    AtomicInteger x = new AtomicInteger();

    @Override
    public  void run() {
        for (int i = 0; i < 5; i++)
        {
            try {
                x.getAndIncrement();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public int getVal(){
        return x.get();
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicThread atomicThread = new AtomicThread();
        Thread t1= new Thread(atomicThread);
        t1.start();

        Thread t2=new Thread(atomicThread);
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Main executed!!! "+atomicThread.getVal());
    }
}
