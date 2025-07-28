package models;

public abstract class Player {
    private GameSymbol gameSymbol;
    public abstract BoardCell play(Board board);
}
