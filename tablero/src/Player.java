public class Player {
    // Instance variables
    private String color;
    private int position;
    private Dice dice;

    // Constructor
    public Player(String color, int position, int diceSides){
        this.color = color;
        this.position = position;
        this.dice = new Dice(diceSides);
    }

    // Methods
    public int move(){
        int diceRoll = dice.roll();
        position += diceRoll;
        return diceRoll;
    }

    // Getters and setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }

    public Dice getDice() {
        return dice;
    }
    public void setDice(int diceSides) {
        this.dice = new Dice(diceSides);
    }

    // toString
    @Override
    public String toString() {
        return "Player [color = " + color + " | position = " + position + " | dice = " + dice + "]";
    }
}
