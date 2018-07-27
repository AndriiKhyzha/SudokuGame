package my.sudoku.listeners;

import my.sudoku.gui.frames.SudokuFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CButtonListener implements ActionListener {
    //    CButtonListener cButtonListener = new CButtonListener();
    JButton buttonc = new JButton();

    public void actionPerformed(ActionEvent e) {
        final ActionListener actionListener = new CButtonListener();
        buttonc.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                buttonc.setEnabled(true);
                buttonc.setVisible(true);
                buttonc.isSelected();
                SudokuFrame sudokuFrame = new SudokuFrame();
                sudokuFrame.setContentPane(buttonc);

            }

            public void mousePressed(MouseEvent e) {

            }

            public void mouseReleased(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {

            }

            public void mouseExited(MouseEvent e) {

            }
        });

    }

}
