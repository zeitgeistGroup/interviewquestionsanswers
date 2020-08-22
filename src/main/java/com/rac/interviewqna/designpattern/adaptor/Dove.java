package com.rac.interviewqna.designpattern.adaptor;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Dove implements RealBird {
    @Override
    public void dissplay() {

        System.out.println("real word dove");

    }

    @Override
    public void sound() {

        System.out.println("gutargoon............. dove");

    }
}
