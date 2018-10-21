package my.sudoku.listeners;
import my.sudoku.logic.LogicMain;
import my.sudoku.main.SudokuGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CButtonListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        LogicMain logicMain = SudokuGame.logicMain;
        JButton [][] buttonMatrix = logicMain.getMatrixButtonCells();

        for (int i = 0; i < buttonMatrix.length; i++){
            for (int j = 0; j < buttonMatrix.length; j++){
                if (buttonMatrix [i][j].getBackground().equals(Color.GREEN)) {
                    buttonMatrix [i][j].setText("");
                    if (buttonMatrix [i][j].getBackground().equals(Color.RED)) {
                        buttonMatrix [i][j].setText("");
                    }
                }
            }
        }



    }
}
