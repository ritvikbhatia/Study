package com.study;

import java.util.Map;

public class Board {
    Dice dice;
    Map<Position,JumperObject> map;
    private int rows;
    private int columns;

    public Board(int rows,int columns,Dice dice) {
        this.rows = rows;
        this.columns=columns;
        this.dice=dice;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
    void jump(Player player)
    {
        Position newPosition=calculateCoordinate(player.getPosition(),this.dice.roll(player));
        player.setPosition(newPosition);
    }

    private Position calculateCoordinate(Position position, int number){
        int x=position.getX();
        x=x+number%columns;
        int y= position.getY();
        y=y+number/rows;
        return new Position(x,y);
    }


}
