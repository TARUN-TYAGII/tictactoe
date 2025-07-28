package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
public class Game {
    private Board board;
    private List<Player> players = new ArrayList<>();
    private WinningStrategy winningStrategy;
}
