package com.rac.interviewqna.multithreading.producerconsumer;

import java.beans.IntrospectionException;
import java.util.List;

public class ProducerJob implements Runnable {
    private List queue;

    public ProducerJob(List queue) {
        this.queue=queue;
    }

    @Override
    public void run() {

        try {

            for(int i=0;i<10;i++) {

                synchronized (queue) {
                    if (queue.size() == 10) {
                        System.out.println("producer going to wait");
                        queue.wait();
                        System.out.println("producer resumed");
                    } else {
                        queue.add(i);
                        System.out.println("producer produced"+i);
                        System.out.println("producer going to notify");
                        queue.notify();
                        System.out.println("producer notified");

                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("problem in consuer");
        }

    }
}
