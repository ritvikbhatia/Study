package com.study;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Observable observable = new RadioStation();
        Television television=new Television();
        Speaker speaker=new Speaker();
        observable.add(television);
        observable.add(speaker);
        observable.broadcast();
    }
}
