
public class WrongInputException extends Exception {
    public WrongInputException(String message, Board board) {
        super(message);
        System.out.println(board);
    }
}
