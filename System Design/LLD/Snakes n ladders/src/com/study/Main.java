package com.study;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player(1, "Ritvik", "Red", new Position(0, 0));
        Player player2 = new Player(2, "Rizwan", "Blue", new Position(0, 0));
        Player player3 = new Player(3, "Vipul", "Green", new Position(0, 0));
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        Game game = new Game(new Board(10,10,new Dice(1)),players);
        game.start();
    }
}
