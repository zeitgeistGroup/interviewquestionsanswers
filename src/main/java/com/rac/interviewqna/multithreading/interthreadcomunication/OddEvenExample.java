package com.rac.interviewqna.multithreading.interthreadcomunication;

/**
 * This class responsible for printing even and odd by wait notify method
 *
 * 
 */
public class OddEvenExample {

    private static int range=100;
    static int counter=0;


    public static void main(String[] args) {

        Thread evenThread=new Thread(()->{
            synchronized (OddEvenExample.class) {
                while (counter < range) {
                    if (counter % 2 == 0) {
                        System.out.println(counter + "  : even");
                        counter++;
                        OddEvenExample.class.notify();
                    }else{
                        try {
                            OddEvenExample.class.wait();
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
            }

        });
        Thread oddThread=new Thread(()->{
            synchronized (OddEvenExample.class) {
            while(counter<range){
                if(counter%2!=0){
                    System.out.println(counter + "  : odd");
                    counter++;
                    OddEvenExample.class.notify();
                }else{
                    try {
                        OddEvenExample.class.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }

                }

            }
        }

        });
        evenThread.start();
        oddThread.start();



    }
}
