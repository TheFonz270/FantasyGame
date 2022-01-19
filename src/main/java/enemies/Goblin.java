package enemies;

public class Goblin extends Enemy{

    private int hp;

    public Goblin(int hp){
        super(hp);
    }

    public void takeDamage(int damage){
        this.hp -= damage;
    }

    public int attack(){
        return 5;
    }
}
