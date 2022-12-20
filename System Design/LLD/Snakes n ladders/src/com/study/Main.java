package com.study;

public class Main {

    public static void main(String[] args) {
        System.out.println("Game Started");
        Dice dice=new Dice();
        for (int i=0;i<20;i++)
        System.out.println(dice.roll());
    }
}
