package my.sudoku.logic;

public class Cell implements ICell {

    private int value;
    private boolean isVisible;

    public Cell(int value, boolean isVisible) {
        this.value = value;
        this.isVisible = isVisible;
    }

    public int getValue() {
        return value;
    }

    public boolean getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }
}
