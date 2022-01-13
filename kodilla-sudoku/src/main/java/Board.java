public class Board {

    private final int MAX_ROW = 9;
    private final int MAX_COLUMN = 9;
    private final SudokuElement[][] board;

    public Board() {
        board = new SudokuElement[9][9];
        for(int i = 0; i != MAX_ROW; ++i) {
            for(int j = 0; j != MAX_COLUMN; ++j)
                board[i][j] = new SudokuElement(i, j);
        }
    }

    public Board(Board other) {
        board = new SudokuElement[9][9];
        try {
            for(int i = 0; i != MAX_ROW; ++i) {
                for(int j = 0; j != MAX_COLUMN; ++j){
                    board[i][j] = (SudokuElement)other.board[i][j].clone();
                }
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private boolean rowCondition(int row, int value) {
        for(int i = 0; i != MAX_ROW; ++i) {
            if(board[row][i].getValue() == value)
                return false;
        }
        return true;
    }

    private boolean columnCondition(int column, int value) {
        for(int i = 0; i != MAX_COLUMN; ++i) {
            if(board[i][column].getValue() == value)
                return false;
        }
        return true;
    }

    private boolean blockCondition(int row, int column, int value) {
        int currentRow = row/3 * 3;
        int columnStartingPoint = column/3 * 3;
        for(int i = 0; i != 3; ++i) {
            int currentColumn = columnStartingPoint;
            for(int j = 0; j != 3; ++j) {
                if(board[currentRow][currentColumn].getValue() == value)
                    return false;
                currentColumn++;
            }
            currentRow++;
        }
        return true;
    }

    private boolean checkIfPossible(int row, int column, int value) {
        int counter = 0;
        if(rowCondition(row, value))
            counter++;
        if(columnCondition(column, value))
            counter ++;
        if (blockCondition(row, column, value))
            counter++;
        return counter == 3;
    }

    public boolean setValue(int row, int column, int value) {
        if(board[row][column].getValue() != -1) {
            return false;
        } else if(checkIfPossible(row, column, value)) {
            board[row][column].setValue(value);
            return true;
        } else {
            return false;
        }
    }

    public void delete(int row, int column) {
        board[row][column].setValue(-1);
    }

    public SudokuElement[][] getBoard() {
        return board;
    }

    public int getMAX_ROW() {
        return MAX_ROW;
    }

    public int getMAX_COLUMN() {
        return MAX_COLUMN;
    }

    @Override
    public String toString() {
        int row, column;
        row = column = 0;
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i != 17; ++i) {
            int counter = 0;
            if((i & 1) == 0) {
                for(int j = 0; j != 11; ++j) {
                    if(counter == 3 || counter == 7) {
                        builder.append(" ".repeat(10));
                        counter++;
                        continue;
                    }
                    int elementValue = board[row][column].getValue();
                    String element = (elementValue == -1)? "| | ": "|" + elementValue + "| ";
                    builder.append(element);
                    counter++;
                    column++;
                }
                row++;
                column = 0;
                builder.append("\n");
            } else if(i == 5 || i == 11) {
                builder.append(" ".repeat(40));
                builder.append("\n");
            } else {
                builder.append("-".repeat(55));
                builder.append("\n");
            }
        }
        return builder.toString();
    }
}
