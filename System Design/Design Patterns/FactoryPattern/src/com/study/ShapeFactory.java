package com.study;

public class ShapeFactory {
    public Shape getShape(String shape) {
        if(shape=="triangle")
        return new Triangle();
        if(shape=="square")
        return new Square();
        return null;
    }

}
