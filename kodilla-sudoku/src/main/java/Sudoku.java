import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Sudoku {

    private int fieldsTaken;
    private Board solvedBoard;
    private final Scanner player;
    private final Random rnd;
    private final Board board;
    private final Set<SudokuElement> initialSetUp;

    public Sudoku() {
        fieldsTaken = 0;
        rnd = new Random();
        player = new Scanner(System.in);
        board = new Board();
        initialSetUp = new HashSet<>();
    }

    private void setUp() {
        for(int i = 0; i != board.getMAX_ROW(); ++i) {
            int taken = rnd.nextInt(2) + 1;
            for(int j = 0; j != taken; ++j) {
                while(true) {
                    int row = rnd.nextInt(9);
                    int column = rnd.nextInt(9);
                    int value = rnd.nextInt(9) + 1;
                    if(board.setValue(row, column, value)) {
                        initialSetUp.add(board.getBoard()[row][column]);
                        fieldsTaken++;
                        break;
                    }
                }
            }
        }
        solvedBoard = new Board(board);
        if(solve(solvedBoard))
            System.out.println(board);
        else
            setUp();
    }

    private boolean solve(Board board) {
        int row, column;
        row = column = -1;
        boolean finished = true;
        for(int i = 0; i != board.getMAX_ROW(); ++i) {
            for(int j = 0; j != board.getMAX_COLUMN(); ++j) {
                if(board.getBoard()[i][j].getValue() == -1) {
                    row = i;
                    column = j;
                    finished = false;
                    break;
                }
            }
            if(!finished)
                break;
        }
        if(finished)
            return true;
        for(int k = 1; k <= 9; ++k) {
            if(board.setValue(row, column, k)) {
                if(solve(board))
                    return true;
                else
                    board.getBoard()[row][column].setValue(-1);
            }
        }
        return false;
    }

    public void start() {
        setUp();
        while(true) {
            System.out.println("Pick Row, Column, Value or d to delete, q to quit, SUDOKU to solve");
            String row = player.next();
            if(row.equals("q") || row.equals("SUDOKU"))
                break;
            String column = player.next();
            if(column.equals("q")|| column.equals("SUDOKU"))
                break;
            String value = player.next();
            if(value.equals("q") || value.equals("SUDOKU"))
                break;
            try {
                int r = Integer.parseInt(row);
                int c = Integer.parseInt(column);
                if(r < 0 || r >=9)
                    throw new WrongInputException("Wrong row provided " + row, board);
                if(c < 0 || c >=9)
                    throw new WrongInputException("Wrong column provided " + column, board);
                if(initialSetUp.contains(board.getBoard()[r][c]))
                    throw new WrongInputException("Cannot change initial values", board);
                if(value.equals("d")) {
                    board.delete(r, c);
                    fieldsTaken--;
                    System.out.println(board);
                    continue;
                }
                int v = Integer.parseInt(value);
                if(v < 0 || v > 9)
                    throw new WrongInputException("Wrong value provided " + value, board);
                if(board.setValue(r, c, v)) {
                    fieldsTaken++;
                    System.out.println(board);
                } else {
                    String message = "Row: " + r + " Column: " + c + " Value: " + v;
                    throw new WrongInputException("Illegal " + message, board);
                }
            } catch(NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Wrong input");
            } catch (WrongInputException e) {
                e.printStackTrace();
            }
            if(fieldsTaken == 81) {
                System.out.println("Sudoku completed");
                break;
            }
        }
        System.out.println(solvedBoard);
    }

    public Board getBoard() {
        return board;
    }
}
