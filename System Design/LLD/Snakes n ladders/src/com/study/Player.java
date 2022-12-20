package com.study;

public class Player {
    private int id;
    private String name;
    private String color;
    private Position position;

    public Player(int id, String name, String color, Position position) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }



}
