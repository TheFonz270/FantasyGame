package components.familiars;

import behaviours.IDefend;

public abstract class Familiars implements IDefend {

    private String name;
    private int hp;

    public Familiars(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void defend(int attack){
        this.hp -= attack;
    }
}
