package com.timothy.Concepts.Multithreading;

public class VolatileThread implements Runnable{
    public static volatile boolean flag;

    @Override
    public void run() {
        int x=0;
        while(!flag){
            x++;
        }
        System.out.println("Thread ends");
    }
    public static void main(String[] args) throws InterruptedException {
        VolatileThread v= new VolatileThread();
        Thread t1 = new Thread(v);
        t1.start();
        Thread.sleep(1000);

        VolatileThread.flag = true;
        System.out.println("Main completed!!");
    }
}
