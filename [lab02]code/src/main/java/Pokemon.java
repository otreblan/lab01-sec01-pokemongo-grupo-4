public class Pokemon {
    private int hp;
    private char id;
    public Coordenadas coordenadas;
    public static String name;
    public static String type;
    public Pokemon(char id) {
        this.hp = 3;
        this.id = id;
    }

    public Pokemon() {
        this((char)('A' + (int)(Math.random()*('Z' - 'A'))));
    }

    public int getHp() {
        return hp;
    }

    public char getId() {
        return id;
    }

    public void fight(Pokemon foe) {
        this.hp--;
        foe.hp--;
    }
}
