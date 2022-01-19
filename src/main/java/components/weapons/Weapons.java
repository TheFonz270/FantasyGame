package components.weapons;

import behaviours.IWeapon;

public abstract class Weapons implements IWeapon {

    private String name;
    private int damage;

    public Weapons(String name, int damage){
        this.name = name;
        this.damage = damage;
    }
}
