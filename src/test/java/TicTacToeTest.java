import models.Board;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TicTacToeTest {

   @Test
    public void testCreateGame(){
        Board board = new Board(3);
        assertEquals("if the size is 3, then row and columns should be 3 and 3",3, board.getCells().size());
//        Game game = new Game();
    }
}
