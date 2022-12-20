package com.study;

public class Dice {

    int count;

    public Dice(int count) {
        this.count = count;
    }

    public int roll(Player player)
    {
        int number =  (int) (6*Math.random()+1)*count;
        System.out.println(player.getName()+" rolled "+number);
        return number;
    }

}
