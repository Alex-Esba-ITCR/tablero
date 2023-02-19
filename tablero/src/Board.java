import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Board {
    // Instance variables
    private int boxes;
    private ArrayList<Player> players;

    // Constructor
    public Board(int boxes){
        this.boxes = boxes;
        this.players = new ArrayList<Player>();
    }

    // Methods
    public void addPlayer(String color, int diceSides){
        players.add(new Player(color, 0, diceSides));
    }
    public void removePlayer(String color){
        for (Player player : players) {
            if (player.getColor().equals(color)) {
                players.remove(player);
                break;
            }
        }
    }

    public void startGame() throws InterruptedException {
        int turn = 1;
        while (true) {
            System.out.println("\n------ TURN " + turn++ + " ------");
            for (Player player : players) {
                String str = player.getColor() + " rolled a " + player.move() + " and moves to box " + player.getPosition();
                System.out.println(str);
                if (player.getPosition() >= boxes) {
                    System.out.println("\n------ GAME OVER ------");
                    System.out.println(player.getColor() + " reaches the finish line!");
                    System.out.println("-----------------------");
                    return;
                }
            }
            TimeUnit.SECONDS.sleep(1);
        }
    }

    // Getters and setters
    public int getBoxes() {
        return boxes;
    }
    public void setBoxes(int boxes) {
        this.boxes = boxes;
    }
    public ArrayList<Player> getPlayers() {
        return players;
    }

    // toString
    @Override
    public String toString() {
        return "Board [boxes = " + boxes + " | players = " + players + "]";
    }
}
