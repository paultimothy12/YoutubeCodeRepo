package com.timothy.Concepts.Multithreading;

class mtImpl implements Runnable{
    int threadNum;

    public mtImpl(int threadNum) {
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        for(int i=1; i<=5;i++){
            System.out.println(i+" from thread "+threadNum);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadDef {
    public static void main(String[] args) throws InterruptedException {
        //Impl Class-
        // => extend Thread Class-> ImplClass Object can be directly used to start => implClassObj.start();
        // => implement Runnable Interface -> create a ImplClass Object and pass it as parameter to a Thread Object,
        //                                      now use Thread Object to start => threadObj.start();


        //single thread

        mtImpl mtObj = new mtImpl(0);
        Thread obj=new Thread(mtObj);
        obj.start();
        obj.join();

        //multiple threads

        mtImpl mtObj1 = new mtImpl(1);
        Thread obj1=new Thread(mtObj1);
        obj1.start();
        obj1.join();

        mtImpl mtObj2 = new mtImpl(2);
        Thread obj2=new Thread(mtObj2);
        obj2.start();
        obj2.join();

        mtImpl mtObj3 = new mtImpl(3);
        Thread obj3=new Thread(mtObj3);
        obj3.start();
    }
}
