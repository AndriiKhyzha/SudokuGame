package my.sudoku.main;
import my.sudoku.gui.frames.*;
import my.sudoku.logic.LogicMain;
import my.sudoku.logic.Squares.Square1;

/**
 * Created by Андрей on 12.11.2017.
 */
public class SudokuGame {

    public static LogicMain logicMain = new LogicMain();
    public static final SudokuFrame sudokuFrame = new SudokuFrame();

    public static void main(String[] args) {

        logicMain.setActualValues(sudokuFrame.matrixButtonCells, new Square1().getSquare());

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sudokuFrame.createGameFrame();
            }
        });
    }
}
