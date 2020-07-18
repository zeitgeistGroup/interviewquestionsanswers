package com.rac.interviewqna.multithreading.sequenceofthread;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.MINUTES;

public class SequenceOfThreadByblockingQueue {

    public static void main(String[] args) throws Exception {
        ExecutorService executor =Executors.newSingleThreadExecutor();

        List<Future> result=new ArrayList();

       for(int i=0;i<90;i++) {
           Future A=   executor.submit(() -> {
                System.out.println("A");
                return "Thread1 print A";
            });
           result.add(A);
           Future B= executor.submit(() -> {
                System.out.println("B");
                return "Thread1 print B";

            });
           result.add(B);
           Future C=executor.submit(() -> {
               Thread.sleep(100);
                System.out.println("C");
                return "Thread1 print C";
            });

           result.add(C);
        }

        executor.shutdown();
        executor.awaitTermination(1 ,TimeUnit.SECONDS);
        System.out.println(result.size());


        result.forEach(e->
        {
            try {
                System.out.println(e.get());
            }catch(Exception ex){
                ex.printStackTrace();
            }
        });
        System.out.println("complete");



    }



}
