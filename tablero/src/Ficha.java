public class Ficha {
    String color;
    int posicion;
    Dado dado;

    public Ficha(String color, int carasDado){
        this.color = color;
        this.dado = new Dado(carasDado);
        this.posicion = 0;
    }

    public void avanzar(){
        this.posicion += dado.lanzar();
    }

    public String infoFicha(){
        String str = "> COLOR: " + color;
        str += "\n> DADO: " + dado.caras + " caras";
        return str;
    }
}
