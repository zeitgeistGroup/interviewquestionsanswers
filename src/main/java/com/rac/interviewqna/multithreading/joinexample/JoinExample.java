package com.rac.interviewqna.multithreading.joinexample;

public class JoinExample {


    public static void main(String[] args) throws Exception  {



        Thread T1=new Thread(()->{
                            Thread T2=new Thread(()->{
                                                Thread T3=new Thread(()->{
                                                    System.out.println("T3");
                                                });
                                T3.start();
                                try {
                                    //Thread T3 completes before T2
                                    T3.join();
                                }catch(InterruptedException e){
                                    e.printStackTrace();
                                    System.out.println("Problem in T2 thread");
                                }
                                System.out.println("T2");
                            });
             T2.start();
             try {
                 //Thread T2 completes before T1
                T2.join();
            }catch(InterruptedException e){
                e.printStackTrace();
                System.out.println("Problem in T1 thread");
            }
            System.out.println("T1");
        });

        T1.start();
        //main wait before T1 complete
        T1.join();
        System.out.println("main thread");


    }
}
