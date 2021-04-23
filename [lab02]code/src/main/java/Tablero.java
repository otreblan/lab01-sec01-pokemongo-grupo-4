import java.util.List;
import java.util.Scanner;

public class Tablero {
    public int getCant() {
        Scanner scannerObj = new Scanner(System.in);
        Integer num_pokemones = scannerObj.nextInt();
        System.out.printf("Inserta la cantidad de Pokemones:\n");
        while(num_pokemones<4){
            num_pokemones = scannerObj.nextInt();
        }
        return num_pokemones;
    };  //Obtiene la cantidad de Pokemones
    public void setCant(int cant) {

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
