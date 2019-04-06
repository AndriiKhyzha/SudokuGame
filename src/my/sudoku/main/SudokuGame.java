package my.sudoku.main;
import my.sudoku.gui.frames.*;
import my.sudoku.logic.LogicMain;
import my.sudoku.logic.Squares.Square1;
import my.sudoku.logic.Squares.Square2;
import my.sudoku.logic.Squares.Square3;

import java.lang.*;

/**
 * Created by Андрей on 12.11.2017.
 */
public class SudokuGame {

    public static LogicMain logicMain = new LogicMain();
    public static final SudokuFrame sudokuFrame = new SudokuFrame();

    public static void main(String[] args) {

        logicMain.setActualValues(sudokuFrame.matrixButtonCells, new Square1().getSquare());
        logicMain.verificationCellOfButtonsMatrix(sudokuFrame.matrixButtonCells, new Square1().getSquare());
        //logicMain.goToSquare2(sudokuFrame.matrixButtonCells, new Square2().getSquare());

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sudokuFrame.createGameFrame();
            }
        });
    }
}
