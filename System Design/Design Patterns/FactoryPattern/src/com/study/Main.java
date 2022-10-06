package com.study;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape= shapeFactory.getShape("triangle");
        shape.print();
    }
}
