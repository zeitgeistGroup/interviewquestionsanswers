package com.rac.interviewqna.multithreading.threadpoolcustom;

public class ThreadPoolCustom {

    private BlockingQueue queue;
    private boolean isShownInitiated;

    public ThreadPoolCustom(int numsThread){
        queue=new BlockingQueue(numsThread);

        for(int i=0;i<numsThread;i++) {
            ThreadPoolCustomThread threadPoolCustomThread = new ThreadPoolCustomThread(queue, this);
            threadPoolCustomThread.setName("WorkerThread"+i);
            System.out.println("WorkerThread"+i+" created in ThreadPool");
            threadPoolCustomThread.start();
        }


    }


    public synchronized void execute(Runnable task) throws Exception{
        if(this.isShownInitiated){
            throw new Exception(" ThreadPool has been shutDown, no further tasks can be added");
        }

        System.out.println(" task has been added");
        this.queue.put(task);
    }


    public boolean isShownInitiated(){
        return isShownInitiated;

    }

    public synchronized void shutDown(){
        this.isShownInitiated=true;
        System.out.println("ThreadPool shutdown initiated");
    }


}
