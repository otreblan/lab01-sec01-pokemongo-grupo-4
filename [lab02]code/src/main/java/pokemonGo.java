import java.util.logging.Logger;
import java.util.List;

public class pokemonGo {

    static final Logger logger = Logger.getLogger(pokemonGo.class.getName());

    public static void main(String[] args){
        logger.info("CS-UTEC Software Engineering I");

        Tablero tablero = new Tablero();

        tablero.imprimirPokemones();

        System.out.printf("Pokemones que colisionaron:\n");
        List<Pokemon> colisiones = tablero.getListaConColisiones();
        for(int i=0; i<colisiones.size(); i++){
            System.out.println(colisiones.get(i).getId() + " " + colisiones.get(i));
        }

    }

}
