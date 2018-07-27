package my.sudoku.logic;

public interface ICell {

    boolean getIsVisible();

    void setIsVisible(boolean isVisible);

    int getValue();
}