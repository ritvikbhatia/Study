package com.study;

public class Dice {
    private Player player;
    public Dice(Player player){
        this.player = player;
    }
    public int roll()
    {
        int number =  (int) (6*Math.random()+1);
        jump(number);
    }
    Position jump(int number)
    {
        Position playerpoistion = player.position;
        return calculateCoordinate(playerpoistion, number);

    }

    private Position calculateCoordinate(Position position, int number){
        return new Position();
    }
}
