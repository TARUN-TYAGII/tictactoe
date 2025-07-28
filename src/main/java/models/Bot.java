package models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder(toBuilder = true)
public class Bot extends Player{
    private WinningStrategy winningStrategy;


    @Override
    public BoardCell play(Board board) {
        return null;
    }
}
