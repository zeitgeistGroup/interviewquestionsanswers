package com.rac.interviewqna.multithreading.threadpoolcustom;

public class ThreadPoolCustomThread extends Thread {

    private  BlockingQueue<Runnable> queue;
    private ThreadPoolCustom threadPoolCustom;

    public ThreadPoolCustomThread(BlockingQueue queue,ThreadPoolCustom threadPoolCustom) {
        this.threadPoolCustom=threadPoolCustom;
        this.queue=queue;
    }

    public void run(){

               try{
                   while (true){

                       System.out.println(Thread.currentThread().getName()+" is READY to execute task.");
                       Runnable runnable=  queue.take();
                       System.out.println(Thread.currentThread().getName()+" has taken task.");
                       runnable.run();
                       System.out.println(Thread.currentThread().getName()+" has EXECUTED task.");


                     if(this.threadPoolCustom.isShownInitiated() && queue.size()==0){
                        this.interrupt();
                         Thread.sleep(1);
                     }


                   }


               }catch(Exception e){
                   System.out.println(Thread.currentThread().getName()+" has been STOPPED.");
               }

    }
}
