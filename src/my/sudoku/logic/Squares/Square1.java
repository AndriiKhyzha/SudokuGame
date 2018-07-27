package my.sudoku.logic.Squares;

import my.sudoku.logic.Cell;
import my.sudoku.logic.Square;

public class Square1 extends Square {

    @Override
    public void createSquare() {
        this.cells = new Cell[][]{{new Cell(4, true), new Cell(5, true), new Cell(6, false), new Cell(2, false), new Cell(1, false), new Cell(3, false)},
                {new Cell (3, true), new Cell(1, false), new Cell(2, false), new Cell(5, false), new Cell(4, false), new Cell(6, true)},
                {new Cell(5, false), new Cell(4, true), new Cell(3, false), new Cell(1, true), new Cell(6, false), new Cell(2, false)},
                {new Cell(6, false), new Cell(2, false), new Cell(1,true), new Cell(3, false), new Cell(5, true), new Cell(4,false)},
                {new Cell(2,true), new Cell(6, false), new Cell(5,false), new Cell(4,false), new Cell(3, false), new Cell(1, true)},
                {new Cell(1,false), new Cell(3,false), new Cell(4, false), new Cell(6, false), new Cell(2, true), new Cell(5, true)}
        };
    }
}