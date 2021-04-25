import java.util.List;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Tablero {
    private int num_pokemones;
    private Vector<Vector<Pokemon>> matrix;
    private Queue<Pokemon> pokemonQueue;
    public final static int WIDTH = 20;
    public final static int HEIGHT = 40;

    public Tablero(int initial) {
        this.matrix = new Vector<Vector<Pokemon>>(WIDTH*HEIGHT);
        this.pokemonQueue = new ArrayDeque<Pokemon>();
        for(int i = 0; i < WIDTH*HEIGHT; i++) {
            this.matrix.add(new Vector<Pokemon>());
        }
        this.num_pokemones = 0;

        for(int i = 0; i < initial; i++) {
            registrarPokemon(new Pokemon());
        }

        pintarPokemons();
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
        Integer num = 0;
        while(num<4){
            System.out.printf("Inserta la cantidad de Pokemones (+4):\n");
            num = scannerObj.nextInt();
        }
        this.num_pokemones = num;
    }; //Setea la cantidad de Pokemones
    void imprimirPokemones() {//Imprime los Pokemones que se encuentran en el tablero
        for(int i = 0; i < HEIGHT; i++) {
            for(int j = 0; j < WIDTH ; j++) {
                Vector<Pokemon> cell = matrix.get(i*WIDTH+j);

                if(cell.isEmpty()) {
                    System.out.print('.');
                }
                else {
                    System.out.print(cell.lastElement().getId());
                }

                System.out.print(' ');
            }
            System.out.print('\n');
        }
    }
    void pintarPokemons(){ //Ubica a los Pokemones en el tablero de acuerdo a sus coordenadas
        while(!pokemonQueue.isEmpty())
        {
            Pokemon pokemon = pokemonQueue.remove();
            Vector<Pokemon> vector = matrix.get(pokemon.coordenadas.alto*WIDTH+pokemon.coordenadas.ancho);

            for(Pokemon foe : vector)
            {
                foe.fight(pokemon);
            }
            vector.add(pokemon);
            num_pokemones++;
        }
    }
    void reDibujarTablero(){ //Reimprime el tablero con los Pokemones
        imprimirPokemones();
    }
    public void registrarPokemon(Pokemon pokemon){ //Registrar los Pokemones
        pokemonQueue.add(pokemon);
    }
    void setListPokemon(List<Pokemon> _listPokemon){ //Setea una lista de Pokemones en el tablero
        for (Pokemon pokemon : _listPokemon) {
            registrarPokemon(pokemon);
        }
    }
    List<Pokemon> getListaConColisiones() { //Obtiene una lista con los Pokémones que colisionaron
        List<Pokemon> list = new ArrayList<Pokemon>();
        for(int i = 0; i < WIDTH*HEIGHT; i++)
        {
            Vector<Pokemon> cell = matrix.get(i);
            if(cell.size() > 1) {
                for(Pokemon pokemon: cell) {
                    list.add(pokemon);
                }
            }
        }
        return list;
    }
}
