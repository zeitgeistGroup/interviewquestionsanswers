package com.rac.interviewqna.multithreading.sequenceofthread;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceOfThread {

    public static void main(String[] args) {


        AtomicInteger count=new AtomicInteger();
        count.set(0);

        Thread T1=new Thread(()->{
            while(true) {
                if (count.get() == 0) {
                    System.out.println("A");
                    count.set(1);
                }
            }

        });
        Thread T2=new Thread(()->{
            while(true) {
                if (count.get() == 1) {
                    System.out.println("B");
                    count.set(2);
                }
            }
        });
        Thread T3=new Thread(()->{
            while(true) {
                if (count.get() == 2) {
                    System.out.println("C");
                    count.set(0);
                }
            }

        });

        T1.start();
        T2.start();
        T3.start();
    }
}
