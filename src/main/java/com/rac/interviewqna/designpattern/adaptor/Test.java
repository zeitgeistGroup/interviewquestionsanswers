package com.rac.interviewqna.designpattern.adaptor;

public class Test {

    //JoeBird behaves like Dove and requires Realbird adapter

    public static void main(String[] args) {

        ToyBird joiBird=new JoeBirdToy();
        joiBird.display();
        joiBird.quack();

        RealBird dove=new Dove();
        dove.dissplay();
        dove.sound();


      //toy bird behaves lik real bird see the method
        RealBirdAdapter test=new RealBirdAdapter(dove);

            test.display();
            test.quack();

    }
}
