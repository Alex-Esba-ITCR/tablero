import java.util.Random;

public class Dado {
    int caras;

    public Dado(int caras) {
        this.caras = caras;
    }

    public int lanzar() {
        Random rn = new Random();
        return rn.nextInt(1, caras);
    }
}
