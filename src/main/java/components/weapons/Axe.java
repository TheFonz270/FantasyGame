package components.weapons;

import behaviours.IWeapon;

public class Axe extends Weapons {

    public Axe(String name, int damage){
        super(name, damage);
    }

    public int attack(){
        return 0;
    }
}
