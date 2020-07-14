package com.rac.interviewqna.multithreading.producerconsumer;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerDemo {

    public static void main(String[] args) {
        List queue =new ArrayList(10);
        Lock lock=new ReentrantLock();
        Condition condition=lock.newCondition();
        int max_Size=10;


        Thread producer =new Thread(()->{
           try {
               Thread.sleep(100);

               for (int i = 0; i < 100; i++) {
                   ////   synchronized(queue) {

                   lock.lock();
                   if (max_Size == queue.size()) {
                       System.out.println("produccer going to wait");
                       condition.await();
                       //queue.wait();
                       System.out.println("produccer  resumed");
                   }
                   System.out.println("produccer going to add");

                   queue.add(i);
                   System.out.println("produccer  added "+i);
                   System.out.println("produccer going to notify");
                   condition.signal();
                   //queue.notify();
                   System.out.println("produccer  notified");


                   lock.unlock();
                   // }
               }
               }catch(InterruptedException e){
                   e.printStackTrace();
               }


        });
        Thread consumer=new Thread(()->{
            while(true) {
                try {

                   // synchronized (queue) {
                    lock.lock();
                        if (queue.size() == 0) {
                            System.out.println("consumer going to wait");
                             condition.await();
                            //queue.wait();
                            System.out.println("consumer resumed");

                        } else {
                            System.out.println("consumer going to notify");
                            condition.signal();
                            //queue.notify();
                            System.out.println("consumer going to notified");
                           int consumed=(int) queue.remove(0);
                            System.out.println("consumer consumed "+consumed);


                        }
                    lock.unlock();
             //       }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        producer.start();
        consumer.start();

    }
}
