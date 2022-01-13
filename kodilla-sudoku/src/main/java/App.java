
public class App {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        System.out.println(sudoku.getBoard());
        System.out.println("\n \n");
        sudoku.start();
    }
}
