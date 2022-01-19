package players;

public abstract class Player {

    private String name;
    private int hp;

    public Player(String name){
        this.name = name;
        this.hp = 100;
    }

}
