package com.rac.interviewqna.designpattern.FactoryPattern;

public class ShapeFactory {


    private Shaping shapeing;

    public Shaping getShaping(String shape) throws Exception {

        if (shape == null) {
            throw new Exception("shape can not be null");

        }

        if (shape.equals("circle")) {

            shapeing = new Circle();
            return shapeing;
        }
        if (shape.equals("square")) {

            shapeing = new Square();
            return shapeing;
        }


        return null;

    }


}
