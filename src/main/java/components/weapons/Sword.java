package components.weapons;

import behaviours.IWeapon;

public class Sword extends Weapons {

    public Sword(String name, int damage){
        super(name, damage);
    }

    public int attack(){
        return 0;
    }
}
