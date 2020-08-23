package com.rac.interviewqna.designpattern.FactoryPattern;

public class Square implements Shaping {


    @Override
    public void display() {
        System.out.println("i am square");
    }

    @Override
    public void draw() {
        System.out.println("draw square");
    }
}
