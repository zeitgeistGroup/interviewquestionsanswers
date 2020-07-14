package com.rac.interviewqna.multithreading.threadpoolcustom;

public class Demo {


    public static void main(String[] args) throws Exception {
        ThreadPoolCustom threadPool=new ThreadPoolCustom(2); //create 2 threads in ThreadPool
        Runnable task=new Runnable(){

            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName()
                            +" is executing task.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };


           threadPool.execute(task);
           threadPool.execute(task);
           threadPool.shutDown();

    }



}
