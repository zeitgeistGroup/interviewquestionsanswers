package com.rac.interviewqna.designpattern.adaptor;

public class RealBirdAdapter implements ToyBird  {

    private RealBird realBird;

    public RealBirdAdapter(RealBird realBird){
        this.realBird=realBird;
    }


    @Override
    public void display() {
        realBird.dissplay();

    }

    @Override
    public void quack() {
        realBird.sound();
    }
}
