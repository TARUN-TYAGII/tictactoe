package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.experimental.SuperBuilder;



public abstract class Player {
    private GameSymbol gameSymbol;
    public abstract BoardCell play(Board board);
}
