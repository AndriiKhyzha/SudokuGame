package my.sudoku.listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import my.sudoku.logic.Cell;
import static my.sudoku.main.SudokuGame.logicMain;

public class RedButtonListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource();
        button.setBackground(Color.RED);
        JButton[][] buttonpanel1 = logicMain.getMatrixButtonCells();
        Cell[][] cellMatrix = logicMain.getCells();

        for (int i = 0; i < cellMatrix.length; i++) {
            for (int j = 0; j < cellMatrix.length; j++) {
                if (buttonpanel1[i][j].getBackground().equals(Color.GREEN)) {
                    buttonpanel1[i][j].setBackground(Color.RED);
                }
            }
        }

    }
}





