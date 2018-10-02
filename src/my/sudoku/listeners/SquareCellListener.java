package my.sudoku.listeners;
import my.sudoku.logic.Cell;
import my.sudoku.logic.LogicMain;
import my.sudoku.main.SudokuGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquareCellListener implements ActionListener {


    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        Color color = button.getBackground();
        Color defaultColor = new Color(238, 238, 238);
        LogicMain logicMain = SudokuGame.logicMain;
        JButton[][] buttonsMatrix = logicMain.getMatrixButtonCells();
        Cell[][] cellsMatrix = logicMain.getCells();
        int cell_i = 0;
        int cell_j = 0;
        for (int i = 0; i < buttonsMatrix.length; i++){
            for (int j = 0; j < buttonsMatrix[i].length; j++){
                if (buttonsMatrix[i][j].equals(button)) {
                    cell_i = i;
                    cell_j = j;
                    break;
                }
            }
        }

        Cell cell = cellsMatrix[cell_i][cell_j];
        boolean isCellVisible = cell.getIsVisible();

        if (Color.GREEN.equals(color) || isCellVisible ){
            button.setBackground(null);
        } else {
            Container container = button.getParent();
            JPanel jPanel = (JPanel) container;
            jPanel.getComponents();
            Component [] array;
            array = jPanel.getComponents();
            for (int i = 0; i < array.length; i++){
                if ((!array[i].getBackground().equals(defaultColor)) ^ (array[i].getBackground().equals(Color.RED)) ^ (array[i].getBackground().equals(Color.BLACK))) {
                    return;
                }
            }
            button.setBackground(Color.GREEN);
        }
    }
}