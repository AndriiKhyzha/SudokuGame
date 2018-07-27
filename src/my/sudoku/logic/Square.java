package my.sudoku.logic;

public abstract class Square {

    public Square() {
        createSquare();
    }

    protected Cell[][] cells;

    public abstract void createSquare();

    public Cell[][] getSquare() {
        return cells;
    }
}
