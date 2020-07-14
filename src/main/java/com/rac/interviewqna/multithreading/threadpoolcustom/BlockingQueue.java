package com.rac.interviewqna.multithreading.threadpoolcustom;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue<E> {

    private List<E> queue;
    private int maxSize;

    public BlockingQueue(int maxSize){

        this.maxSize=maxSize;

        this.queue=new LinkedList<E>();

    }

    public  void put(E t) throws InterruptedException{

        synchronized(this) {
            if (queue.size() == maxSize) {
                this.wait();
            }
            queue.add(t);
            this.notifyAll();
        }

    }

    public  E take() throws InterruptedException {


synchronized (this) {
    if (queue.size() == 0) {
        this.wait();
    }
    this.notify();
    return queue.remove(0);
}


    }

    public synchronized int size(){
        return queue.size();
    }

}

