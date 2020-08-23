package com.rac.interviewqna.designpattern.FactoryPattern;

public class Test {

    public static void main(String[] args) {

        try {

            ShapeFactory shape = new ShapeFactory();

            Shaping circle = shape.getShaping("circle");
            circle.display();
            circle.draw();

            Shaping square = shape.getShaping("square");
            square.display();
            square.draw();

            Shaping square1 = shape.getShaping(null);
        } catch (Exception e) {
            System.out.println("check");
            e.printStackTrace();
        }

    }
}
