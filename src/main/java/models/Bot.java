package models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
public class Bot extends Player{

    @Override
    public BoardCell play(Board board) {
        return null;
    }
}