import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Tablero {
    private int num_pokemones;
    private Vector<Vector<Pokemon>> matrix;
    private final static int WIDTH = 20;
    private final static int HEIGHT = 40;

    public Tablero(int initial) {
        this.matrix = new Vector<Vector<Pokemon>>(WIDTH*HEIGHT);
    }

    public Tablero() {
        this(4);
    }
    public static int getAltura(){
        return WIDTH;
    } // Obtiene la altura del tablero
    public static int getAncho(){
        return HEIGHT;
    } //Obtiene el ancho del tablero

    public int getCant() {
        return this.num_pokemones;
    };  //Obtiene la cantidad de Pokemones
    public void setCant(int cant) {
        Scanner scannerObj = new Scanner(System.in);
        Integer num_pokemones = scannerObj.nextInt();
        System.out.printf("Inserta la cantidad de Pokemones:\n");
        while(num_pokemones<4){
            num_pokemones = scannerObj.nextInt();
        }
        this.num_pokemones = num_pokemones;
    }; //Setea la cantidad de Pokemones
    //static int getAltura(); // Obtiene la altura del tablero
    //static int getAncho(); //Obtiene el ancho del tablero
    //void imprimirPokemones(); //Imprime los Pokemones que se encuentran en el tablero
    //void pintarPokemons(); //Ubica a los Pokemones en el tablero de acuerdo a sus coordenadas
    //void reDibujarTablero(); //Reimprime el tablero con los Pokemones
    //void registrarPokemon(); //Registrar los Pokemones
    //void setListPokemon(Pokemon *_listPokemon); //Setea una lista de Pokemones en el tablero
    //List<Pokemon> getListaConColisiones(); //Obtiene una lista con los Pokémones que colisionaron
}
