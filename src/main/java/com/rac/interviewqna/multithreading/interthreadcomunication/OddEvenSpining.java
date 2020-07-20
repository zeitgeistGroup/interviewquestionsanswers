package com.rac.interviewqna.multithreading.interthreadcomunication;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * This class responsible for printing even and Odd by spinning here one thread looping continuously
 * waiting for another thread for signal
 *
 * spinning: When one thread loops continuously waiting for another thread to signal.
 *
 * performance : Busy spin is very bad from performance point of view, because one thread keeps on looping continuously ( and consumes CPU) waiting for another thread to signal.
 *
 * solution :We must use sleep() or wait() and notify() method. Using wait() is better option.
 *
 * wait notify better: Because in case when we use sleep() method, thread will wake up again and again after specified sleep time until boolean variable is true. But, in case of wait() thread will wake up only when when notified by calling notify() or notifyAll(), hence end up consuming CPU in best possible manner
 *
 */

public class OddEvenSpining {

    private static int range=100;
    private static AtomicInteger counter=new AtomicInteger(0);

    public static void main(String[] args) {

        Thread evenThread=new Thread(()->{
           while(true) {
               while (counter.get() % 2 == 0 && counter.get() < range) {
                   System.out.println(counter.get() + ":   even");
                   counter.getAndIncrement();

               }
           }



        });
        Thread oddThread=new Thread(()->{
            while(true) {
                while (counter.get() % 2 != 0 && counter.get() < range) {
                    System.out.println(counter.get() + ":   odd");
                    counter.getAndIncrement();

                }
            }

        });

        evenThread.start();
        oddThread.start();

    }
}
