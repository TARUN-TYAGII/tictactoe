package models;

import lombok.experimental.SuperBuilder;

public class HumanPlayer extends Player{
    private User user;
    @Override
    public BoardCell play(Board board) {
        return null;
    }
}
