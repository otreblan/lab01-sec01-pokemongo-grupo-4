# CS2901 - [Lab2] Pokemon Go

## Objetivos  :dart:
Al finalizar este laboratorio, estarás en la capacidad de:
- Familiarizarse con el lenguaje de programación ```JAVA```.
- Gestionar dependencias utilizando maven `(nivel 2)`.
- Comprender la importancia de la calidad de software `(nivel 1)`.
- Trabajar eficazmente en equipo `(nivel 2)`.


## Introducción :ramen:
Pokémon GO es un videojuego de realidad aumentada basado en la localización desarrollado por Niantic, Inc.  El juego consiste en desplazarse por la ciudad con el objetivo de atrapar y coleccionar personajes de la saga Pokémon.
Los Pokemones solo aparecen en lugares específicos y usando la información del GPS, la aplicación se asegura que los jugadores estén efectivamente en el lugar de aparición antes de que puedan atrapar a los Pokemones.
Dado el éxito del juego, los desarrolladores de Pokemones GO están buscando formas de optimizar la aparición de Pokemones. Cuando el juego inicia aparecen 4 a 6 Pokemones de forma automática en coordenadas aleatorias como se muestra en la imagen.

<p align="center">
<img src="https://cdn.computerhoy.com/sites/navi.axelspringer.es/public/styles/1200/public/media/image/2016/07/182700-servidores-pokemon-go-caidos-ataque-ddos.jpg?itok=xxNU6IPT" width="60%">
</p>

## Instrucciones  :page_facing_up:
Usando lenguaje de programación JAVA. Modele el juego de Pokémon GO considerando lo siguiente:
- La ubicación del Pokémon está determinada por la clase *Coordenada* (atributos latitud y longitud).
- En la clase *Tablero* se genera el mapa (o plano) que es representado en una matriz de 20 x 40. 
- De 4 a más Pokemones aparecen de forma aleatoria (asuma que no estarán en la misma ubicación), la cantidad de Pokemones es parametrizable.
- Si dos Pokémones colisionan ambos pierden una vida (considere usar el atributo Vida de la clase *Pokemon*) y asuma que cada Pokémon inicia con 3 vidas. Imprima los que colisionan. 
- Se debe conocer los Pokemones que se encuentran en el plano, imprímalos. 

### Estructura del proyecto :european_castle:
Considere implementar las siguientes funciones distribuidas entre los 5/6 integrantes del equipo:
```
int getCant() const;  //Obtiene la cantidad de Pokemones
void setCant(int cant); //Setea la cantidad de Pokemones
static int getAltura(); // Obtiene la altura del tablero
static int getAncho(); //Obtiene el ancho del tablero
void imprimirPokemones(); //Imprime los Pokemones que se encuentran en el tablero
void pintarPokemons(); //Ubica a los Pokemones en el tablero de acuerdo a sus coordenadas
void reDibujarTablero(); //Reimprime el tablero con los Pokemones
void registrarPokemon(); //Registrar los Pokemones
void setListPokemon(Pokemon *_listPokemon); //Setea una lista de Pokemones en el tablero
```

:warning: Los equipos con 6 integrantes también deberán implementar la siguiente función:
```
List<Pokemon> getListaConColisiones(); //Obtiene una lista con los Pokémones que colisionaron
```

## Ten en cuenta lo siguiente  :rocket:
### Build
Este comando te permite construir la aplicación compilando el codigo fuente del proyecto

```
mvn compile
```

### Run
Usando este comando podrás ejecutar la aplicación construída en el punto anterior.
```
mvn exec:java -Dexec.mainClass="<MainClassName>"
```

