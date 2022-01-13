
public class SudokuElement implements Cloneable {

    private int value;

    public SudokuElement(int row, int column) {
        value = -1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) return true;
        if(o == null || o.getClass() != this.getClass()) return false;
        SudokuElement other = (SudokuElement) o;
        return this.value == other.value;
    }

}
