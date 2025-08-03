package models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@Getter
@Setter
public class Board {
    private int size;
    List<List<BoardCell>> cells = new ArrayList<>();

    public Board(int size){
        this.size = size;
        this.cells = initializeCells(size);
    }

    private List<List<BoardCell>> initializeCells(int size) {
        List<BoardCell> firstRow = Collections.nCopies(size, new BoardCell());
        List<List<BoardCell>> cells =  Collections.nCopies(size, firstRow );
        return cells;
    }

}
