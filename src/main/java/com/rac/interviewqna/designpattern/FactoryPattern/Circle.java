package com.rac.interviewqna.designpattern.FactoryPattern;

import java.awt.Shape;

public class Circle implements Shaping {


    @Override
    public void display() {

        System.out.println("i am in Circle");

    }

    @Override
    public void draw() {
        System.out.println("circle draw");
    }
}
