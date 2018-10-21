package my.sudoku.listeners;
import my.sudoku.logic.LogicMain;
import my.sudoku.main.SudokuGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberButtonListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        LogicMain logicMain = SudokuGame.logicMain;
        JButton[][] buttonsMatrix = logicMain.getMatrixButtonCells();

        for (int i = 0; i < buttonsMatrix.length; i++) {
            for (int j = 0; j < buttonsMatrix.length; j++) {

                if (buttonsMatrix[i][j].getBackground().equals(Color.GREEN)) {
                    buttonsMatrix[i][j].setText(jButton.getText());

                    if ((buttonsMatrix[i][j].getBackground().equals(Color.RED))) {
                        buttonsMatrix[i][j].setText(jButton.getText());
                    }
                }
            }
        }
    }
}
