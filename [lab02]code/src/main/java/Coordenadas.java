import java.util.Random;

public class Coordenadas{
    public int alto;
    public int ancho;

    public Coordenadas(int alto,int ancho){
        this.alto = alto;
        this.ancho = ancho;
    }

    public static Coordenadas RandomCoord(){
        Random random = new Random();
        return new Coordenadas(random.nextInt(Tablero.HEIGHT), random.nextInt(Tablero.WIDTH));
    }
}
