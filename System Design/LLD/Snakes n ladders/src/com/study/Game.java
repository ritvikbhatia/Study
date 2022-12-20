package com.study;

import java.util.List;

public class Game {
    Board board;
    List<Player> players;

    public Game( Board board, List<Player> players) {
        this.board = board;
        this.players = players;
    }
    public void start()
    {
        for(int i=0;i<5;i++)
        {
            for(Player player:players)
            {
                board.jump(player);
                player.getPosition();
            }
        }
    }
}
