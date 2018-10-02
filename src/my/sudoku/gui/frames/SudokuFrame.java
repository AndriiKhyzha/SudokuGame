package my.sudoku.gui.frames;
import my.sudoku.listeners.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SudokuFrame extends JFrame {

    public void createGameFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setName("Sudoku");
        setSize(1000, 528);
        setEnabled(true);
        setResizable(false);
        setTitle("Sudoku");
        setLocationRelativeTo(null);
//        setLayout(new BorderLayout());


        panel1.setSize(500, 500);
        panel1.setVisible(true);
        panel1.setLayout(new GridLayout(6, 6));
// TODO: done panel 2 homework
        panel2.setVisible(true);
        panel2.setLayout(new GridLayout(3, 3));
        panel2.setSize(500, 500);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout());
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        setContentPane(mainPanel);

    }

    private JPanel panel2 = new JPanel();
    NumberButtonListener numberButtonListener = new NumberButtonListener();
    CButtonListener cButtonListener = new CButtonListener();
    RedButtonListener redButtonListener = new RedButtonListener();
    VerifyButtonListener verifyButtonListener = new VerifyButtonListener();

    private JButton [][] matrixButtonChoise = {{addButtonToPanel(new JButton(), panel2, numberButtonListener, "1"), addButtonToPanel(new JButton(), panel2, numberButtonListener, "2"), addButtonToPanel(new JButton(), panel2, numberButtonListener, "3")},
            {addButtonToPanel(new JButton(), panel2, numberButtonListener, "4"), addButtonToPanel(new JButton(), panel2, numberButtonListener, "5"), addButtonToPanel(new JButton(), panel2, numberButtonListener, "6")},
            {addButtonToPanel(new JButton(), panel2, cButtonListener, "C"), addButtonToPanel(new JButton(), panel2, redButtonListener, "Red"), addButtonToPanel(new JButton(), panel2, verifyButtonListener, "Verify")}};

    private JPanel panel1 = new JPanel();
    SquareCellListener squareCellListener = new SquareCellListener();

    public JButton [][] matrixButtonCells = {{addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener)},
            {addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener)},
            {addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener)},
            {addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener)},
            {addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener)},
            {addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener), addButtonToPanel(new JButton(), panel1, squareCellListener)}
    };

    private JButton addButtonToPanel(JButton button, JPanel panel, ActionListener actionListener) {
        panel.add(button);
        button.addActionListener(actionListener);
        return button;
    }

    private JButton addButtonToPanel(JButton button, JPanel panel, ActionListener actionListener, String buttonText) {
        addButtonToPanel(button, panel, actionListener).setText(buttonText);
        return button;
    }
}