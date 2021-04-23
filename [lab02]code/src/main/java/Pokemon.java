public class Pokemon {
    int hp;
    char id;

    public Pokemon(char id) {
        this.hp = 3;
        this.id = id;
    }

    public Pokemon() {
        this((char)('A' + (int)Math.random()*('Z' - 'A')));
    }
}
