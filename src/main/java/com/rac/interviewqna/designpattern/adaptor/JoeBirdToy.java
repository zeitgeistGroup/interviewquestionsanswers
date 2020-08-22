package com.rac.interviewqna.designpattern.adaptor;

public class JoeBirdToy implements ToyBird {
    @Override
    public void display() {
        System.out.println("display JoeBirdToy");
    }

    @Override
    public void quack() {

        System.out.println("quack  JoeBirdToy");

    }
}
