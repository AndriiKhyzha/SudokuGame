package my.sudoku.listeners;
import my.sudoku.logic.Cell;
import my.sudoku.logic.LogicMain;
import my.sudoku.main.SudokuGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerifyButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource();
        button.setBackground(Color.BLACK);

        LogicMain logicMain = SudokuGame.logicMain;
        JButton[][] buttonsMatrix = logicMain.getMatrixButtonCells();
        Cell[][] cellsMatrix = logicMain.getCells();

        for (int i = 0; i < buttonsMatrix.length; i++) {
            for (int j = 0; j < buttonsMatrix.length; j++) {
                String value = String.valueOf(cellsMatrix[i][j].getValue());

                if (buttonsMatrix[i][j].getBackground().equals(Color.GREEN)) {
                    if (!(buttonsMatrix[i][j].getText().equals(value))) {
                        buttonsMatrix[i][j].setBackground(Color.BLACK);
                    }
                }
            }
        }
    }
}
