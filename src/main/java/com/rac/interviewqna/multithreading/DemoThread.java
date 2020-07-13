package com.rac.interviewqna.multithreading;

import java.util.ArrayList;
import java.util.List;

public class DemoThread {

    public static void main(String[] args) {
        List queue=new ArrayList(10);

        Thread produser =new Thread( new ProducerJob(queue));

        Thread consumer= new Thread(new ConsumerJob(queue));
        produser.start();
        consumer.start();
    }
}
