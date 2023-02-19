public class Dice {
    // Instance variables
    private int sides;

    // Constructor
    public Dice(int sides) {
        this.sides = sides;
    }

    // Methods
    public int roll() {
        return (int) (Math.random() * sides) + 1;
    }

    // Getters and setters
    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    // toString
    @Override
    public String toString() {
        return "Dice [sides = " + sides + "]";
    }

}
