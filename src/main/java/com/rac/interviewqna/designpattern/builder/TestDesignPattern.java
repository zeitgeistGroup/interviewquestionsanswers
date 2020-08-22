package com.rac.interviewqna.designpattern.builder;

import com.rac.interviewqna.designpattern.builder.Phone;

public class TestDesignPattern {

    public static void main(String[] args) {


        Phone ph=Phone.builder().setName("samsung").build();


       // Phone ph=test("samsung").setProcessor("qualcom").setRam(8).setScreen(5.0).setSimSlot("two").build();
        System.out.println(ph);
    }
}
