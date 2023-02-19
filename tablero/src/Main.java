public class Main {
    public static void main(String[] args) throws InterruptedException {
        Board board = new Board(50);
        board.addPlayer("Red", 6);
        board.addPlayer("Blue", 6);
        board.addPlayer("Green", 6);
        board.addPlayer("Yellow", 6);
        board.startGame();
    }
}