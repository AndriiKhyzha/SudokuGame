package my.sudoku.logic;
import my.sudoku.logic.Cell;
import my.sudoku.gui.frames.SudokuFrame;
import my.sudoku.logic.Squares.Square2;

import javax.swing.*;

import static my.sudoku.main.SudokuGame.sudokuFrame;

/**
 * Created by Андрей on 12.11.2017.
 */
public class LogicMain {

    private JButton[][] matrixButtonCells;
    private Cell[][] cells;

    public Cell[][] getCells() {
        return cells;
    }

    public JButton[][] getMatrixButtonCells() {
        return matrixButtonCells;
    }

    public void setActualValues(JButton[][] matrixButtonCells, Cell[][] cells) {
        this.cells = cells;
        this.matrixButtonCells = matrixButtonCells;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                Cell actualCell = cells[i][j];
                if (actualCell.getIsVisible()) {
                    matrixButtonCells[i][j].setText(String.valueOf(actualCell.getValue()));
                }
            }
        }
    }
    public void verificationCellOfButtonsMatrix(JButton[][] matrixButtonCells, Cell[][] cells){
        this.matrixButtonCells = matrixButtonCells;
        this.cells = cells;
            for (int i = 0; i < 6; i++) {
                for(int j = 0; j < 6; j++) {
                    String value = String.valueOf(cells[i][j].getValue());
                    Cell actualCell = cells[i][j];
                    if(actualCell.getIsVisible())
                    if(matrixButtonCells[i][j].equals(value)) {
                        setActualValues(sudokuFrame.matrixButtonCells, new Square2().getSquare());
                    }

                }
            }
    }
        /*public void goToSquare2(JButton[][] matrixButtonCells, Cell[][] cells) {
        this.matrixButtonCells = matrixButtonCells;
        this.cells = cells;
        for (int i = 0; i < matrixButtonCells.length; i++) {
            for (int j = 0; j < matrixButtonCells.length; j++) {
                String value = String.valueOf(cells[i][j].getValue());

                if (matrixButtonCells[i][j].getText().equals(value)) {
                    LogicMain.setActualValues(matrixButtonCells, new Square2().getSquare());
                }
            }
        }

    }
*/
}