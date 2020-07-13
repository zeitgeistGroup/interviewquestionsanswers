package com.rac.interviewqna.multithreading;

import java.util.List;

public class ConsumerJob implements Runnable {
    private List queue;
    public ConsumerJob( List queue) {
        this.queue=queue;
    }

    @Override
    public void run() {
        try {
   while(true) {
       synchronized (queue) {
           if (queue.size() == 0) {
               System.out.println("consumer going to wait");
               queue.wait();
               System.out.println("consumer consumed");
           } else {
               System.out.println("consumer going to notify");
               queue.notify();
               System.out.println("consumer notified");
               System.out.println(queue.remove(0));

           }
       }
   }
        }catch( InterruptedException e){
            System.out.println("problem in consuer");
        }




    }
}
