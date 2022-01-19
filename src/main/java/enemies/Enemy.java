package enemies;

public abstract class Enemy {

    private int hp;

    public Enemy(int hp){
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void takeDamage(){

    }

}
