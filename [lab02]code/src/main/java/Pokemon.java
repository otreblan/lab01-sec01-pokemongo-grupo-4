public class Pokemon {
    private int hp;
    private char id;
    public Coordenadas coordenadas;
    public Pokemon(char id, Coordenadas coordenadas) {
        this.hp = 3;
        this.id = id;
        this.coordenadas = coordenadas;
    }

    public Pokemon() {
        this((char)('A' + (int)(Math.random()*('Z' - 'A'))), Coordenadas.RandomCoord());
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
